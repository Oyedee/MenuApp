package com.example.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menuId = item.getItemId();

        if(menuId == R.id.menu_settings) {
            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if(menuId == R.id.menu_next) {
            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if(menuId == R.id.menu_previous) {
            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}