package com.domain.Nebula.bottomnav;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.domain.Nebula.AccountFragment;
import com.domain.Nebula.FollowingFragment;
import com.domain.Nebula.MessagesFragment;
import com.domain.Nebula.SearchFragment;
import com.domain.Nebula.StreamsFragment;

public class HomeScreenPagerAdapter extends FragmentStatePagerAdapter {

    public final static int FRAGMENTS_COUNT = 5;

    public final static int STREAMS_FRAGMENT_POSITION = 0;
    public final static int SEARCH_FRAGMENT_POSITION = 1;
    public final static int FOLLOWING_FRAGMENT_POSITION = 2;
    public final static int ACCOUNT_FRAGMENT_POSITION = 3;
    public final static int MESSAGES_FRAGMENT_POSITION = 4;

    public HomeScreenPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case STREAMS_FRAGMENT_POSITION:
                return new StreamsFragment();
            case SEARCH_FRAGMENT_POSITION:
                return new SearchFragment();
            case FOLLOWING_FRAGMENT_POSITION:
                return new FollowingFragment();
            case ACCOUNT_FRAGMENT_POSITION:
                return new AccountFragment();
            case MESSAGES_FRAGMENT_POSITION:
                return new MessagesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return FRAGMENTS_COUNT;
    }
}
