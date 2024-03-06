package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.quoteapp.QuoteModal.LoveModalClass;
import com.example.quoteapp.adapter.LoveAdapter;
import com.example.quoteapp.databinding.ActivityLoveBinding;

import java.util.ArrayList;

public class LoveActivity extends AppCompatActivity {

    ActivityLoveBinding binding;
    Integer[] img = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5};

    ArrayList<LoveModalClass> loveModalClasses = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        for (int i=0;i<img.length;i++){

            LoveModalClass l1 = new LoveModalClass(img[i]);
            loveModalClasses.add(l1);
        }
        LoveAdapter loveAdapter = new LoveAdapter(this,loveModalClasses);
        binding.rvLoveData.setAdapter(loveAdapter);
        RecyclerView.LayoutManager l1 = new LinearLayoutManager(this);
        binding.rvLoveData.setLayoutManager(l1);

    }
}