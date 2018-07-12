package com.example.user.plugvr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by user on 2018-07-11.
 */

public class PageFragment extends FragmentStatePagerAdapter {

    public PageFragment(android.support.v4.app.FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int i) {

        switch(i)
        {
            case 0:
                return new Fragment_main();
            case 1:
                return new Fragment_library();
            case 2:
                return new Fragment_settings();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
