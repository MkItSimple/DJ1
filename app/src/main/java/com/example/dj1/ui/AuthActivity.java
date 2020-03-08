package com.example.dj1.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.RequestManager;
import com.example.dj1.R;
import com.example.dj1.ViewModelProviderFactory;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    private static final String TAG = "AuthActivity";

    Button addScoreButton, resetScoreButton;
    TextView scoreTextView;

    AuthViewModel viewModel;

    @Inject
    @Named("get_first_name")
    String getFirstName;

    ViewModelProviderFactory providerFactory;

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        Log.d(TAG, "onCreatedd: " + getFirstName);

        viewModel = ViewModelProviders.of(this,providerFactory).get(AuthViewModel.class);
    }
}
