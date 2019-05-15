package com.bold.musel_open;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TimeLineAdapter extends BaseAdapter {


    private Context context;
    private LayoutInflater inflater;
    private String []years;
    private int [] images;

    public TimeLineAdapter (Context c, String [] years, int [] images){

        context = c;
        this.years = years;
        this.images = images;
    }
    @Override
    public int getCount() {
        return years.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null){
            convertView = inflater.inflate(R.layout.row_timeline, null);
        }
        ImageView imageView = convertView.findViewById(R.id.image_view5);
        TextView textView = convertView.findViewById(R.id.textView5);
        imageView.setImageResource(images[position]);
        textView.setText(years[position]);
        return convertView;
    }
}
