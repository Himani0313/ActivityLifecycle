package edu.asu.msse.hjshah2.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AlertActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        button = (Button)findViewById(R.id.button_alert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Log.w(this.getClass().getSimpleName(), "onCreate method");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(this.getClass().getSimpleName(), "onRestart method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(this.getClass().getSimpleName(), "onStart method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(this.getClass().getSimpleName(), "onResume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(this.getClass().getSimpleName(), "onPause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(this.getClass().getSimpleName(), "onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(this.getClass().getSimpleName(), "onDestroy method");
    }
}
