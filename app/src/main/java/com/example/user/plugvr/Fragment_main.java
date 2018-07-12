package com.example.user.plugvr;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Fragment_main extends android.support.v4.app.Fragment {

    public Fragment_main() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView)  layout.findViewById(R.id.lvMain);

        MainAdapter mainAdapter = new MainAdapter();
        listView.setAdapter(mainAdapter);

        mainAdapter.addItem(R.drawable.ic_button_blue, "Sample Name", "Sample Description");
        mainAdapter.addItem(R.drawable.ic_button_blue, "Sample Name", "Sample Description");
        mainAdapter.addItem(R.drawable.ic_button_blue, "Sample Name", "Sample Description");

        return layout;

    }

}




