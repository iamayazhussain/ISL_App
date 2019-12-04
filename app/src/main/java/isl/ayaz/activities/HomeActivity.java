package isl.ayaz.activities;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.github.clans.fab.FloatingActionButton;
import com.onesignal.OneSignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import isl.ayaz.Contact;
import isl.ayaz.DeptActivity;
import isl.ayaz.R;
import isl.ayaz.USPActivity;


public class HomeActivity extends BaseActivity implements BaseSliderView.OnSliderClickListener,
        ViewPagerEx.OnPageChangeListener {

    private static final String URL_Quote = "https://islengg.ac.in/app/Quote.php";

    List<Home> homeList;

    RecyclerView recyclerView;

    SliderLayout sliderLayout ;

    HashMap<String, String> HashMapForURL ;



    private FloatingActionButton share;
    private FloatingActionButton playstore;
    private FloatingActionButton website;
    private FloatingActionButton team;

    private CardView about,news,uevent,usp,dept,contact;

    @Override
    int getContentViewId() {
        return R.layout.activity_home;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_home;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);

        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.topimage, null);

        actionBar.setCustomView(v);
        setTitle("");
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));


        sliderLayout = findViewById(R.id.slider);

        //Call this method if you want to add images from URL .
        AddImagesUrlOnline();

        //Call this method to add images from local drawable folder .
        //AddImageUrlFormLocalRes();

        //Call this method to stop automatic sliding.
        //sliderLayout.stopAutoCycle();

        for(String name : HashMapForURL.keySet()){

            TextSliderView textSliderView = new TextSliderView(HomeActivity.this);

            textSliderView
                    .image(HashMapForURL.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            textSliderView.bundle(new Bundle());

            textSliderView.getBundle()
                    .putString("extra",name);

            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setDuration(3000);

        sliderLayout.addOnPageChangeListener(HomeActivity.this);


        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();



        recyclerView = findViewById(R.id.recylcerViewQuote);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        homeList = new ArrayList<>();
        loadQuote();



        share  = findViewById(R.id.share);
        playstore  = findViewById(R.id.playstore);
        website  = findViewById(R.id.website);
        team  = findViewById(R.id.team);



        about = findViewById(R.id.about);
        news = findViewById(R.id.news);
        usp = findViewById(R.id.usp);
        uevent = findViewById(R.id.uevent);
        dept = findViewById(R.id.dept);
        contact = findViewById(R.id.contact);


        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(i);}
        });


        news.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),NewsActivity.class);
                startActivity(i);}
        });

        uevent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),EventActivity.class);
                startActivity(i);}
        });

        usp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),USPActivity.class);
                startActivity(i);}
        });


        dept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DeptActivity.class);
                startActivity(i);}
        });

        contact.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Contact.class);
                startActivity(i);}
        });



        share.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://wa.me/?text=https://play.google.com/store/apps/details?id=isl.ayaz"));
                startActivity(myWebLink);
            }
        });

        playstore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=isl.ayaz"));
                startActivity(myWebLink);
            }
        });

        team.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Team.class);
                startActivity(i);}

        });


        website.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://islengg.ac.in"));
                startActivity(myWebLink);
            }
        });


    }





    private void loadQuote() {

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_Quote,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //converting the string to json array object
                            JSONArray array = new JSONArray(response);

                            //traversing through all the object
                            for (int i = 0; i < array.length(); i++) {

                                //getting product object from json array
                                JSONObject product = array.getJSONObject(i);

                                //adding the product to product list
                                homeList.add(new Home(
                                        product.getInt("id"),
                                        product.getString("title"),
                                        product.getString("shortdesc")
                                ));
                            }

                            //creating adapter object and setting it to recyclerview
                            HomeAdapter adapter = new HomeAdapter(HomeActivity.this, homeList);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);


    }







    @Override
    protected void onStop() {

        sliderLayout.stopAutoCycle();

        super.onStop();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {

        Log.d("Slider Demo", "Page Changed: " + position);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void AddImagesUrlOnline(){

        HashMapForURL = new HashMap<String, String>();

        HashMapForURL.put("1", "https://islengg.ac.in/app/carousel/1.jpg");
        HashMapForURL.put("2", "https://islengg.ac.in/app/carousel/2.jpg");
        HashMapForURL.put("3", "https://islengg.ac.in/app/carousel/3.jpg");
        HashMapForURL.put("4", "https://islengg.ac.in/app/carousel/4.jpg");
        HashMapForURL.put("5", "https://islengg.ac.in/app/carousel/5.jpg");
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }

}

