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


class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<Home> homeList;

    public HomeAdapter(Context mCtx, List<Home> homeList) {
        this.mCtx = mCtx;
        this.homeList = homeList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.quote_list, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Home home = homeList.get(position);


        holder.Title.setText(home.getTitle());
        holder.ShortDesc.setText(home.getShortdesc());
    }

    @Override
    public int getItemCount() {
        return homeList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView Title, ShortDesc;

        public ProductViewHolder(View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.Title);
            ShortDesc = itemView.findViewById(R.id.ShortDesc);
        }
    }
}