package net.skissorswolf.podagetimer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;



public class PodAgeTimerWelcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pod_age_timer_welcome);

        int secondsDelayed = 6;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(PodAgeTimerWelcome.this, PodAgeTimerMain.class));
                finish();
            }
        }, secondsDelayed * 1000);
    }

    public void launchBrowser(View view) {
        Uri uriUrl = Uri.parse("http://urulive.guildaxis.net/?page_id=147");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
