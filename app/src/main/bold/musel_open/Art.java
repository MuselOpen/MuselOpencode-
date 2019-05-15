package com.bold.musel_open;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Art extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
    }
    public void artbuttons (View view){
        switch (view.getId()){
            case R.id.backbutton:
                Intent intentback = new Intent(Art.this, TimeLine.class);
                startActivity(intentback);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.saveButton:
                Toast.makeText(this, "Save to collection", Toast.LENGTH_SHORT).show();
                break;
            case R.id.collectionbutton:
                Toast.makeText(this, "View collection", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonReadmore:
                Toast.makeText(this, "Read More", Toast.LENGTH_SHORT).show();
                break;
                default:
        }

    }
    public void finish (){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
