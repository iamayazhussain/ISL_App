package isl.ayaz.papers;


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


public class CSEPapers extends AppCompatActivity implements View.OnClickListener {


    private CardView ai,alc,be,ca,cc,cn,daa,dbms,dc,dis,dm,ds,dsc,ecm,evs,is,java,lsst,m1,m2,m3,m4,mea,mpi,mech1,mech2,oosd,os,paes,ppl,se,wps,bee,ms,ssa,phy1,phy2,chem1,chem2,cps,ouc,spm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csepapers);

        setTitle("CSE Papers");


        ai = findViewById(R.id.ai);
        alc = findViewById(R.id.alc);
        be = findViewById(R.id.be);
        ca = findViewById(R.id.ca);
        cc = findViewById(R.id.cc);
        cn = findViewById(R.id.cn);
        daa = findViewById(R.id.daa);
        dbms = findViewById(R.id.dbms);
        dc = findViewById(R.id.dc);
        dis = findViewById(R.id.dis);
        dm = findViewById(R.id.dm);
        ds = findViewById(R.id.ds);
        dsc = findViewById(R.id.dsc);
        ecm = findViewById(R.id.ecm);
        evs = findViewById(R.id.evs);
        is = findViewById(R.id.is);
        java = findViewById(R.id.java);
        lsst = findViewById(R.id.lsst);
        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m3 = findViewById(R.id.m3);
        m4 = findViewById(R.id.m4);
        mea = findViewById(R.id.mea);
        mpi = findViewById(R.id.mpi);
        mech1 = findViewById(R.id.mech1);
        mech2 = findViewById(R.id.mech2);
        oosd = findViewById(R.id.oosd);
        paes = findViewById(R.id.paes);
        ppl = findViewById(R.id.ppl);
        se = findViewById(R.id.se);
        wps = findViewById(R.id.wps);
        bee = findViewById(R.id.bee);
        ms = findViewById(R.id.ms);
        ssa = findViewById(R.id.ssa);
        phy1 = findViewById(R.id.phy1);
        phy2 = findViewById(R.id.phy2);
        chem1 = findViewById(R.id.chem1);
        chem2 = findViewById(R.id.chem2);
        cps = findViewById(R.id.cps);
        ouc = findViewById(R.id.ouc);
        spm = findViewById(R.id.spm);
        os = findViewById(R.id.os);



        ai.setOnClickListener(this);
        alc.setOnClickListener(this);
        be.setOnClickListener(this);
        ca.setOnClickListener(this);
        cc.setOnClickListener(this);
        cn.setOnClickListener(this);
        daa.setOnClickListener(this);
        dbms.setOnClickListener(this);
        dc.setOnClickListener(this);
        dis.setOnClickListener(this);
        dm.setOnClickListener(this);
        ds.setOnClickListener(this);
        dsc.setOnClickListener(this);
        ecm.setOnClickListener(this);
        evs.setOnClickListener(this);
        is.setOnClickListener(this);
        java.setOnClickListener(this);
        lsst.setOnClickListener(this);
        m1.setOnClickListener(this);
        m2.setOnClickListener(this);
        m3.setOnClickListener(this);
        m4.setOnClickListener(this);
        mea.setOnClickListener(this);
        mpi.setOnClickListener(this);
        mech1.setOnClickListener(this);
        mech2.setOnClickListener(this);
        oosd.setOnClickListener(this);
        paes.setOnClickListener(this);
        ppl.setOnClickListener(this);
        se.setOnClickListener(this);
        wps.setOnClickListener(this);
        bee.setOnClickListener(this);
        ms.setOnClickListener(this);
        ssa.setOnClickListener(this);
        phy1.setOnClickListener(this);
        phy2.setOnClickListener(this);
        chem1.setOnClickListener(this);
        chem2.setOnClickListener(this);
        cps.setOnClickListener(this);
        ouc.setOnClickListener(this);
        spm.setOnClickListener(this);
        os.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent i;
        String ai_url = "https://drive.google.com/open?id=0B14lF0mcPupdb3B3T09fNGt6VE0";
        String alc_url = "https://drive.google.com/open?id=0B14lF0mcPupdcEkza3hINTZxbVk";
        String be_url = "https://drive.google.com/open?id=0B14lF0mcPupdckNpb3FDRVdVSnM";
        String bee_url = "https://drive.google.com/open?id=1Sz7LMdMHQKKrz0wgX4einMrOJUOP6On7";
        String cps_url = "https://drive.google.com/open?id=0B14lF0mcPupdOXViVzUwZHJkUkk";
        String ouc_url = "https://drive.google.com/open?id=1O2nOHW7BYMZID9NrXznBik9pjwUqlqmn";
        String ca_url = "https://drive.google.com/open?id=0B14lF0mcPupdWjZVQ09US0phb0U";
        String cc_url = "https://drive.google.com/open?id=0B14lF0mcPupddDhLN2FQYlBpa3M";
        String chem1_url = "https://drive.google.com/open?id=15p1eemBAImgq8t35RSv_PLEJdy5uie-v";
        String chem2_url = "https://drive.google.com/open?id=1HBm5W1CIRBeTNjCLWR3GBbmZ9A5KCoXI";
        String cn_url = "https://drive.google.com/open?id=0B14lF0mcPupdd25SSThKSWVjLTg";
        String daa_url = "https://drive.google.com/open?id=0B14lF0mcPupdalg3akVLcGFUSEk";
        String dbms_url = "https://drive.google.com/open?id=0B14lF0mcPupdUGxtRDJDZHc4ZGs";
        String dc_url = "https://drive.google.com/open?id=0B14lF0mcPupdTmVFcS1lTUh0cVU";
        String dis_url = "https://drive.google.com/open?id=0B14lF0mcPupdLUYyUkdRU3otRWc";
        String dm_url = "https://drive.google.com/open?id=0B14lF0mcPupdZzBwMWZtUkRPa00";
        String ds_url = "https://drive.google.com/open?id=0B14lF0mcPupdZ3JnY0FwWWRpQm8";
        String dsc_url = "https://drive.google.com/open?id=0B14lF0mcPupdbG9OUlFEWlpabzA";
        String ecm_url = "https://drive.google.com/open?id=0B14lF0mcPupdUWNYcEtOaHozbjg";
        String evs_url = "https://drive.google.com/open?id=0B14lF0mcPupdVWtkQmdOQW5rLWM";
        String is_url = "https://drive.google.com/open?id=0B14lF0mcPupdWG9pcWp0V2hSQkE";
        String java_url = "https://drive.google.com/open?id=0B14lF0mcPupddW1aVkp0VWNUa2s";
        String lsst_url = "https://drive.google.com/open?id=0B14lF0mcPupdM05rUzhrWEdjVkU";
        String ms_url = "https://drive.google.com/open?id=1Zn9Z4DkciFogciS3jwfTojW8_ug93QzK";
        String m1_url = "https://drive.google.com/open?id=1_w2XDBuLxJ7EGAQmpUB2joFMNtJw5H8w";
        String m2_url = "https://drive.google.com/open?id=0B14lF0mcPupdbWdJYWhJWk9yLWM";
        String m3_url = "https://drive.google.com/open?id=0B14lF0mcPupdZjRrWWQ4OHpQeU0";
        String m4_url = "https://drive.google.com/open?id=0B14lF0mcPupdR3NUWkxZUjMzRlE";
        String mea_url = "https://drive.google.com/open?id=0B14lF0mcPupdaTRoLW9CekhuYUk";
        String mech1_url = "https://drive.google.com/open?id=1mwgNy40MKZezslSzulW8BEsqxwCTOlu8";
        String mech2_url = "https://drive.google.com/open?id=10QvB-KA3xMIcd4j6UW6ZO7EOl9BC4frf";
        String mpi_url = "https://drive.google.com/open?id=0B14lF0mcPupdUV8xdG8ydGlyd2c";
        String oosd_url = "https://drive.google.com/open?id=0B14lF0mcPupdQU50amROZkdzRUU";
        String os_url = "https://drive.google.com/open?id=0B14lF0mcPupdSUVjR1h1RFZFNGM";
        String paes_url = "https://drive.google.com/open?id=0B14lF0mcPupdd183cWtFX2xzbUE";
        String phy1_url = "https://drive.google.com/open?id=1Bu7S6xv9zO5pmtbtiM5-nYbnu3dstKy3";
        String phy2_url = "https://drive.google.com/open?id=1yFvbRfV6rP1vmhg0KD4HaxYlI9CBUcAJ";
        String ppl_url = "https://drive.google.com/open?id=0B14lF0mcPupdbThBUlNzUUVRdkE";
        String se_url = "https://drive.google.com/open?id=0B14lF0mcPupdLTVkbWRkMkRsb28";
        String ssa_url = "https://drive.google.com/open?id=152KhTuCHyTboUiRoAlqaCP8PoWtr3Q7j";
        String wps_url = "https://drive.google.com/open?id=0B14lF0mcPupdQkVXQ210Rk9mZ2s";
        String spm_url = "https://drive.google.com/open?id=11QE_1_8sAPOnU3YYUjD1b0P5wAiLq0sC";

        switch(v.getId()){

            case R.id.ai : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ai_url));startActivity(i);break;
            case R.id.alc : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(alc_url));startActivity(i);break;
            case R.id.be : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(be_url));startActivity(i);break;
            case R.id.bee : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(bee_url));startActivity(i);break;
            case R.id.cps : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cps_url));startActivity(i);break;
            case R.id.ouc : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ouc_url));startActivity(i);break;
            case R.id.ca : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ca_url));startActivity(i);break;
            case R.id.cc : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cc_url));startActivity(i);break;
            case R.id.chem1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(chem1_url));startActivity(i);break;
            case R.id.chem2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(chem2_url));startActivity(i);break;
            case R.id.cn : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(cn_url));startActivity(i);break;
            case R.id.daa : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(daa_url));startActivity(i);break;
            case R.id.dbms : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(dbms_url));startActivity(i);break;
            case R.id.dc : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(dc_url));startActivity(i);break;
            case R.id.dis : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(dis_url));startActivity(i);break;
            case R.id.dm : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(dm_url));startActivity(i);break;
            case R.id.ds : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ds_url));startActivity(i);break;
            case R.id.dsc : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(dsc_url));startActivity(i);break;
            case R.id.ecm : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ecm_url));startActivity(i);break;
            case R.id.evs : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(evs_url));startActivity(i);break;
            case R.id.is : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(is_url));startActivity(i);break;
            case R.id.java : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(java_url));startActivity(i);break;
            case R.id.lsst : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(lsst_url));startActivity(i);break;
            case R.id.ms : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ms_url));startActivity(i);break;
            case R.id.m1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(m1_url));startActivity(i);break;
            case R.id.m2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(m2_url));startActivity(i);break;
            case R.id.m3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(m3_url));startActivity(i);break;
            case R.id.m4 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(m4_url));startActivity(i);break;
            case R.id.mea : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mea_url));startActivity(i);break;
            case R.id.mech1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech1_url));startActivity(i);break;
            case R.id.mech2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mech2_url));startActivity(i);break;
            case R.id.mpi : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(mpi_url));startActivity(i);break;
            case R.id.oosd : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(oosd_url));startActivity(i);break;
            case R.id.os : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(os_url));startActivity(i);break;
            case R.id.phy1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(phy1_url));startActivity(i);break;
            case R.id.phy2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(phy2_url));startActivity(i);break;
            case R.id.ppl : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ppl_url));startActivity(i);break;
            case R.id.se : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(se_url));startActivity(i);break;
            case R.id.ssa : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(ssa_url));startActivity(i);break;
            case R.id.wps : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(wps_url));startActivity(i);break;
            case R.id.spm : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(spm_url));startActivity(i);break;
            case R.id.paes : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(paes_url));startActivity(i);break;

            default:break;

        }


    }
}

