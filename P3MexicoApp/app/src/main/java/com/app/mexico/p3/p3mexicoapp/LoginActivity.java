package com.app.mexico.p3.p3mexicoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class LoginActivity extends AppCompatActivity implements OnClickListener {

    Button bMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bMain = (Button) findViewById(R.id.button);

        bMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                Intent iMain = new Intent(this, MainActivity.class);
                startActivity(iMain);
        }

    }
}
