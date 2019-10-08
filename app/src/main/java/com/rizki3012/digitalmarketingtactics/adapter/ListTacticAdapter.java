package com.rizki3012.digitalmarketingtactics.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rizki3012.digitalmarketingtactics.R;
import com.rizki3012.digitalmarketingtactics.model.Tactic;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//import static androidx.constraintlayout.widget.Constraints.TAG;

public class ListTacticAdapter extends RecyclerView.Adapter<ListTacticAdapter.ListViewHolder> {

    private ArrayList<Tactic> listTactic;
    private OnItemClickCallBack onItemClickCallBack;
    private Context context;

    ListTacticAdapter(Context context){
        this.context = context;
    }

    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    public ListTacticAdapter (ArrayList<Tactic> list){
        this.listTactic = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_tactic, viewGroup, false);
        return new ListViewHolder(view);
    }

    public interface OnItemClickCallBack{
        void onItemClicked(Tactic data);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Tactic tactic = listTactic.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tactic.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvTitle.setText(tactic.getTitle());
        holder.tvDetail.setText(tactic.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallBack.onItemClicked(listTactic.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTactic.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvTitle, tvDetail;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.item_photo);
            tvTitle = itemView.findViewById(R.id.item_title);
            tvDetail = itemView.findViewById(R.id.item_detail);
        }

    }
}
