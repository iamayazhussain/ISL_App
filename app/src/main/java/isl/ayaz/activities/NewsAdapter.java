package isl.ayaz.activities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import isl.ayaz.R;


class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<News> newsList;

    public NewsAdapter(Context mCtx, List<News> newsList) {
        this.mCtx = mCtx;
        this.newsList = newsList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.news_list, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        News news = newsList.get(position);


        holder.Title.setText(news.getTitle());
        holder.ShortDesc.setText(news.getShortdesc());
        holder.Date.setText(news.getDate());
        holder.Link.setText(news.getLink());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView Title, ShortDesc, Link, Date;

        public ProductViewHolder(View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.Title);
            ShortDesc = itemView.findViewById(R.id.ShortDesc);
            Date = itemView.findViewById(R.id.Date);
            Link = itemView.findViewById(R.id.Link);
        }
    }
}