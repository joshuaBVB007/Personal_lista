package com.example.personal_lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context con;
    String [] receptor;
    public MyAdapter(Context con,String[] receptor_){
        this.con=con;
        receptor=receptor_;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(con);
        View v=inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.t1.setText(receptor[position]);
    }

    @Override
    public int getItemCount() {
        return receptor.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.mytext_);
        }
    }

}
