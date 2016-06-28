package com.app.mexico.p3.p3mexicoapp;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;//Declaramos el Toolbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar); // Conectamos el Layout al objeto Toolbar

        // Configuración de la barra de herramientas (toolbar ) como la Barra de acciones (ActionBar)
        // con la llamada de setSupportActionBar ()
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent upIntent = NavUtils.getParentActivityIntent(this);
            if(NavUtils.shouldUpRecreateTask(this,upIntent)){
                TaskStackBuilder.create(this).addNextIntentWithParentStack(upIntent).startActivities();
            }else{
                NavUtils.navigateUpTo(this, upIntent);
            }
        }
        return super.onOptionsItemSelected(item);
    }
}

