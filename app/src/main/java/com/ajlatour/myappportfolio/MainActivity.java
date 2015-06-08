package com.ajlatour.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void spotifyClick(View view) {
        makeToast(getApplicationContext(), "You've clicked on Spotify Streamer", Toast.LENGTH_SHORT);
    }

    public void scoresClick(View view) {
        makeToast(getApplicationContext(), "You've clicked on Scores App", Toast.LENGTH_SHORT);
    }

    public void libraryClick(View view) {
        makeToast(getApplicationContext(), "You've clicked on Library App", Toast.LENGTH_SHORT);
    }

    public void buildItClick(View view) {
        makeToast(getApplicationContext(), "You've clicked on Build It Bigger", Toast.LENGTH_SHORT);
    }

    public void xyzClick(View view) {
        makeToast(getApplicationContext(), "You've clicked on XYZ Reader", Toast.LENGTH_SHORT);
    }

    public void capstoneClick(View view) {
        makeToast(getApplicationContext(), "You've clicked on Capstone: My Own App", Toast.LENGTH_SHORT);
    }

    public void makeToast(Context context, CharSequence text,int duration) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
