package com.example.expensetracker;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends  RecyclerView.Adapter<AdapterClass.ViewHolder>{
    ArrayList<ModelClass> arrayList1;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> arrayList1, Context context) {
        this.arrayList1 = arrayList1;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.cardview_items,parent,false);
        return new ViewHolder((v));
    }

    @Override
    public void onBindViewHolder(AdapterClass.ViewHolder holder, int position) {
        holder.imgCategory.setImageResource(arrayList1.get(position).getImage());
        holder.txtCategory.setText(arrayList1.get(position).getCategory());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Description.class);

                // passing data to the Description activity
                intent.putExtra("Title",arrayList1.get(position).getCategory());
                intent.putExtra("Description",arrayList1.get(position).getDescription());
                intent.putExtra("Image",arrayList1.get(position).getImage());
                // start the activity
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCategory;
        TextView txtCategory;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            imgCategory=itemView.findViewById(R.id.imageCategory);
            txtCategory=itemView.findViewById(R.id.category);
            cardView=itemView.findViewById(R.id.cardview_id);
        }
    }
}
