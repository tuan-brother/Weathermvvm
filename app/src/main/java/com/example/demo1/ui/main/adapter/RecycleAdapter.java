package com.example.demo1.ui.main.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo1.R;
import com.example.demo1.ui.main.classinfo.Thongtin;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.BookViewHolder> {
    List<Thongtin> list;
    Context context;
    Integer i = 0;

    //contructor


    public RecycleAdapter(List<Thongtin> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Thongtin infotion = list.get(position);
        holder.nameCiTy.setText(infotion.getTenTP());
        holder.infoCiTy.setText(infotion.getInfoTP());
        holder.nhietDo.setText(infotion.getNhietDo());
        holder.knm.setText(infotion.getKnm());
        holder.doAm.setText(infotion.getDoAm());
        i = Integer.parseInt(holder.nhietDo.getText().toString());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //create view holder
    public class BookViewHolder extends RecyclerView.ViewHolder {
        private TextView nameCiTy;
        private TextView infoCiTy;
        private TextView doAm;
        private TextView nhietDo;
        private TextView knm;

        public BookViewHolder(View itemView) {
            super(itemView);

            nameCiTy = itemView.findViewById(R.id.namecity);
            infoCiTy = itemView.findViewById(R.id.infocity);
            doAm = itemView.findViewById(R.id.doAm);
            nhietDo = itemView.findViewById(R.id.nhietdo);
            knm = itemView.findViewById(R.id.tknm);
            if (i > 0) {
                itemView.setBackgroundResource(R.drawable.duongvien);
            } else {
                itemView.setBackgroundResource(R.drawable.duongvien2);
            }

        }
    }
}
