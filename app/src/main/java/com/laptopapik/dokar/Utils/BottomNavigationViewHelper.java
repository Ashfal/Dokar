package com.laptopapik.dokar.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Switch;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.laptopapik.dokar.Home.HomeActivity;
import com.laptopapik.dokar.Likes.LikesActivity;
import com.laptopapik.dokar.Profile.ProfileActivity;
import com.laptopapik.dokar.R;
import com.laptopapik.dokar.Search.SearchActivity;
import com.laptopapik.dokar.Share.ShareActivity;


/**
 * Created by Laptop Apik on 18/12/2017.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        break;

                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }
}
