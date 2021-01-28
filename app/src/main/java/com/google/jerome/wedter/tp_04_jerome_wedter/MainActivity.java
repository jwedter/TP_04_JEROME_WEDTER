package com.google.jerome.wedter.tp_04_jerome_wedter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "La méthode onCreate est appelée");
        setContentView(R.layout.activity_main);
        changeButton();
    }
    protected void onStart() {

        super.onStart();
        Log.d(TAG, "La méthode onStart est appelée");
    }

    protected void onRestart() {

        super.onRestart();
        Log.d(TAG, "La méthode onRestart est appelée");
    }

    protected void onResume() {

        super.onResume();
        Log.d(TAG, "La méthode onResume est appelée");
    }

    protected void onPause() {

        super.onPause();
        Log.d(TAG, "La méthode onPause est appelée");
    }


    protected void onStop() {

        super.onStop();
        Log.d(TAG, "La méthode onStop est appelée");
    }

    protected void onDestroy() {

        super.onDestroy();
        Log.d(TAG, "La méthode onDestroy est appelée");
    }



    public void changeButton(){
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}