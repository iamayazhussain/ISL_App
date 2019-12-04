package isl.ayaz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import isl.ayaz.dept.CEDept;
import isl.ayaz.dept.CSEDept;
import isl.ayaz.dept.ECEDept;
import isl.ayaz.dept.EEEDept;
import isl.ayaz.dept.MEDept;

public class DeptActivity extends AppCompatActivity {

    private CardView csedept,ecedept,eeedept,medept,cedept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept);
        setTitle("Departments");


        csedept = findViewById(R.id.csedept);
        cedept = findViewById(R.id.cedept);
        ecedept = findViewById(R.id.ecedept);
        eeedept = findViewById(R.id.eeedept);
        medept = findViewById(R.id.medept);

        csedept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CSEDept.class);
                startActivity(i);}
        });

        cedept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CEDept.class);
                startActivity(i);}
        });
        ecedept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ECEDept.class);
                startActivity(i);}
        });
        eeedept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),EEEDept.class);
                startActivity(i);}
        });
        medept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MEDept.class);
                startActivity(i);}
        });

    }
}
