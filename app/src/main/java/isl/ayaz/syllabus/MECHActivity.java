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


public class MECHActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);

        setTitle("MECH Syllabus");


        sem1 = findViewById(R.id.mech1);
        sem2 = findViewById(R.id.mech2);
        sem3 = findViewById(R.id.mech3);
        sem4 = findViewById(R.id.mech4);
        sem5 = findViewById(R.id.mech5);
        sem6 = findViewById(R.id.mech6);
        sem7 = findViewById(R.id.mech7);
        sem8 = findViewById(R.id.mech8);


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
        String mech1_url = "https://drive.google.com/uc?export=download&id=1dskpzMH4VZcGzJQP0G3mpTFtu0IOTpE_";
        String mech2_url = "https://drive.google.com/uc?export=download&id=1QQNM0898SaNI3-4k353KaR9OdcDSgDL5";
        String mech3_url = "https://drive.google.com/uc?export=download&id=1ht63m5Wl6f4PfzUTzPCwev2HJhP_gs9q";
        String mech4_url = "https://drive.google.com/uc?export=download&id=1fUFku6TDykd3ISibBvVfVyWLjZQIXsPu";
        String mech5_url = "https://drive.google.com/uc?export=download&id=1qfOGYm955y8MX51tCfuoVZdthrCZYdm-";
        String mech6_url = "https://drive.google.com/uc?export=download&id=1SflMoI52kgyagiy09dDo7FbWDKAp9JEa";
        String mech7_url = "https://drive.google.com/uc?export=download&id=1d9C1GPFPq-HNHdVuqPIVkGMMPqqRuUby";
        String mech8_url = "https://drive.google.com/uc?export=download&id=1hs82-8xVZpPhzTXG197l-Ejp2nrZDaRa";

        switch(v.getId()){

            case R.id.mech1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech1_url));startActivity(i);break;
            case R.id.mech2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech2_url));startActivity(i);break;
            case R.id.mech3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech3_url));startActivity(i);break;
            case R.id.mech4 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech4_url));startActivity(i);break;
            case R.id.mech5 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech5_url));startActivity(i);break;
            case R.id.mech6 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech6_url));startActivity(i);break;
            case R.id.mech7 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech7_url));startActivity(i);break;
            case R.id.mech8 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech8_url));startActivity(i);break;

            default:break;

        }


    }
}

