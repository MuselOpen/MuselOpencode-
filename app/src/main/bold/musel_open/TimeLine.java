package com.bold.musel_open;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class TimeLine extends AppCompatActivity {

    GridView gridView;

    String [] tmeline_years = {"1880", "1890", "1891", "1892", "1893", "1894", "1895"};
    int [] images = {R.drawable.time1, R.drawable.time2, R.drawable.time3, R.drawable.time4, R.drawable.time5, R.drawable.time6, R.drawable.time7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);

        gridView = findViewById(R.id.gridtimeline);

        TimeLineAdapter timeLineAdapter = new TimeLineAdapter (TimeLine.this, tmeline_years, images);
        gridView.setAdapter(timeLineAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(TimeLine.this, "View Timeline: "+tmeline_years[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
    
    public void timeline (View view){
        switch (view.getId()){
            case R.id.imageButton:
                Intent intentBack = new Intent(TimeLine.this, MainActivity.class);
                startActivity(intentBack);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.imageButton2:
                Intent intentArt = new Intent(TimeLine.this, Art.class);
                startActivity(intentArt);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
                default:
        }
        
    }
    public void finish (){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
