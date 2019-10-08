package com.rizki3012.digitalmarketingtactics;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutParticipantActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_participant);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About Participant");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
