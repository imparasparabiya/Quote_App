package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.quoteapp.QuoteModal.QouteModalClass;
import com.example.quoteapp.adapter.MainAdapter;
import com.example.quoteapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ActivityMainBinding binding;

        Integer[] quoteimg = {R.drawable.love,R.drawable.anniversary,R.drawable.attitude,R.drawable.birthday,R.drawable.brack_up,
                R.drawable.brother,R.drawable.engagement,R.drawable.funny,R.drawable.happy,R.drawable.morning,R.drawable.motivation,
                R.drawable.night,R.drawable.romantic,R.drawable.sad};
        String[] quotename = {"Love","Anniversary","Attitude","Birthday","Brack Up","Brother","Engagement","Funny","Happy","Morning","Motivation","Night","Romantic","Sad"};

        ArrayList<QouteModalClass> qouteModal = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        for (int i=0;i<quotename.length;i++){

            QouteModalClass q1 = new QouteModalClass(quoteimg[i],quotename[i]);
            qouteModal.add(q1);

        }

        MainAdapter mainAdapter = new MainAdapter(this,qouteModal);
        GridLayoutManager gm = new GridLayoutManager(this, 2);
        binding.rvData.setAdapter(mainAdapter);
        binding.rvData.setLayoutManager(gm);



    }
}