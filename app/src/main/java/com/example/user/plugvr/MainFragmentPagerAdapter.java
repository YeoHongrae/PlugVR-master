package com.example.user.plugvr;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by user on 2018-07-11.
 */

public class MainFragmentPagerAdapter extends FragmentStatePagerAdapter implements PagerSlidingTabStrip.IconTabProvider {

    final int PAGE_COUNT = 3;

    private int tabIcons[] = {R.drawable.ic_shopping_cart_black_24dp,
                                 R.drawable.ic_library_books_black_24dp,
                                 R.drawable.ic_settings_black_24dp};

    public MainFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int i) {

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
    public int getPageIconResId(int position) {
        return tabIcons[position];
    }
}
