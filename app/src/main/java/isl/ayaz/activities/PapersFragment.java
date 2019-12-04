package isl.ayaz.activities;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import isl.ayaz.R;
import isl.ayaz.papers.CIVILPapers;
import isl.ayaz.papers.CSEPapers;
import isl.ayaz.papers.MECHPapers;
import isl.ayaz.syllabus.CIVILActivity;
import isl.ayaz.syllabus.CSEActivity;
import isl.ayaz.syllabus.ECEActivity;
import isl.ayaz.syllabus.EEEActivity;
import isl.ayaz.syllabus.ITActivity;
import isl.ayaz.syllabus.MECHActivity;


public class PapersFragment extends Fragment {

    private CardView cse,civil,ece,eee,mech,it;

    public PapersFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_papers,container,false);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        cse = getActivity().findViewById(R.id.cse_paper);
        it = getActivity().findViewById(R.id.it_paper);
        ece = getActivity().findViewById(R.id.ece_paper);
        eee = getActivity().findViewById(R.id.eee_paper);
        civil = getActivity().findViewById(R.id.civil_paper);
        mech = getActivity().findViewById(R.id.mech_paper);



        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cse = new Intent(getActivity(), CSEPapers.class);
                startActivity(cse);


            }
        });


        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),
                        "will be uploaded Soon", Toast.LENGTH_LONG).show();

            }
        });


        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),
                        "will be uploaded Soon", Toast.LENGTH_LONG).show();


            }
        });


        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),
                        "will be uploaded Soon", Toast.LENGTH_LONG).show();


            }
        });


        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent civil = new Intent(getActivity(), CIVILPapers.class);
                startActivity(civil);
            }
        });

        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),
                        "will be uploaded Soon", Toast.LENGTH_LONG).show();


            }
        });



    }



}