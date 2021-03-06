package com.csh.hann.gohwiki.android.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.csh.hann.gohwiki.R;
import com.csh.hann.gohwiki.android.ui.dashboard.DashboardFragment;
import com.csh.hann.gohwiki.android.ui.home.HomeFragment;
import com.csh.hann.gohwiki.android.ui.notifications.NotificationsFragment;
import com.csh.hann.gohwiki.android.ui.search.SuggestFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButtonToggleGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView searchView;

    private String[] countries = {"Vietnam","England","Canada", "France","Australia"};

    private String[] languages={"Java ","CSharp","Visual Basic","Swift","C/C++"};

    private String[] searches={"Tôn Quyền","Thanh Vũ","Lưu Bị","Đổng Trác", "Lưu Kham", "Quan Vũ"};

    BottomNavigationView btmNavView;
    private FragmentManager fm;
    private MaterialButtonToggleGroup btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        loadBtmNavView();
        loadSearchBar();

    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void loadBtmNavView(){
        BottomNavigationView.OnNavigationItemSelectedListener btmNavListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                System.out.println("NAV!!!!!");
                switch (item.getItemId()) {
                    case R.id.navigation_dashboard:
                        System.out.println("DASHBOARD");
                        fragment = new DashboardFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.navigation_home:
                        System.out.println("HOME");
                        fragment = new HomeFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.navigation_notifications:
                        System.out.println("NOTIFICATION");
                        fragment = new NotificationsFragment();
                        loadFragment(fragment);
                        return true;
                }
                return false;
            }
        };
        btmNavView = (BottomNavigationView)findViewById(R.id.nav_view);
        btmNavView.setOnNavigationItemSelectedListener(btmNavListener);
    }

    private void loadSearchBar(){
        SuggestFragment searchFragment = new SuggestFragment();
        btnSearch = (MaterialButtonToggleGroup) findViewById(R.id.toggleSearch);
        btnSearch.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                FragmentTransaction ftAdd = fm.beginTransaction();
                System.out.println("aaaa");
                if(isChecked){
                    ftAdd.add(R.id.frame_container, searchFragment);
                }else{
                    ftAdd.remove(searchFragment);
                }
                ftAdd.commit();
            }
        });
    }


}