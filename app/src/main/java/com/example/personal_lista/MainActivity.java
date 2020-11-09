package com.example.personal_lista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    String [] juegos={"Uncharted","Fifa 20","Fornite","Among Us"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recycler_jonathan);

        MyAdapter e=new MyAdapter(this,juegos);
        recycler.setAdapter(e);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }



}