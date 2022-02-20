package com.example.tasbeeh_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv1;
    int n=0;
    int t=0;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) this.findViewById(R.id.textView);
        tv1=(TextView) this.findViewById(R.id.textView2);
    }

    public void clickTF(View view) {
        if(n==0)
        {
            n=1;
            tv.setText("Say Subhan Allah");
            t=0;
            tv1.setText(Integer.toString(t));
        }
        else
        {
            Toast to = Toast.makeText(this, "First complete previous tasbeeh or reset the counter", Toast.LENGTH_LONG);
            to.show();
        }

    }

    public void clickFK(View view)  {
        if(n==0)
        {
            n=2;
            tv.setText("Say First Kalma");
            t=0;
            tv1.setText(Integer.toString(t));
        }
        else
        {
            Toast to = Toast.makeText(this, "First complete previous tasbeeh or reset the counter", Toast.LENGTH_LONG);
            to.show();
        }

    }

    public void clickA(View view)  {
        if(n==0)
        {
            n=3;
            tv.setText("Say Astaghfar");
            t=0;
            tv1.setText(Integer.toString(t));
        }

        else
        {
            Toast to = Toast.makeText(this, "First complete previous tasbeeh or reset the counter", Toast.LENGTH_LONG);
            to.show();
        }
    }

    public void clickD(View view)  {
        if(n==0)
        {
            n=4;
            tv.setText("Say Darood Shareef");
            t=0;
            tv1.setText(Integer.toString(t));
        }
        else
        {
            Toast to = Toast.makeText(this, "First complete previous tasbeeh or reset the counter", Toast.LENGTH_LONG);
            to.show();
        }


    }

    public void clickAk(View view)  {
        if(n==0)
        {
            n=5;
            tv.setText("Say Ayat E Kareema");
            t=0;
            tv1.setText(Integer.toString(t));
        }

        else
        {
            Toast to = Toast.makeText(this, "First complete previous tasbeeh or reset the counter", Toast.LENGTH_LONG);
            to.show();
        }

    }


    public void clickR(View view)  {
        tv.setText("Select Tasbeeh");
        n=0;
        t=0;
        tv1.setText(Integer.toString(t));
    }


    public void clickC(View view) {
        if(n==1)
        {
            if(c==0&&t<33)
            {
                t++;
                tv1.setText(Integer.toString(t));
            }
            else if(c==0&&t>=33)
            {
                tv.setText("Say Alhamdulilah");
                c++;
                t=0;
                tv1.setText(Integer.toString(t));
            }
            else if(c==1&&t<33)
            {
                t++;
                tv1.setText(Integer.toString(t));
            }
            else if(c==1&&t>=33)
            {
                tv.setText("Say Allah O Akbar");
                c++;
                t=0;
                tv1.setText(Integer.toString(t));
            }
            else if(c==2&&t<34)
            {
                t++;
                tv1.setText(Integer.toString(t));
            }
            else
            {
                Toast to = Toast.makeText(this, "Tasbeeh finished", Toast.LENGTH_LONG);
                to.show();
                tv.setText("Select Tasbeeh");
                n=0;
                t=0;
                tv1.setText(Integer.toString(t));
            }
        }
        else if(n==0)
        {
            Toast to = Toast.makeText(this, "First select Tasbeeh", Toast.LENGTH_LONG);
            to.show();
        }
        else
        {
            t+=1;
            if(t<=100)
            {
                tv1.setText(Integer.toString(t));
            }
            else
            {
                Toast to=Toast.makeText(this,"Tasbeeh finished",Toast.LENGTH_LONG);
                to.show();
                tv.setText("Select Tasbeeh");
                n=0;
                t=0;
                tv1.setText(Integer.toString(t));
            }
        }
    }
}
