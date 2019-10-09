package com.rizki3012.digitalmarketingtactics.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rizki3012.digitalmarketingtactics.R;
import com.rizki3012.digitalmarketingtactics.model.Tactic;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListCardViewTacticAdapter extends RecyclerView.Adapter<ListCardViewTacticAdapter.CardViewViewHolder> {

    private ArrayList<Tactic> listTacticCV;
    private OnItemClickCallback onItemClickCallback;
    private Context context;

    ListCardViewTacticAdapter(Context context){
        this.context = context;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListCardViewTacticAdapter(ArrayList<Tactic> list) {
        this.listTacticCV = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cardview_tactic, viewGroup, false);
        return new CardViewViewHolder(view);
    }
    public interface OnItemClickCallback{
        void onItemClicked(Tactic data);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Tactic hero = listTacticCV.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvTitle.setText(hero.getTitle());
        holder.tvDetail.setText(hero.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listTacticCV.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listTacticCV.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvTitle, tvDetail;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.item_photo);
            tvTitle = itemView.findViewById(R.id.item_title);
            tvDetail = itemView.findViewById(R.id.item_detail);
        }
    }
}
