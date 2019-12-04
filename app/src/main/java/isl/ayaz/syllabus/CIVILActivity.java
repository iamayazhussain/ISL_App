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


public class CIVILActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);


        setTitle("CIVIL Syllabus");

        sem1 = findViewById(R.id.civil1);
        sem2 = findViewById(R.id.civil2);
        sem3 = findViewById(R.id.civil3);
        sem4 = findViewById(R.id.civil4);
        sem5 = findViewById(R.id.civil5);
        sem6 = findViewById(R.id.civil6);
        sem7 = findViewById(R.id.civil7);
        sem8 = findViewById(R.id.civil8);


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
        String civil1_url = "https://drive.google.com/uc?export=download&id=1YoVgaYvxDTEJ7s1cuTP-1APwRlUBIn1K";
        String civil2_url = "https://drive.google.com/uc?export=download&id=1UT-UxiExwLfSZNd0c2Aw3KLqDKnSLHI9";
        String civil3_url = "https://drive.google.com/uc?export=download&id=1bYSs1xp90TBhgUpsS73_Kzp7dIPckpq2";
        String civil4_url = "https://drive.google.com/uc?export=download&id=1BixQhZy_ZhftYT3Fd22y6xo5XkUpGjwn";
        String civil5_url = "https://drive.google.com/uc?export=download&id=1dknfnR6ngWDh7LLh-MNq2yyXzRsGx5lu";
        String civil6_url = "https://drive.google.com/uc?export=download&id=1bvgq1P71t4FeoiAuIfMkUUYYtrWTAojm";
        String civil7_url = "https://drive.google.com/uc?export=download&id=1ILMZa7slEPIZVdV7NEG_g9eUeLB1t8ny";
        String civil8_url = "https://drive.google.com/uc?export=download&id=1LnMGol0dqvURg2GRh4xP7Fufhb33aPoW";

        switch(v.getId()){

            case R.id.civil1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil1_url));startActivity(i);break;
            case R.id.civil2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil2_url));startActivity(i);break;
            case R.id.civil3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil3_url));startActivity(i);break;
            case R.id.civil4 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil4_url));startActivity(i);break;
            case R.id.civil5 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil5_url));startActivity(i);break;
            case R.id.civil6 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil6_url));startActivity(i);break;
            case R.id.civil7 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil7_url));startActivity(i);break;
            case R.id.civil8 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(civil8_url));startActivity(i);break;

            default:break;

        }


    }
}

