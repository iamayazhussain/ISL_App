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



public class ECEActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);


        setTitle("ECE Syllabus");

        sem1 = findViewById(R.id.ece1);
        sem2 = findViewById(R.id.ece2);
        sem3 = findViewById(R.id.ece3);
        sem4 = findViewById(R.id.ece4);
        sem5 = findViewById(R.id.ece5);
        sem6 = findViewById(R.id.ece6);
        sem7 = findViewById(R.id.ece7);
        sem8 = findViewById(R.id.ece8);


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
        String ece1_url = "https://drive.google.com/uc?export=download&id=12vSle1idJqnr63_nZpmdxu9yY-pMfADq";
        String ece2_url = "https://drive.google.com/uc?export=download&id=1dNxh9OIYuj2ihT0ZRTdRDa1Ol-5YYooH";
        String ece3_url = "https://drive.google.com/uc?export=download&id=1iI98lft9RdDO6aFxitFv-l_XZXI0I-9k";
        String ece4_url = "https://drive.google.com/uc?export=download&id=1G0Ob9NveJgbHSkOVbbo4DdRveMg0kD3Z";
        String ece5_url = "https://drive.google.com/uc?export=download&id=1ptsnqOawI9yUIV-X2sYJ2Lyw-_NxHqQT";
        String ece6_url = "https://drive.google.com/uc?export=download&id=1rIykMDZepUGhXhzBT80qcQzunHt7e7eb";
        String ece7_url = "https://drive.google.com/uc?export=download&id=1DGQ9gimhVQJ1SdMBI3zNf7FoEV3T7tOr";
        String ece8_url = "https://drive.google.com/uc?export=download&id=1ONIOlaw8s0dSasAn6DFgOboW56QE0tr2";

        switch(v.getId()){

            case R.id.ece1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece1_url));startActivity(i);break;
            case R.id.ece2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece2_url));startActivity(i);break;
            case R.id.ece3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece3_url));startActivity(i);break;
            case R.id.ece4 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece4_url));startActivity(i);break;
            case R.id.ece5 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece5_url));startActivity(i);break;
            case R.id.ece6 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece6_url));startActivity(i);break;
            case R.id.ece7 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece7_url));startActivity(i);break;
            case R.id.ece8 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ece8_url));startActivity(i);break;

            default:break;

        }


    }
}

