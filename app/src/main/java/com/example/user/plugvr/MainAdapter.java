package com.example.user.plugvr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 2018-07-12.
 */

public class MainAdapter extends BaseAdapter {

    private ArrayList<MainListViewItem> MainItemList = new ArrayList<MainListViewItem>();

    public MainAdapter(){

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return MainItemList.get(position);
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
            convertView = inflater.inflate(R.layout.listview_root_main, parent, false);
        }

        ImageView ivAppImage = convertView.findViewById(R.id.ivAppImage);
        TextView tvAppName = convertView.findViewById(R.id.tvAppName);
        TextView tvAppDescript = convertView.findViewById(R.id.tvAppDescript);
        final ImageView ivOption = convertView.findViewById(R.id.ivOption);

        ivOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: '설치하기'또는 '제거하기' 옵션메뉴 뜨게
            }
        });

        return convertView;
    }


    public void addItem(int pic, String appName, String appDescript){
        MainListViewItem item = new MainListViewItem();

        item.setIvAppImage(pic);
        item.setTvAppName(appName);
        item.setTvAppDescript(appDescript);

        MainItemList.add(item);
    }
}
