package com.example.dispositivosmoveis;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder> {

    private final List<Integer> numeros;

    public MeuAdapter(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @NonNull
    @Override
    public MeuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_numero, parent, false);
        return new MeuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeuViewHolder holder, int position) {
        int n = numeros.get(position);
        holder.tvNumero.setText(Integer.toString(n));
    }

    @Override
    public int getItemCount() {
        return numeros.size();
    }

    static class MeuViewHolder extends RecyclerView.ViewHolder {
        TextView tvNumero;
        public MeuViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNumero = itemView.findViewById(R.id.textView);
        }
    }
}
