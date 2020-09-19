package com.example.cardviewdemo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerviewid);


        ArrayList<Mycard> mycards = new ArrayList<>();
        mycards.add(new Mycard("Mymensingh","Mymensing is my birth place",R.drawable.mymensing));
        mycards.add(new Mycard("Khulna","Khulna is my nice place",R.drawable.khulna));
        mycards.add(new Mycard("rangpur","rangpur is my birth place",R.drawable.rangpur));
        mycards.add(new Mycard("sylhet","sylhet is my birth place",R.drawable.sylhet));


        MyCardlist adapter = new MyCardlist(MainActivity.this,mycards);

        GridLayoutManager manager = new GridLayoutManager(MainActivity.this,2);

        recyclerView.setLayoutManager(manager);

        recyclerView.setAdapter(adapter);





    }
}
