package com.example.sokkhunheng.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.sokkhunheng.R;
import com.example.sokkhunheng.fragments.AccountFragment;
import com.example.sokkhunheng.fragments.CategoryFragment;
import com.example.sokkhunheng.fragments.HomeFragment;
import com.example.sokkhunheng.fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView ;
    private Toolbar toolbar;
    private Fragment fragment;

    void init(){
        bottomNavigationView = findViewById(R.id.bottom_nav);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        showFragment(new HomeFragment());
        //        fragment = findViewById(R.id.fragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_home:
                        showFragment(new HomeFragment());
                        break;
                    case R.id.menu_category:
                        showFragment(new CategoryFragment());
                        break;
                    case R.id.menu_search:
                        showFragment(new SearchFragment());
                        break;
                    default:
                        showFragment(new AccountFragment());
                        break;
                }
                return true;
            }

        });
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }


    void showFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment).commit();
        Log.d("Main", "showFragment: " + fragment.toString());
        Log.d("Main", "showFragment: Commit");
    }
}