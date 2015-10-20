package com.colleen.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our View variables
        final TextView factLabel = (TextView) findViewById(R.id.funFact);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout =  (RelativeLayout) findViewById(R.id.didYouKnow);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();

                //Update the label with our dynamic fact
                factLabel.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);
    }
}

