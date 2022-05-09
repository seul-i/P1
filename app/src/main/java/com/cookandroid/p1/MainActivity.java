package com.cookandroid.p1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.btm_nav_menu);
        bottomNavigationView.setOnItemSelectedListener(new TabSelectedListener());
    }

    class TabSelectedListener implements NavigationBarView.OnItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new home_fragment()).commit();
                    break;
                case R.id.search:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new search_fragment()).commit();
                    break;
                case R.id.plus:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new plus_fragment()).commit();
                    break;
                case R.id.chat:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new chat_fragment()).commit();
                    break;
                case R.id.mypage:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new user_fragment()).commit();
                    break;
            }
            return true;
        }
    }
}