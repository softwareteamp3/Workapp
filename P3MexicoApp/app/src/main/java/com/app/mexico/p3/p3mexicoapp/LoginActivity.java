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

        bMain = (Button) findViewById(R.id.button1);

        bMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
                Intent iMain = new Intent(this, MainActivity.class);
                startActivity(iMain);


    }
}
