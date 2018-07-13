package com.plugvr.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.plugvr.app.plugvr.R;

import java.util.ArrayList;

public class SettingAdapter extends BaseAdapter {


    private ArrayList<SettingListViewItem> SettingItemList = new ArrayList<SettingListViewItem>();

    public SettingAdapter(){

    }

    @Override
    public int getCount() {
        return SettingItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return SettingItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Context context = parent.getContext();

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_root_setting, parent, false);
        }

        ImageView ivAppImage = convertView.findViewById(R.id.ivIcon);
        TextView tvAppName = convertView.findViewById(R.id.tvSetting);

        SettingListViewItem settingListViewItem = SettingItemList.get(position);

        ivAppImage.setImageDrawable(settingListViewItem.getIvIcon());
        tvAppName.setText(settingListViewItem.getTvSetting());

        return convertView;
    }


    public void addItem(Drawable pic, String setting){

        SettingListViewItem item = new SettingListViewItem();

        item.setIvIcon(pic);
        item.setTvSetting(setting);

        SettingItemList.add(item);
    }

}
