package com.app.mexico.p3.p3mexicoapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CheckIn extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
    }


    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Revision:
                Intent Revision = new Intent(this, Revision.class);
                startActivity(Revision);
        }
    }



}
