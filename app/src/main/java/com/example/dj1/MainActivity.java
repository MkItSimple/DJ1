package com.example.dj1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private static final String TAG = "MainActivity";

    Button addScoreButton, resetScoreButton;
    TextView scoreTextView;

    ScoreViewModel scoreViewModel;

    @Inject
    @Named("get_first_name")
    String getFirstName;

    ViewModelProviderFactory providerFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreatedd: " + getFirstName);

        scoreTextView = findViewById(R.id.scoreTextView);
        addScoreButton = findViewById(R.id.addScoreButton);
        resetScoreButton = findViewById(R.id.resetScoreButton);

//        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        scoreViewModel = ViewModelProviders.of(this,providerFactory).get(ScoreViewModel.class);

        scoreViewModel.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                Log.i(TAG, "onChanged: ");
                scoreTextView.setText(String.valueOf(integer));
            }
        });

        addScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore();
            }
        });

        resetScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
            }
        });


    }

    public void addScore() {
        scoreViewModel.addScore();
    }

    public void resetScore() {
        scoreViewModel.resetScore();
    }
}
