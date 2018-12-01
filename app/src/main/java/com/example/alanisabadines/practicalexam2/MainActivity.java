package com.example.alanisabadines.practicalexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    EditText Exam1;
    EditText Exam2;
    EditText TotalAve;
    Button ComputeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Exam1 = (EditText) findViewById(R.id.editText5);
        Exam2 = (EditText) findViewById(R.id.editText6);
        TotalAve = (EditText) findViewById(R.id.editText7);
        ComputeButton = (Button) findViewById(R.id.button);

        ComputeButton.setOnClickListener(new ClickButton ());



    }


    private class ClickButton implements Button.OnClickListener{

        @Override
        public void onClick(View v) {

            int x = Integer.parseInt(Exam1.getText().toString());
            int y = Integer.parseInt(Exam2.getText().toString());

            int total = (x + y)/2;

            TotalAve.setText(Integer.toString(total));

        }


    }






}
