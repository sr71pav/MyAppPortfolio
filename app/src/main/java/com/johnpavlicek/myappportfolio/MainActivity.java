package com.johnpavlicek.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSpotify(View view)
    {
        showToast(getText(R.string.action_spotify).toString());
    }

    public void onClickScore(View view)
    {
        showToast(getText(R.string.action_score).toString());
    }

    public void onClickLibrary(View view)
    {
        showToast(getText(R.string.action_library).toString());
    }

    public void onClickBuildIt(View view)
    {
        showToast(getText(R.string.action_buildit).toString());
    }

    public void onClickReader(View view)
    {
        showToast(getText(R.string.action_reader).toString());
    }

    public void onClickCapstone(View view)
    {
        showToast(getText(R.string.action_capstone).toString());
    }

    private void showToast(String appName)
    {
        Context context = getApplicationContext();
        CharSequence text = getText(R.string.action_button_launch);
        text = text + " ";
        text = text + appName;
        text = text + " ";
        text = text + (String) getText(R.string.action_app);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
