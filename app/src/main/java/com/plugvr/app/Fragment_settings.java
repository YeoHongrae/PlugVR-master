package com.plugvr.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

    Drawable[] iconList;
    Context context;

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


        String[] settingList = getResources().getStringArray(R.array.setting);
        iconList = new Drawable[settingList.length];

        for (int i=0; i<settingList.length; i++) {
            StringBuilder iconFileName = new StringBuilder("settingicon");
            iconFileName.append(i + 1);
            Integer iconNum = getResources().getIdentifier(iconFileName.toString(), "drawable", getActivity().getPackageName());
            iconList[i] = getResources().getDrawable(iconNum);
        }

        for (int i=0; i<settingList.length; i++){
            adapter.addItem(iconList[i], settingList[i]);
        }

        return layout;

    }
}
