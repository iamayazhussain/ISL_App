package isl.ayaz.syllabus;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import isl.ayaz.R;


public class ITActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);


        setTitle("IT Syllabus");

        sem1 = findViewById(R.id.it1);
        sem2 = findViewById(R.id.it2);
        sem3 = findViewById(R.id.it3);
        sem4 = findViewById(R.id.it4);
        sem5 = findViewById(R.id.it5);
        sem6 = findViewById(R.id.it6);
        sem7 = findViewById(R.id.it7);
        sem8 = findViewById(R.id.it8);


        sem1.setOnClickListener(this);
        sem2.setOnClickListener(this);
        sem3.setOnClickListener(this);
        sem4.setOnClickListener(this);
        sem5.setOnClickListener(this);
        sem6.setOnClickListener(this);
        sem7.setOnClickListener(this);
        sem8.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent i;
        String it1_url = "https://drive.google.com/uc?export=download&id=1tzFepgYmyFh0BJPMw8jkzzrQwfnL1Kmk";
        String it2_url = "https://drive.google.com/uc?export=download&id=1A5hHzuFD-lx8GVWfgE7vRUmY_YpJBeiQ";
        String it3_url = "https://drive.google.com/uc?export=download&id=1FG_hamcO_C6GYiPPuHXyqCzmvB98PuWa";
        String it4_url = "https://drive.google.com/uc?export=download&id=1icm-Jk-a5D0lvMz7ZDuzKOH8OOe6xzGe";
        String it5_url = "https://drive.google.com/uc?export=download&id=1pYQ65odtjh5BsP1AMM41J7Yy9iahSdGo";
        String it6_url = "https://drive.google.com/uc?export=download&id=1yy2AjU3FuvnJtYGrR_NS2_XiXvd_40kZ";
        String it7_url = "https://drive.google.com/uc?export=download&id=1PGQgPO1w1zpp--xlcUiu5nT89-zb0zO6";
        String it8_url = "https://drive.google.com/uc?export=download&id=1p-j1GtLoaqRKeF13JA90R5BGBftkCC0I";

        switch(v.getId()){

            case R.id.it1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it1_url));startActivity(i);break;
            case R.id.it2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it2_url));startActivity(i);break;
            case R.id.it3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it3_url));startActivity(i);break;
            case R.id.it4 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it4_url));startActivity(i);break;
            case R.id.it5 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it5_url));startActivity(i);break;
            case R.id.it6 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it6_url));startActivity(i);break;
            case R.id.it7 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it7_url));startActivity(i);break;
            case R.id.it8 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(it8_url));startActivity(i);break;

            default:break;

        }


    }
}

