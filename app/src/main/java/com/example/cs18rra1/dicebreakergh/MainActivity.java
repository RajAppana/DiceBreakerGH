package com.example.cs18rra1.dicebreakergh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void on_button_click(View view){


        TextView tv = (TextView) this.findViewById(R.id.numberTextView);       //creating relevant text fields for manipulation
        TextView sv = (TextView) this.findViewById(R.id.scoreTextView);
        TextView cv = (TextView) this.findViewById(R.id.congratulationsTextView);
        EditText ev = (EditText) this.findViewById(R.id.enteredvalueTextView);

        int number_entered = Integer.parseInt(ev.getText().toString());

        Random r = new Random();
        int number = r.nextInt(6)+1;                    //random number generator for dice roll (the +1 is to ensure that 0 does not come up as 0 is not on a dice

        if (number_entered == number)                       //successful/unsuccessful guess logic parameters
        {
            cv.setText("Congratulations :)");
            score++;
        } else
        {
            cv.setText("Good luck next time!");
        }

        ev.setText(Integer.toString(number_entered));       //outputs (displayed regardless of correct/incorrect guess
        tv.setText(Integer.toString(number));
        sv.setText(Integer.toString(score));
    }

    public void on_button_click_DICEBREAKER(View view) {

        Random r2 = new Random();
        int DICEBREAKER_number = r2.nextInt(6)+1;
        TextView ql = (TextView) this.findViewById(R.id.questionlist);

        switch (DICEBREAKER_number)
        {
            case 1:
                ql.setText("If you could go anywhere in the world where would you go?");
             break;

            case 2:
                ql.setText("If you were stranded on a desert island what three things would you take with you?");
             break;
            case 3:
                ql.setText("If you could only eat one food for the rest of your life what would that be?");
             break;
            case 4:
                ql.setText("If you won a million dollars what is the first thing you would buy?");
             break;
            case 5:
                ql.setText("If you could spend one day with a fictional character would it be?");
             break;
            case 6:
                ql.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish for?");
             break;
        }
    }
}