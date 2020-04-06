package com.example.exercise_menu_20180140067_yusufjohankelana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.PopupMenu;
import android.widget.Toast;


public class HalamanKeduaActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kedua);

        ImageView persegi = findViewById(R.id.persegi);
        ImageView lingkaran = findViewById(R.id.lingkaran);
        ImageView persegi_Panjang = findViewById(R.id.persegi_panjang);
        ImageView segitiga = findViewById(R.id.segitiga);
        ImageView trapesium = findViewById(R.id.trapesium);
        ImageView shutdown = findViewById(R.id.shutdown);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu perMenu = new PopupMenu(HalamanKeduaActivity.this, v);
                perMenu.setOnMenuItemClickListener(HalamanKeduaActivity.this);
                perMenu.inflate(R.menu.pop_up_menu);
                perMenu.show();
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu perMenu = new PopupMenu(HalamanKeduaActivity.this, v);
                perMenu.setOnMenuItemClickListener(HalamanKeduaActivity.this);
                perMenu.inflate(R.menu.pop_up_menu_dua);
                perMenu.show();
            }
        });

        persegi_Panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu perMenu = new PopupMenu(HalamanKeduaActivity.this, v);
                perMenu.setOnMenuItemClickListener(HalamanKeduaActivity.this);
                perMenu.inflate(R.menu.pop_up_menu_tiga);
                perMenu.show();
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu perMenu = new PopupMenu(HalamanKeduaActivity.this, v);
                perMenu.setOnMenuItemClickListener(HalamanKeduaActivity.this);
                perMenu.inflate(R.menu.pop_up_menu_empat);
                perMenu.show();
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu perMenu = new PopupMenu(HalamanKeduaActivity.this, v);
                perMenu.setOnMenuItemClickListener(HalamanKeduaActivity.this);
                perMenu.inflate(R.menu.pop_up_menu_lima);
                perMenu.show();
            }
        });

        shutdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanKeduaActivity.this, MainActivity.class));
            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.hitung_luas:
                startActivity(new Intent(this, HalamanLuasPersegiActivity.class));
                break;

            case R.id.hitung_keliling:
                startActivity(new Intent(this, HalamanKelilingPersegiActivity.class));
                break;

            case R.id.hitung_luas_dua:
                startActivity(new Intent(this, LuasLingkaranActivity.class));
                break;

            case R.id.hitung_keliling_dua:
                startActivity(new Intent(this, KelilingLingkaranActivity.class));
                break;

            case R.id.hitung_luas_tiga:
                startActivity(new Intent(this, LuasPersegiPanjangActivity.class));
                break;

            case R.id.hitung_keliling_tiga:
                startActivity(new Intent(this, KelilingPersegiPanjangActivity.class));
                break;

            case R.id.hitung_luas_empat:
                startActivity(new Intent(this, LuasSegitigaActivity.class));
                break;

            case R.id.hitung_keliling_empat:
                startActivity(new Intent(this, KelilingSegitigaActivity.class));
                break;

            case R.id.hitung_luas_lima:
                startActivity(new Intent(this, LuasTrapesiumActivity.class));
                break;

            case R.id.hitung_keliling_lima:
                startActivity(new Intent(this, KelilingTrapesiumActivity.class));
                break;

        }
        return true;
    }
}
