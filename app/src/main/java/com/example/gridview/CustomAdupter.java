package com.example.gridview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdupter extends BaseAdapter {
    Activity context;
    Integer pimage[];
    String pname[];


    public CustomAdupter(Activity context,Integer[] pimage, String[] pname) {
        this.context= context;
        this.pimage = pimage;
        this.pname = pname;
    }

    @Override
    public int getCount() {
        return pimage.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.mygrid,null,true);
        ImageView image = rowview.findViewById(R.id.imageView);
        TextView textView =rowview.findViewById(R.id.textView);

        image.setImageResource(pimage[i]);
        textView.setText(pname[i]);

        return rowview;
    }
}
