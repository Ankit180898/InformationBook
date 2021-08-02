package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
        arrayList=new ArrayList<>();
        arrayList.add(new ModelClass(R.drawable.fake_smile,"Money","Description book"));
        arrayList.add(new ModelClass(R.drawable.smile,"Smile","Description book"));
        arrayList.add(new ModelClass(R.drawable.sad,"Sad","Description book"));
        arrayList.add(new ModelClass(R.drawable.fake_smile,"Fake Smile","Description book"));
        arrayList.add(new ModelClass(R.drawable.good,"Thumbs Up","Description book"));
        arrayList.add(new ModelClass(R.drawable.not_good,"Thumbs Down","Description book"));
        arrayList.add(new ModelClass(R.drawable.fake_smile,"Money","Description book"));
        arrayList.add(new ModelClass(R.drawable.smile,"Smile","Description book"));
        arrayList.add(new ModelClass(R.drawable.sad,"Sad","Description book"));
        arrayList.add(new ModelClass(R.drawable.fake_smile,"Fake Smile","Description book"));
        arrayList.add(new ModelClass(R.drawable.good,"Thumbs Up","Description book"));
        arrayList.add(new ModelClass(R.drawable.not_good,"Thumbs Down","Description book"));
        arrayList.add(new ModelClass(R.drawable.fake_smile,"Money","Description book"));
        arrayList.add(new ModelClass(R.drawable.smile,"Smile","Description book"));
        arrayList.add(new ModelClass(R.drawable.sad,"Sad","Description book"));
        arrayList.add(new ModelClass(R.drawable.fake_smile,"Fake Smile","Description book"));
        arrayList.add(new ModelClass(R.drawable.good,"Thumbs Up","Description book"));
        arrayList.add(new ModelClass(R.drawable.not_good,"Thumbs Down","Description book"));



        AdapterClass myAdapter = new AdapterClass(arrayList,this);
        recyclerView.setAdapter(myAdapter);


    }
}