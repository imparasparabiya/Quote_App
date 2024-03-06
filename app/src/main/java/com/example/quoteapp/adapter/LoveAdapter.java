package com.example.quoteapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quoteapp.QuoteModal.LoveModalClass;
import com.example.quoteapp.R;

import java.util.ArrayList;

public class LoveAdapter extends RecyclerView.Adapter<LoveAdapter.LoveViewholder> {

    Context context;

    ArrayList<LoveModalClass> love1 = new ArrayList<>();


    public LoveAdapter(Context context, ArrayList<LoveModalClass> love1) {
        this.context = context;
        this.love1 = love1;
    }

    @NonNull
    @Override
    public LoveViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.love_ui_tile, parent, false);
        return new LoveViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LoveViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return love1.size();
    }

   public class LoveViewholder extends RecyclerView.ViewHolder {

        TextView txtlike, txtsave, txtshare;
        ImageView imglike, imgsave, imgshare, quotimglove;

        public LoveViewholder(@NonNull View itemView) {
            super(itemView);
            quotimglove = itemView.findViewById(R.id.quotimglove);
            txtlike = itemView.findViewById(R.id.txtlike);
            txtsave = itemView.findViewById(R.id.txtsave);
            txtshare = itemView.findViewById(R.id.txtshare);
            imglike = itemView.findViewById(R.id.imglike);
            imgsave = itemView.findViewById(R.id.imgsave);
            imgshare = itemView.findViewById(R.id.imgshare);
        }
    }
}
