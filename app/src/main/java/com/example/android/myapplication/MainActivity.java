package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Build a Layout and a button. Just objects in memory at this point
        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);



        // Modify some button attributes
        myButton.setText("Click!");
        myButton.setBackgroundColor(Color.RED);

        // Modify some layout attributes
        myLayout.setBackgroundColor(Color.BLUE);

        // Do some positioning

        //Build a Layout for the button to live in.
        //This is a layout that will wrap the content of whatever is placed inside it.
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Anything that applies the buttonDetails object will follow these rules
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Display the layout for the user (empty right now)
        setContentView(myLayout);

        //Add the button to the layout
        //Passing two objects to the .addView() method. The button, and the rules via buttonDetails.
        myLayout.addView(myButton, buttonDetails);
    }
}
