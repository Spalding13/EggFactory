package com.example.android.eggfactory.data;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class EggPartAdapter extends BaseAdapter {
    private Context mContext;
    private List<Integer> mList = EggResourceFetcher.getAllParts();

    // Gets the context so it can be used later
    public EggPartAdapter(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return EggResourceFetcher.getAllParts().size();
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mList.get(position));
        return imageView;
    }
}
