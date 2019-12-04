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


public class CSEActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);


        setTitle("CSE Syllabus");

        sem1 = findViewById(R.id.cse1);
        sem2 = findViewById(R.id.cse2);
        sem3 = findViewById(R.id.cse3);
        sem4 = findViewById(R.id.cse4);
        sem5 = findViewById(R.id.cse5);
        sem6 = findViewById(R.id.cse6);
        sem7 = findViewById(R.id.cse7);
        sem8 = findViewById(R.id.cse8);


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
        String cse1_url = "https://drive.google.com/uc?export=download&id=1hMb1ArPhk0FeZkyuZWq6ONTGn6m6ultS";
        String cse2_url = "https://drive.google.com/uc?export=download&id=1FDkx8AoccWzgbhHpcvg6Bk3A4ahbVk0L";
        String cse3_url = "https://drive.google.com/uc?export=download&id=1y48eYky7O9qAR0L-6yNiJQXC6gnRhVFP";
        String cse4_url = "https://drive.google.com/uc?export=download&id=1lTaADoWppOCrGlQBl95BNJDLynKbuSlm";
        String cse5_url = "https://drive.google.com/uc?export=download&id=1AxDuP00OKgIFfrq5kZc5GYDdaWCr4ey6";
        String cse6_url = "https://drive.google.com/uc?export=download&id=1jy1jAnsPIJQwMDmtw2YhmX-ReRYm4z3z";
        String cse7_url = "https://drive.google.com/uc?export=download&id=1VZHpv75RJqyVtVA1hnhGBuwHAyAJ9oSB";
        String cse8_url = "https://drive.google.com/uc?export=download&id=1NSDh9e8USz8TmCQWOL-IMN0qR-MXAow5";

        switch(v.getId()){

            case R.id.cse1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse1_url));startActivity(i);break;
            case R.id.cse2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse2_url));startActivity(i);break;
            case R.id.cse3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse3_url));startActivity(i);break;
            case R.id.cse4 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse4_url));startActivity(i);break;
            case R.id.cse5 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse5_url));startActivity(i);break;
            case R.id.cse6 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse6_url));startActivity(i);break;
            case R.id.cse7 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse7_url));startActivity(i);break;
            case R.id.cse8 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cse8_url));startActivity(i);break;

            default:break;

        }


    }
}

