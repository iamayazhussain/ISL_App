package isl.ayaz.papers;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import isl.ayaz.R;

public class CIVILPapers extends AppCompatActivity implements View.OnClickListener {


    private CardView ate,bd,bts,chem1,chem2,ct,cma,sedd1,sedd2,dmm,et,eg,ee,es,eletech,fm1,fm2,fe,git,hwm,m1,m2,m3,mea,mech1,mech2,nm,phy1,phy2,rcc,te,sm,ss,sm1,sm2,sur1,sur2,tos1,tos2,wre1,wre2,wwre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilpapers);

        setTitle("CIVIL Papers");


        ate = findViewById(R.id.ate);
        bd = findViewById(R.id.bd);
        bts = findViewById(R.id.bts);
        chem1 = findViewById(R.id.chem1);
        chem2 = findViewById(R.id.chem2);
        ct = findViewById(R.id.ct);
        cma = findViewById(R.id.cma);
        sedd1 = findViewById(R.id.sedd1);
        sedd2 = findViewById(R.id.sedd2);
        dmm = findViewById(R.id.dmm);
        et = findViewById(R.id.et);
        eg = findViewById(R.id.eg);
        ee = findViewById(R.id.ee);
        es = findViewById(R.id.es);
        eletech = findViewById(R.id.eletech);
        fm1 = findViewById(R.id.fm1);
        fm2 = findViewById(R.id.fm2);
        fe = findViewById(R.id.fe);
        git = findViewById(R.id.git);
        hwm = findViewById(R.id.hwm);
        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m3 = findViewById(R.id.m3);
        mea = findViewById(R.id.mea);
        mech1 = findViewById(R.id.mech1);
        mech2 = findViewById(R.id.mech2);
        nm = findViewById(R.id.nm);
        phy1 = findViewById(R.id.phy1);
        phy2 = findViewById(R.id.phy2);
        rcc = findViewById(R.id.rcc);
        te = findViewById(R.id.te);
        sm = findViewById(R.id.sm);
        ss = findViewById(R.id.ss);
        sm1 = findViewById(R.id.sm1);
        sm2 = findViewById(R.id.sm2);
        sur1 = findViewById(R.id.sur1);
        sur2 = findViewById(R.id.sur2);
        tos1 = findViewById(R.id.tos1);
        tos2 = findViewById(R.id.tos2);
        wre1 = findViewById(R.id.wre1);
        wre2 = findViewById(R.id.wre2);
        wwre = findViewById(R.id.wwre);



        ate.setOnClickListener(this);
        bd.setOnClickListener(this);
        bts.setOnClickListener(this);
        chem1.setOnClickListener(this);
        chem2.setOnClickListener(this);
        ct.setOnClickListener(this);
        cma.setOnClickListener(this);
        sedd1.setOnClickListener(this);
        sedd2.setOnClickListener(this);
        dmm.setOnClickListener(this);
        et.setOnClickListener(this);
        eg.setOnClickListener(this);
        ee.setOnClickListener(this);
        es.setOnClickListener(this);
        eletech.setOnClickListener(this);
        fm1.setOnClickListener(this);
        fm2.setOnClickListener(this);
        fe.setOnClickListener(this);
        git.setOnClickListener(this);
        hwm.setOnClickListener(this);
        m1.setOnClickListener(this);
        m2.setOnClickListener(this);
        m3.setOnClickListener(this);
        mea.setOnClickListener(this);
        mech1.setOnClickListener(this);
        mech2.setOnClickListener(this);
        nm.setOnClickListener(this);
        phy1.setOnClickListener(this);
        phy2.setOnClickListener(this);
        rcc.setOnClickListener(this);
        te.setOnClickListener(this);
        sm.setOnClickListener(this);
        ss.setOnClickListener(this);
        sm1.setOnClickListener(this);
        sm2.setOnClickListener(this);
        sur1.setOnClickListener(this);
        sur2.setOnClickListener(this);
        tos1.setOnClickListener(this);
        tos2.setOnClickListener(this);
        wre1.setOnClickListener(this);
        wre2.setOnClickListener(this);
        wwre.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent i;
        String url_ate = "https://drive.google.com/open?id=1GDAOuPAa9I55Dm2F1xa8YRbAbs31XdHj";
        String url_bd = "https://drive.google.com/open?id=0B14lF0mcPupdRFpVX1V2TFJ3V0E";
        String url_bts = "https://drive.google.com/open?id=0B14lF0mcPupdY0lwVlFRVUJFaDQ";
        String url_chem1 = "https://drive.google.com/open?id=1SYOsifHT-W1cNOJrOwxrDBKOA-M-sKvk";
        String url_chem2 = "https://drive.google.com/open?id=1Et569BsE_4xYD5BkKfTYkfXE8Wnagh7L";
        String url_ct = "https://drive.google.com/open?id=0B14lF0mcPupdbkZRc3RUb2NMOHc";
        String url_cma = "https://drive.google.com/open?id=0B14lF0mcPupdci0yNmxHRWV4eVE";
        String url_sedd1 = "https://drive.google.com/open?id=0B14lF0mcPupdNFpMOWd6Vk11SmM";
        String url_sedd2 = "https://drive.google.com/open?id=0B14lF0mcPupdRWJfVzFPWExUTzg";
        String url_dmm = "https://drive.google.com/open?id=0B14lF0mcPupdODQwTTBvWU1lbG8";
        String url_et = "https://drive.google.com/open?id=0B14lF0mcPupddDZvSmk2RHk5OUU";
        String url_eg = "https://drive.google.com/open?id=0B14lF0mcPupdZG50UG9ZMDZNTFU";
        String url_ee = "https://drive.google.com/open?id=0B14lF0mcPupdTWE3YTBiOFNTVDA";
        String url_es = "https://drive.google.com/open?id=0B14lF0mcPupdWnMxTUpoQ1d6UFU";
        String url_eletech = "https://drive.google.com/open?id=0B14lF0mcPupdLUlhU3JMMnZGbFE";
        String url_fm1 = "https://drive.google.com/open?id=15dgQA5z-wEPUN1V3pV4amHPyAxX_-JNH";
        String url_fm2 = "https://drive.google.com/open?id=0B14lF0mcPupdOE9MMUVrU2VhQWs";
        String url_fe = "https://drive.google.com/open?id=0B14lF0mcPupdRTBjc2tPcElaMmM";
        String url_git = "https://drive.google.com/open?id=0B14lF0mcPupdMFdfVW85dmhiS0E";
        String url_hwm = "https://drive.google.com/open?id=1NNeVISTKaqrIsI0WFDk3plXZHfB9q3Ds";
        String url_m1 = "https://drive.google.com/open?id=1aPtlVNQTypQVhrWUfokiQdIpnakts2E7";
        String url_m2 = "https://drive.google.com/open?id=1W9QkqMIA_SGvSAcA1qBdqlGIXDE65oO3";
        String url_m3 = "https://drive.google.com/open?id=0B14lF0mcPupdWVNqemllbGpWbDA";
        String url_mea = "https://drive.google.com/open?id=0B14lF0mcPupdSlV2RGRJbjVwYU0";
        String url_mech1 = "https://drive.google.com/open?id=0B14lF0mcPupdbGtNNk02WFB4SnM";
        String url_mech2 = "https://drive.google.com/open?id=1vzKWgxCKtAIBlTUS9iKYxzJqQwioqmd8";
        String url_nm = "https://drive.google.com/open?id=1uGyFYyQIbi5lqhP3CMtUZErokrjh4G52";
        String url_phy1 = "https://drive.google.com/open?id=1ZFg7Q0SqaECTslgej7n1tkUEVjsiRvKY";
        String url_phy2 = "https://drive.google.com/open?id=12RZuboCyfcGFuLq1BN3QZbQk6dwgOBH6";
        String url_rcc = "https://drive.google.com/open?id=1kXZAxa7mOY3SkFWlQZWzmjLbzQkBSZdp";
        String url_te = "https://drive.google.com/open?id=1I6Lx-0JZOoOnjK7BfJnjUmuyoM41CnKc";
        String url_sm = "https://drive.google.com/open?id=0B14lF0mcPupdcEk3UFNHYWp1eFU";
        String url_ss = "https://drive.google.com/open?id=1Rq4vKmikVqrxLD2R-cjJ7aN5Fe7Rz05E";
        String url_sm1 = "https://drive.google.com/open?id=0B14lF0mcPupdbzJDelNzcEY3Nkk";
        String url_sm2 = "https://drive.google.com/open?id=0B14lF0mcPupdU3FrNE82b19QZzQ";
        String url_sur1 = "https://drive.google.com/open?id=0B14lF0mcPupdRHhGOWVZMS1YaG8";
        String url_sur2 = "https://drive.google.com/open?id=0B14lF0mcPupdc0hnVHNkTUxiMDQ";
        String url_tos1 = "https://drive.google.com/open?id=0B14lF0mcPupdQ0NIOFc0dHBmWGc";
        String url_tos2 = "https://drive.google.com/open?id=0B14lF0mcPupdeGFILTNrc3c3UW8";
        String url_wre1 = "https://drive.google.com/open?id=0B14lF0mcPupdakVmOUx6T2I2Q1E";
        String url_wre2 = "https://drive.google.com/open?id=0B14lF0mcPupdQkVXQ210Rk9mZ2s";
        String url_wwre = "https://drive.google.com/open?id=11QE_1_8sAPOnU3YYUjD1b0P5wAiLq0sC";

        switch(v.getId()){

            case R.id.ate : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_ate));startActivity(i);break;
            case R.id.bd : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_bd));startActivity(i);break;
            case R.id.bts : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_bts));startActivity(i);break;
            case R.id.chem1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_chem1));startActivity(i);break;
            case R.id.chem2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_chem2));startActivity(i);break;
            case R.id.ct : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_ct));startActivity(i);break;
            case R.id.cma : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_cma));startActivity(i);break;
            case R.id.sedd1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_sedd1));startActivity(i);break;
            case R.id.sedd2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_sedd2));startActivity(i);break;
            case R.id.dmm : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_dmm));startActivity(i);break;
            case R.id.et : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_et));startActivity(i);break;
            case R.id.eg : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_eg));startActivity(i);break;
            case R.id.ee : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_ee));startActivity(i);break;
            case R.id.es : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_es));startActivity(i);break;
            case R.id.eletech : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_eletech));startActivity(i);break;
            case R.id.fm1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_fm1));startActivity(i);break;
            case R.id.fm2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_fm2));startActivity(i);break;
            case R.id.fe : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_fe));startActivity(i);break;
            case R.id.git : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_git));startActivity(i);break;
            case R.id.hwm : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_hwm));startActivity(i);break;
            case R.id.m1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_m1));startActivity(i);break;
            case R.id.m2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_m2));startActivity(i);break;
            case R.id.m3 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_m3));startActivity(i);break;
            case R.id.mea : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_mea));startActivity(i);break;
            case R.id.mech1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_mech1));startActivity(i);break;
            case R.id.mech2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_mech2));startActivity(i);break;
            case R.id.nm : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_nm));startActivity(i);break;
            case R.id.phy1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_phy1));startActivity(i);break;
            case R.id.phy2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_phy2));startActivity(i);break;
            case R.id.rcc : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_rcc));startActivity(i);break;
            case R.id.te : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_te));startActivity(i);break;
            case R.id.sm : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_sm));startActivity(i);break;
            case R.id.ss : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_ss));startActivity(i);break;
            case R.id.sm1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_sm1));startActivity(i);break;
            case R.id.sm2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_sm2));startActivity(i);break;
            case R.id.sur1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_sur1));startActivity(i);break;
            case R.id.sur2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_sur2));startActivity(i);break;
            case R.id.tos1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_tos1));startActivity(i);break;
            case R.id.tos2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_tos2));startActivity(i);break;
            case R.id.wre1 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_wre1));startActivity(i);break;
            case R.id.wre2 : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_wre2));startActivity(i);break;
            case R.id.wwre : i = new Intent(Intent.ACTION_VIEW);i.setData(Uri.parse(url_wwre));startActivity(i);break;

            default:break;

        }


    }
}

