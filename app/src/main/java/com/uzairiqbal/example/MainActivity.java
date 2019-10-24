package com.uzairiqbal.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uzairiqbal.circulartimerview.CircularTimerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircularTimerView progressBar = (CircularTimerView) findViewById(R.id.progress_circular);
        progressBar.setProgress(10);
    }
}
