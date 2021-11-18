package com.example.whatsappcloneapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class viwpageadapter extends FragmentStateAdapter {
    public viwpageadapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {

            case 0:
                return new came();
            case 1:
                return new Chats();
            case 2:
                return new Status();
            case 3:
                return new Calls();
        }
        return new Chats();

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
