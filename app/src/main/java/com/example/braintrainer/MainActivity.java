package com.example.braintrainer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;
    Button a6;
    Button a7;
    Button a8;
    Button a9;
    Button again;
    int a,b,correct;
    int array[]=new int[9];
    int chance=0;
    int right=0;



    public void chooseAns(View view)
    {

        TextView result =(TextView) findViewById(R.id.result);
        TextView score =(TextView) findViewById(R.id.score);
        if(Integer.toString(correct).equals(view.getTag().toString()))
        {
            result.setText("Correct");
            result.setVisibility(View.VISIBLE);
            right++;
            chance++;
            score.setText(Integer.toString(right)+"/"+Integer.toString(chance));
            score.setVisibility(View.VISIBLE);
            set();

        }
        else
        {
            chance++;
            result.setText("Wrong");
            result.setVisibility(View.VISIBLE);
            score.setText(Integer.toString(right)+"/"+Integer.toString(chance));
            score.setVisibility(View.VISIBLE);
            set();

        }

    }
    public void again(View view)
    {
        right=0;
        chance=0;
        again.setVisibility(View.INVISIBLE);
       set();
        new CountDownTimer(60000,1000)
        {
            TextView timer = (TextView) findViewById(R.id.timer);
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText(Long.toString(millisUntilFinished/1000)+"s");
                timer.setVisibility(View.VISIBLE);

            }

            @Override
            public void onFinish() {
                again = findViewById(R.id.again);
                timer.setText("0s");
                again.setVisibility(View.VISIBLE);
                TextView result =(TextView) findViewById(R.id.result);
                TextView ans =(TextView) findViewById(R.id.ans);
                ans.setVisibility(View.INVISIBLE);
                result.setVisibility(View.INVISIBLE);



            }
        }.start();


    }



    public void start(View view)
    {
        Button go = findViewById(R.id.go);
        go.setVisibility(View.INVISIBLE);
        set();


       new CountDownTimer(60000,1000)
       {
           TextView timer = (TextView) findViewById(R.id.timer);
           @Override
           public void onTick(long millisUntilFinished) {
               timer.setText(Long.toString(millisUntilFinished/1000)+"s");
               timer.setVisibility(View.VISIBLE);

           }

           @Override
           public void onFinish() {
               again = findViewById(R.id.again);
               timer.setText("0s");
               again.setVisibility(View.VISIBLE);
               TextView result =(TextView) findViewById(R.id.result);
               TextView ans =(TextView) findViewById(R.id.ans);
               ans.setVisibility(View.INVISIBLE);
               result.setVisibility(View.INVISIBLE);



           }
       }.start();


    }
      void set()
      {
           a1 = findViewById(R.id.a1);
           a2 = findViewById(R.id.a2);
           a3 = findViewById(R.id.a3);
           a4 = findViewById(R.id.a4);
           a5 = findViewById(R.id.a5);
           a6 = findViewById(R.id.a6);
           a7 = findViewById(R.id.a7);
           a8 = findViewById(R.id.a8);
           a9 = findViewById(R.id.a9);
          Random rand = new Random();
          a=0;
         b=0;

          while(a==0||b==0)
          {

              a = rand.nextInt(20);
              b = rand.nextInt(20);
          }
          TextView ans = (TextView) findViewById(R.id.ans);
          ans.setText(Integer.toString(a)+" * "+ Integer.toString(b));
          ans.setVisibility(View.VISIBLE);

           correct=rand.nextInt(9);
          //int array[]= new int[9];
          array[correct]=a*b;
          for(int i=0;i<9;i++)
          {
              if(i!=correct)
              {
                  int c=rand.nextInt(400);
                  while(c==a*b)
                  {
                      c=rand.nextInt(400);
                  }
                  array[i]=c;



              }

          }

          a1.setText(Integer.toString(array[0]));
          a2.setText(Integer.toString(array[1]));
          a3.setText(Integer.toString(array[2]));
          a4.setText(Integer.toString(array[3]));
          a5.setText(Integer.toString(array[4]));
          a6.setText(Integer.toString(array[5]));
          a7.setText(Integer.toString(array[6]));
          a8.setText(Integer.toString(array[7]));
          a9.setText(Integer.toString(array[8]));
          TextView score = (TextView) findViewById(R.id.score);
          score.setText(Integer.toString(right)+"/"+Integer.toString(chance));
          score.setVisibility(View.VISIBLE);
          a1.setVisibility(View.VISIBLE);
          a2.setVisibility(View.VISIBLE);
          a3.setVisibility(View.VISIBLE);
          a4.setVisibility(View.VISIBLE);
          a5.setVisibility(View.VISIBLE);
          a6.setVisibility(View.VISIBLE);
          a7.setVisibility(View.VISIBLE);
          a8.setVisibility(View.VISIBLE);
          a9.setVisibility(View.VISIBLE);

      }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a1 = findViewById(R.id.a1);
        a1.setVisibility(View.INVISIBLE);
        Button a2 = findViewById(R.id.a2);
        a2.setVisibility(View.INVISIBLE);
        Button a3 = findViewById(R.id.a3);
        a3.setVisibility(View.INVISIBLE);
        Button a4 = findViewById(R.id.a4);
        a4.setVisibility(View.INVISIBLE);
        Button a5 = findViewById(R.id.a5);
        a5.setVisibility(View.INVISIBLE);
        Button a6 = findViewById(R.id.a6);
        a6.setVisibility(View.INVISIBLE);
        Button a7 = findViewById(R.id.a7);
        a7.setVisibility(View.INVISIBLE);
        Button a8 = findViewById(R.id.a8);
        a8.setVisibility(View.INVISIBLE);
        Button a9 = findViewById(R.id.a9);
        a9.setVisibility(View.INVISIBLE);
        Button again = findViewById(R.id.again);
        again.setVisibility(View.INVISIBLE);
        TextView result =(TextView) findViewById(R.id.result);
        TextView score =(TextView) findViewById(R.id.score);
        TextView timer =(TextView) findViewById(R.id.timer);
        result.setVisibility(View.INVISIBLE);
        score.setVisibility(View.INVISIBLE);
        timer.setVisibility(View.INVISIBLE);
        TextView ans = (TextView) findViewById(R.id.ans);
        ans.setVisibility(View.INVISIBLE);






    }
}
