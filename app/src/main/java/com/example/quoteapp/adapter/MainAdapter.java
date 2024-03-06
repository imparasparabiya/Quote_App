package com.example.quoteapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quoteapp.LoveActivity;
import com.example.quoteapp.MainActivity;
import com.example.quoteapp.QuoteModal.QouteModalClass;
import com.example.quoteapp.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.dataViewHolder> {

    Context context;

    ArrayList<QouteModalClass> q1 = new ArrayList<>();
    public MainAdapter(Context context, ArrayList<QouteModalClass> q1) {
    this.context = context;
    this.q1 = q1;

    }

    @NonNull
    @Override
    public dataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View attech
        View view = LayoutInflater.from(context).inflate(R.layout.quote_ui_tile,parent,false);
        return new dataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataViewHolder holder, int position) {
        //set Data
        holder.quoteimg.setImageResource(q1.get(position).quoteimg);
        holder.quotename.setText(q1.get(position).quotename);

        holder.crdview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Intent intent = new Intent(context, LoveActivity.class);
                intent.putExtra("name",q1.get(position).quotename);
                context.startActivity(intent);

                if (position == 1){
                    Intent intent1 = new Intent(context, LoveActivity.class);
                    context.startActivity(intent1);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return q1.size();
    }

  public class dataViewHolder extends RecyclerView.ViewHolder{

        CircleImageView quoteimg;
        TextView quotename;
        CardView crdview;
        public dataViewHolder(@NonNull View itemView) {
            super(itemView);

            quoteimg = itemView.findViewById(R.id.crcimg);
            quotename = itemView.findViewById(R.id.txt);
            crdview = itemView.findViewById(R.id.crdview);
        }
    }
}
