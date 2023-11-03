package com.nguyenngocgiahung.a63133173_thigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> gamelist = new ArrayList<String>();
        gamelist.add("Honkai:Starrail");
        gamelist.add("Valorant");
        gamelist.add("Legue Of Legend");
        gamelist.add("Honkai Impact");
        gamelist.add("Naraka");
        gamelist.add("Dead Cell");

        ListView listViewGL = findViewById(R.id.gamelist);
        ArrayAdapter<String> game_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gamelist);
        listViewGL.setAdapter(game_adapter);
        listViewGL.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = game_adapter.getItem(i);
                Toast.makeText(Bai2Activity.this,value,Toast.LENGTH_LONG).show();
            }
        });
    }
}