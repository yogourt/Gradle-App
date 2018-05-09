package com.example.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String KEY_JOKE = "key_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTv = findViewById(R.id.joke_text_view);

        String jokeString = getIntent().getStringExtra(KEY_JOKE);
        jokeTv.setText(jokeString);
    }
}
