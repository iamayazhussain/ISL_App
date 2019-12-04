package isl.ayaz.activities;


import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import isl.ayaz.R;

public class BBlogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bblog);

        getSupportActionBar().hide();

        // Recieve data

        String name  = getIntent().getExtras().getString("blog_name");
        String venue  = getIntent().getExtras().getString("blog_venue");
        String description1 = getIntent().getExtras().getString("blog_description1");
        String description2 = getIntent().getExtras().getString("blog_description2");
        String image_url1 = getIntent().getExtras().getString("blog_img1") ;
        String image_url2 = getIntent().getExtras().getString("blog_img2") ;

        // ini views

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id);
        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_venue = findViewById(R.id.aa_blog_venue);
        TextView tv_description1 = findViewById(R.id.aa_description1);
        TextView tv_description2 = findViewById(R.id.aa_description2);
        ImageView img1 = findViewById(R.id.aa_thumbnail1);
        ImageView img2 = findViewById(R.id.aa_thumbnail2);

        // setting values to each view

        tv_venue.setText(venue);
        tv_description1.setText(description1);
        tv_description2.setText(description2);

        collapsingToolbarLayout.setTitle(name);


        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);


        // set image using Glide
        Glide.with(this).load(image_url1).apply(requestOptions).into(img1);
        Glide.with(this).load(image_url2).apply(requestOptions).into(img2);





    }
}
