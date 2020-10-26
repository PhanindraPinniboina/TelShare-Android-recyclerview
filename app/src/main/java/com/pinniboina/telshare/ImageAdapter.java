package com.pinniboina.telshare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private Context mContext;
    private List<Upload> mUpload;

    public ImageAdapter(Context context, List<Upload> uploads){
        mContext = context;
        mUpload = uploads;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        Upload currentUpload = mUpload.get(position);
        holder.textName.setText(currentUpload.getmName());
        Picasso.get()
                .load(currentUpload.getmImageUri())
                .into(holder.imageDownload);
    }

    @Override
    public int getItemCount() {
        return mUpload.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{
        public TextView textName;
        public ImageView imageDownload;
        //public ImageView share;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.title_Name);
            imageDownload = itemView.findViewById(R.id.image_download);
            //share = itemView.findViewById(R.id.share_icon);
        }
    }
}
