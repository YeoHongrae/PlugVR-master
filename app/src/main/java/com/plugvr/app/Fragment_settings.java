package com.plugvr.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.plugvr.app.plugvr.R;

public class Fragment_settings extends Fragment {

    public Fragment_settings()
    {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        ConstraintLayout layout = (ConstraintLayout) inflater.inflate(R.layout.fragment_setting, container, false);

        ListView lvSetting = (ListView) layout.findViewById(R.id.lvSetting);

        SettingAdapter adapter = new SettingAdapter();
        lvSetting.setAdapter(adapter);

        int[] iconList = {R.drawable.ic_lock_black_24dp, R.drawable.ic_add_alert_black_24dp};





        adapter.addItem(getResources().getDrawable(R.drawable.ic_lock_black_24dp), "aa");
        adapter.addItem(getResources().getDrawable(R.drawable.ic_add_alert_black_24dp), "aa");

        return layout;

    }
}
