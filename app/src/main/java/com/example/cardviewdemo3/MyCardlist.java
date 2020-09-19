package com.example.cardviewdemo3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyCardlist   extends RecyclerView.Adapter<MyCardlist.MyHolder> {


    Context context;
    ArrayList<Mycard> mycards;


    public MyCardlist(Context context, ArrayList<Mycard> mycards) {
        this.context = context;
        this.mycards = mycards;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.card_sample,parent,false);


        MyHolder holder = new MyHolder(v);




        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

         holder.imageView.setImageResource(mycards.get(position).image);
         holder.tex1.setText(mycards.get(position).title);
         holder.tex2.setText(mycards.get(position).description);


    }

    @Override
    public int getItemCount() {
        return mycards.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView tex1,tex2;


        public MyHolder(@NonNull View itemView) {
            super(itemView);


           imageView =  itemView.findViewById(R.id.imagecard);
           tex1 = itemView.findViewById(R.id.textcard);
           tex2 = itemView.findViewById(R.id.textcard2);
        }
    }

}
