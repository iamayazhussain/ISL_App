package isl.ayaz.activities;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import isl.ayaz.R;
import isl.ayaz.adapters.RecyclerViewAdapter;
import isl.ayaz.model.Blog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class BlogActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {

    @Override
    int getContentViewId() {
        return R.layout.activity_blog;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_event;
    }

    private final String JSON_URL = "https://islengg.ac.in/app/Blog.php" ;
    private JsonArrayRequest request ;
    private RequestQueue requestQueue ;
    private List<Blog> lstBlog ;
    private RecyclerView recyclerView ;
    SwipeRefreshLayout mSwipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setTitle("Blog");
        lstBlog = new ArrayList<>() ;

        mSwipeRefreshLayout = findViewById(R.id.swipe_blog);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary,
                android.R.color.holo_green_dark,
                android.R.color.holo_orange_dark,
                android.R.color.holo_blue_dark);

        recyclerView = findViewById(R.id.recyclerviewid);
        mSwipeRefreshLayout.post(new Runnable() {

            @Override
            public void run() {
                mSwipeRefreshLayout.setRefreshing(true);
                jsonrequest();
            }
        });

    }


    @Override
    public void onRefresh() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        overridePendingTransition( 0, 0);

    }

    private void jsonrequest() {

        mSwipeRefreshLayout.setRefreshing(true);
        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject  = null ;

                for (int i = 0 ; i < response.length(); i++ ) {


                    try {
                        jsonObject = response.getJSONObject(i) ;
                        Blog blog = new Blog() ;
                        blog.setName(jsonObject.getString("name"));
                        blog.setVenue(jsonObject.getString("venue"));
                        blog.setDate(jsonObject.getString("date"));
                        blog.setLink1(jsonObject.getString("link1"));
                        blog.setDescription1(jsonObject.getString("description1"));
                        blog.setDescription2(jsonObject.getString("description2"));
                        blog.setImage_url(jsonObject.getString("img"));
                        blog.setImage_url1(jsonObject.getString("img1"));
                        blog.setImage_url2(jsonObject.getString("img2"));
                        lstBlog.add(blog);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    mSwipeRefreshLayout.setRefreshing(false);

                }

                setuprecyclerview(lstBlog);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mSwipeRefreshLayout.setRefreshing(false);
                AlertDialog alertDialog = new AlertDialog.Builder(BlogActivity.this).create();

                alertDialog.setTitle("No Internet Access");
                alertDialog.setMessage("Internet not available, Cross check your internet connectivity and try again");
                //alertDialog.setIcon(R.drawable.alerticon);
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        Intent i = new Intent(getApplicationContext(),HomeActivity.class);
                        startActivity(i);

                    }
                });

                alertDialog.show();
            }
        });


        requestQueue = Volley.newRequestQueue(BlogActivity.this);
        requestQueue.add(request) ;

    }

    private void setuprecyclerview(List<Blog> lstBlog) {

        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this,lstBlog) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);


        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter( myadapter );
    }

}
