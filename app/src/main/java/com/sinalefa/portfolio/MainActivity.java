package com.sinalefa.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Add listener for buttons
        ((Button)findViewById(R.id.btnMovies)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnStock)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnBigger)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnMaterial)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnUbi)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnOwn)).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnMovies)
        {
            Context context = getApplicationContext();
            CharSequence text = "Open movies!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(v.getId()==R.id.btnStock)
        {
            Context context = getApplicationContext();
            CharSequence text = "Open stock!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(v.getId()==R.id.btnBigger)
        {
            Context context = getApplicationContext();
            CharSequence text = "Open bigger!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(v.getId()==R.id.btnMaterial)
        {
            Context context = getApplicationContext();
            CharSequence text = "Open material!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(v.getId()==R.id.btnUbi)
        {
            Context context = getApplicationContext();
            CharSequence text = "Open Ubiquitous!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(v.getId()==R.id.btnOwn)
        {
            Context context = getApplicationContext();
            CharSequence text = "Open own app!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
