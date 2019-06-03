package com.example.lab4androidcoban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import com.example.lab4androidcoban.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class Bai3Activity extends AppCompatActivity {

    ListView lvNguoiDung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        lvNguoiDung = (ListView) findViewById(R.id.lvNguoiDung);

        List<NguoiDung> nguoiDungList = new ArrayList<>();

        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Peter James ","Campuchia"));
        nguoiDungList.add(new NguoiDung("Henry Jacobs","Lào"));
        nguoiDungList.add(new NguoiDung("Bola Olumide","Thái Lan"));
        nguoiDungList.add(new NguoiDung("Chidi Johnson","USA"));
        nguoiDungList.add(new NguoiDung("GeGordio Puritio","Italy"));
        nguoiDungList.add(new NguoiDung("Gary Cook","UK"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));
        nguoiDungList.add(new NguoiDung("Quốc Trung","Việt Nam"));

        MyAdapter myAdapter = new MyAdapter(Bai3Activity.this,nguoiDungList);
        lvNguoiDung.setAdapter(myAdapter);

    }
}
