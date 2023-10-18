package com.NguyenNgocGiaHung.CustomizedListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQuocGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Chuan bi du lieu
        dsQuocGia = new ArrayList<Country>();
        Country nation1 = new Country("Vietnam" ,"vn" ,80 );
        Country nation2 = new Country("United states" ,"us" ,68 );
        Country nation3 = new Country("Russia" ,"ru" ,120 );
        dsQuocGia.add(nation1);
        dsQuocGia.add(nation2);
        dsQuocGia.add(nation3);
        //Tim dieu khien
        ListView listViewQG = findViewById(R.id.);
        //Tao adapter
        CountryAdapter adapter = new CountryAdapter( dsQuocGia,this);
        //Gan adapter
        listViewQG.setAdapter((adapter));
        //Xu ly su kien nhu thong thuong
    }
}