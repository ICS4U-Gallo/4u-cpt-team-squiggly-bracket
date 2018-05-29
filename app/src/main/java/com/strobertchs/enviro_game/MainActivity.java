package com.strobertchs.enviro_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // extends surfaceview, where the game will be played
        setContentView(new GamePanel(this));
//
//
//        setContentView(R.layout.activity_main);
//
//        Button playBtn = (Button) findViewById(R.id.playBtn);
//        Button instructionBtn = (Button) findViewById(R.id.instructionBtn);
//
//        // make the play button take user to another screen (Activity 2)
//        playBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent startIntent = new Intent(getApplicationContext(), Handler.class);
//
//                startActivity(startIntent);
//            }
//        });
//
//        // make the instruction button take user to another screen (Activity 3)
//        instructionBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
//
////                startActivity(startIntent);
//            }
//        });

    }
}
