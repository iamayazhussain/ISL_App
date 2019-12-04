package isl.ayaz.adapters;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import isl.ayaz.R;
import isl.ayaz.activities.BBlogActivity;
import isl.ayaz.model.Blog;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Blog> mData ;
    RequestOptions option;


    public RecyclerViewAdapter(Context mContext, List<Blog> mDataone) {
        this.mContext = mContext;
        this.mData = mDataone;

        // Request option for Glide
        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.blog_row_item,parent,false) ;
        final MyViewHolder viewHolder = new MyViewHolder(view) ;


        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, BBlogActivity.class);
                i.putExtra("blog_name",mData.get(viewHolder.getAdapterPosition()).getName());
                i.putExtra("blog_venue",mData.get(viewHolder.getAdapterPosition()).getVenue());
                i.putExtra("blog_date",mData.get(viewHolder.getAdapterPosition()).getDate());
                i.putExtra("blog_link1",mData.get(viewHolder.getAdapterPosition()).getLink1());
                i.putExtra("blog_description1",mData.get(viewHolder.getAdapterPosition()).getDescription1());
                i.putExtra("blog_description2",mData.get(viewHolder.getAdapterPosition()).getDescription2());
                i.putExtra("blog_img",mData.get(viewHolder.getAdapterPosition()).getImage_url());
                i.putExtra("blog_img1",mData.get(viewHolder.getAdapterPosition()).getImage_url1());
                i.putExtra("blog_img2",mData.get(viewHolder.getAdapterPosition()).getImage_url2());

                mContext.startActivity(i);

            }
        });




        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());

        // Load Image from the internet and set it into Imageview using Glide

        Glide.with(mContext).load(mData.get(position).getImage_url()).apply(option).into(holder.img_thumbnail);



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name ;
        ImageView img_thumbnail;
        LinearLayout view_container;





        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            tv_name = itemView.findViewById(R.id.blog_name);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);

        }
    }

}
