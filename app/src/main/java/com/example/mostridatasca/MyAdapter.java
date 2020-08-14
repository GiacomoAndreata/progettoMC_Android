package com.example.mostridatasca;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONException;
import org.json.JSONObject;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    private LayoutInflater mInflater;

    public MyAdapter(Context context){
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        JSONObject giocatoriObject =null;
        try {
            giocatoriObject = ModelClassifica.getInstance().get(position);
        }catch (JSONException e){
            e.printStackTrace();
        }

        holder.setText(giocatoriObject);
        Log.d("MyAdapter", "onBindViewHolder");
    }

    @Override
    public int getItemCount() {
        return ModelClassifica.getInstance().getSize();
    }
}