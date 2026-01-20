package com.jayanidukaushalya.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketItemAdapter extends RecyclerView.Adapter<BucketItemAdapter.BucketItemViewHolder> {

    private final BucketItem[] items;

    public BucketItemAdapter(BucketItem[] items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    @NonNull
    @Override
    public BucketItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket, parent, false);
        return new BucketItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketItemViewHolder holder, int position) {
        holder.bind(items[position]);
    }

    static class BucketItemViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView name, description;

        public BucketItemViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageview_item);
            name = itemView.findViewById(R.id.textview_name);
            description = itemView.findViewById(R.id.textview_description);
        }

        public void bind(BucketItem item) {
            image.setImageResource(item.getImage());
            name.setText(item.getName());
            description.setText(item.getDescription());
        }
    }

}
