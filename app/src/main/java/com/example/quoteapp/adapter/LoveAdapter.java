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

        holder.quotesback_img.setImageResource(love1.get(position).img);
        holder.txtqoutes.setText(love1.get(position).name);
        holder.txtname.setText(love1.get(position).auther_name);

    }

    @Override
    public int getItemCount() {
        return love1.size();
    }

   public class LoveViewholder extends RecyclerView.ViewHolder {

        TextView txtqoutes, txtname;
        ImageView quotesback_img, imglike, imgsave, imgshare, imgcopy;

        public LoveViewholder(@NonNull View itemView) {
            super(itemView);
            quotesback_img = itemView.findViewById(R.id.quotesback_img);
            imglike = itemView.findViewById(R.id.imglike);
            imgsave = itemView.findViewById(R.id.imgsave);
            imgcopy = itemView.findViewById(R.id.imgcopy);
            txtqoutes = itemView.findViewById(R.id.txtqoutes);
            txtname = itemView.findViewById(R.id.txtname);
            txtname = itemView.findViewById(R.id.txtname);
            imgshare = itemView.findViewById(R.id.imgshare);
        }
    }
}
