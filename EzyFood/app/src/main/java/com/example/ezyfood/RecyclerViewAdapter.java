package com.example.ezyfood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {

    private ArrayList<Integer> fotoMinuman = new ArrayList<>();
    private ArrayList<String> namaMinuman = new ArrayList<>();
    private ArrayList<String> hargaMinuman = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<Integer> fotoMinuman, ArrayList<String> namaMinuman, ArrayList<String> hargaMinuman, Context context) {
        this.fotoMinuman = fotoMinuman;
        this.namaMinuman = namaMinuman;
        this.hargaMinuman = hargaMinuman;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_layout_adapter, parent, false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.viewHolder holder, final int position) {
        holder.imageViewFotoMinuman.setImageResource(fotoMinuman.get(position));
        holder.textViewNamaMinuman.setText(namaMinuman.get(position));
        holder.textViewHargaMinuman.setText(hargaMinuman.get(position));
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass = new Intent(context, OrderActivity.class);
                pass.putExtra("foto",fotoMinuman.get(position));
                pass.putExtra("nama",namaMinuman.get(position));
                pass.putExtra("harga",hargaMinuman.get(position));
                context.startActivity(pass);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fotoMinuman.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
    ImageView imageViewFotoMinuman;
    TextView textViewNamaMinuman;
    TextView textViewHargaMinuman;
    ConstraintLayout constraintLayout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoMinuman = itemView.findViewById(R.id.imageViewFotoMinuman);
            textViewNamaMinuman = itemView.findViewById(R.id.textViewNamaMinuman);
            textViewHargaMinuman = itemView.findViewById(R.id.textViewHargaMinuman);
            constraintLayout = itemView.findViewById(R.id.constrainLayout);
        }
    }
}
