package com.example.quizzzz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageButton dialy = findViewById(R.id.dialy);
        dialy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this,
                        dialy.class);
                startActivity(intent);
            }
        });

        ImageButton lichsu = findViewById(R.id.lichsu);
        lichsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this,
                        lichsu.class);
                startActivity(intent);
            }
        });

        ImageButton khoahoc = findViewById(R.id.khoahoc);
        khoahoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this,
                        khoahoc.class);
                startActivity(intent);
            }
        });

        ImageButton nghethuat = findViewById(R.id.nghethuat);
        nghethuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this,
                        nghethuat.class);
                startActivity(intent);
            }
        });

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutoolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.thongtin){

            Intent intent =new Intent(MainActivity.this,
                    thongtin.class);
            startActivity(intent);
            return true;
        }

        Intent gopy = new Intent(Intent.ACTION_SEND);
        gopy.setType("text/plain");
        gopy.putExtra(Intent.EXTRA_SUBJECT,"Góp ý về ứng dụng");
        gopy.putExtra(Intent.EXTRA_TEXT,"Nhập góp ý của bạn");
        startActivity(gopy);


        int id1 = item.getItemId();
        if (id == R.id.action_lichsuchoi){
            Intent intent = new Intent(MainActivity.this, lichsuchoi.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}