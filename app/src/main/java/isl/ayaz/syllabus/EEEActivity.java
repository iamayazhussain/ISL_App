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


public class EEEActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);


        setTitle("EEE Syllabus");

        sem1 = findViewById(R.id.eee1);
        sem2 = findViewById(R.id.eee2);
        sem3 = findViewById(R.id.eee3);
        sem4 = findViewById(R.id.eee4);
        sem5 = findViewById(R.id.eee5);
        sem6 = findViewById(R.id.eee6);
        sem7 = findViewById(R.id.eee7);
        sem8 = findViewById(R.id.eee8);


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
        String eee1_url = "https://drive.google.com/uc?export=download&id=1XGkIzE3jd2u9VSUng7qo7jif4J8QXmqh";
        String eee2_url = "https://drive.google.com/uc?export=download&id=1DAVUp_1tSoF6x5KpJ0gsjL_KmJI0Gdyw";
        String eee3_url = "https://drive.google.com/uc?export=download&id=1YZNrSId6qxOaY_-_hVes7pP5f9pZ70VA";
        String eee4_url = "https://drive.google.com/uc?export=download&id=1uaruEUyc4LyJ64hUVBOgrpy17doTlrwG";
        String eee5_url = "https://drive.google.com/uc?export=download&id=1oMQjtEHQUaNMnUohhJJdI2fiUKp5CYUo";
        String eee6_url = "https://drive.google.com/uc?export=download&id=1RlRvEP4j7dzuXLA-I-A1HNSflcv7iTtV";
        String eee7_url = "https://drive.google.com/uc?export=download&id=1tBNPRhfRtCRe5JhcbZYJv-G5jSinacmm";
        String eee8_url = "https://drive.google.com/uc?export=download&id=1Orw_1WVqwyyAJC_95sK0lvDraczN3CQX";

        switch(v.getId()){

            case R.id.eee1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee1_url));startActivity(i);break;
            case R.id.eee2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee2_url));startActivity(i);break;
            case R.id.eee3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee3_url));startActivity(i);break;
            case R.id.eee4 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee4_url));startActivity(i);break;
            case R.id.eee5 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee5_url));startActivity(i);break;
            case R.id.eee6 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee6_url));startActivity(i);break;
            case R.id.eee7 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee7_url));startActivity(i);break;
            case R.id.eee8 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(eee8_url));startActivity(i);break;

            default:break;

        }


    }
}

