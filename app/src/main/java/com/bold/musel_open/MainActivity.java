package com.bold.musel_open;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void homeButtons (View view){
        switch (view.getId()){

            case R.id.button:
                Intent upload = new Intent(MainActivity.this, Museum_Upload.class);
                startActivity(upload);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.button2:
                Intent timeline = new Intent(MainActivity.this, TimeLine.class);
                startActivity(timeline);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }

    }
    public void finish (){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
