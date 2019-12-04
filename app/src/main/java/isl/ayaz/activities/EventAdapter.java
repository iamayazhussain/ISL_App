package isl.ayaz.activities;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import isl.ayaz.R;


class EventAdapter extends RecyclerView.Adapter<EventAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<Event> eventList;

    public EventAdapter(Context mCtx, List<Event> eventList) {
        this.mCtx = mCtx;
        this.eventList = eventList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.event_list, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Event event = eventList.get(position);

        //loading the image
        Glide.with(mCtx)
                .load(event.getImage())
                .into(holder.imageView);

        holder.Title.setText(event.getTitle());
        holder.Date.setText(event.getDate());
        holder.Venue.setText(String.valueOf(event.getVenue()));
        holder.Link.setText(String.valueOf(event.getLink()));
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView Title, Date, Venue, Link;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.Title);
            Date = itemView.findViewById(R.id.Date);
            Venue = itemView.findViewById(R.id.Venue);
            Link = itemView.findViewById(R.id.Link);
            imageView = itemView.findViewById(R.id.Image);
        }
    }
}