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
    ArrayList<LoveModalClass> loveModalClasses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String loveText = getIntent().getStringExtra("Love_Text");

        binding.rvLoveData.setHasFixedSize(true);
        LoveAdapter loveAdapter = new LoveAdapter(this, loveModalClasses);
        binding.rvLoveData.setAdapter(loveAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rvLoveData.setLayoutManager(layoutManager);

        if (loveText != null && loveText.equals("Love")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Meri Jindagi Meri Jaan Ho Tum Meri sukun ka dusra Naam ho tum", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Anniversary")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "When 'Happy Anniversary' isn't enough, have a better way with words using our anniversary quotes to celebrate many more years of wedded bliss.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Attitude")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "If you don’t control your attitude, then I will control you.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Birthday")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Brack Up")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Brother")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Engagement")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Funny")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Happy")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Morning")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Motivation")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Night")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Romantic")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
        if (loveText != null && loveText.equals("Sad")) {
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveModalClasses.add(new LoveModalClass(R.drawable.qoutes_background, "Tum bahut pasand ho mujhe, vajah mat puchna. Maloom nahi mujhe.", "Prince"));
            loveAdapter.notifyDataSetChanged(); // Notify adapter that data has changed
        }
    }
}
