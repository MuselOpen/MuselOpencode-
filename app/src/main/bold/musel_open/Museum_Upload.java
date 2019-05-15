package com.bold.musel_open;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Museum_Upload extends AppCompatActivity {

    GridView gridView;

    String [] museum_names = {"Museum One", "Museum Two","Museum Three","Museum Four", "Museum Five", "Museum Six", "Museum Seven", "Museum Eight"};
    int [] images = {R.drawable.mus1, R.drawable.mus2, R.drawable.mus3, R.drawable.mus4, R.drawable.mus5, R.drawable.mus6, R.drawable.mus6, R.drawable.mus7,R.drawable.mus8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum__upload);

        gridView = findViewById(R.id.grids);

        MainAdapter adapter = new MainAdapter(Museum_Upload.this, museum_names, images);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Museum_Upload.this, "Upload to " + museum_names[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void finish (){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
