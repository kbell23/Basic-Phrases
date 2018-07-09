package com.example.kevin.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void translate(View view)
    {
        // grabs the id depending on what button is clicked
        int id = view.getId();

        // makes a string to transform into the correct id string for the button
        String idString = "";
        idString = view.getResources().getResourceEntryName(id);

        // creates a resource id to grab the correct m4a file
        int resourceID = getResources().getIdentifier(idString, "raw", "com.example.kevin.basicphrases");

        // makes a media player to play the correct m4a file depending on what button is pressed
        MediaPlayer mPlayer = MediaPlayer.create(this, resourceID);
        mPlayer.start();
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
