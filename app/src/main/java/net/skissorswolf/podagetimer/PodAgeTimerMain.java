package net.skissorswolf.podagetimer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PodAgeTimerMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pod_age_timer_main);

        timers timersObj = new timers();
        String sTime = timersObj.millisecondsToString();

        TextView txtTest = (TextView) findViewById(R.id.txtTest);

        txtTest.setText(sTime);
    }
}
