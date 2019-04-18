package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);

        List<Contacts>contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Dayahang rai","908011122",R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat Malla","908078901",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","908123456",R.drawable.rajesh));
        contactsList.add(new Contacts("Bhuwan kc","908045678",R.drawable.bhuwan));

        ContactAdapter contactAdapter=new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
