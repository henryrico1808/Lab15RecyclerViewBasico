package com.example.henry.lab15recyclerviewbasico;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Henry on 22/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private String[] nombres;
    private String[] noctrl;

    public RecyclerAdapter(String[] nombres, String[] noctrl) {
        this.nombres = nombres;
        this.noctrl = noctrl;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.campo_nombre.setText(nombres[position]);
        holder.campo_noctrl.setText(noctrl[position]);
    }


    @Override
    public int getItemCount() {
        return nombres.length;

    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView campo_nombre;
        TextView campo_noctrl;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            campo_nombre = itemView.findViewById(R.id.alumno_id);
            campo_noctrl = itemView.findViewById(R.id.noctrl_id);


        }
    }

}
