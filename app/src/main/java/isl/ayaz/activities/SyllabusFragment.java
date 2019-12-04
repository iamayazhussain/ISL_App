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
import android.support.v4.app.Fragment;
import isl.ayaz.R;
import isl.ayaz.syllabus.CIVILActivity;
import isl.ayaz.syllabus.CSEActivity;
import isl.ayaz.syllabus.ECEActivity;
import isl.ayaz.syllabus.EEEActivity;
import isl.ayaz.syllabus.ITActivity;
import isl.ayaz.syllabus.MECHActivity;


public class SyllabusFragment extends Fragment {

    private CardView cse,civil,ece,eee,mech,it,almanac;

    public SyllabusFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_syllabus,container,false);


        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        cse = getActivity().findViewById(R.id.cse_card);
        it = getActivity().findViewById(R.id.it_card);
        ece = getActivity().findViewById(R.id.ece_card);
        eee = getActivity().findViewById(R.id.eee_card);
        civil = getActivity().findViewById(R.id.civil_card);
        mech = getActivity().findViewById(R.id.mech_card);
        almanac = getActivity().findViewById(R.id.almanac);



        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cse = new Intent(getActivity(), CSEActivity.class);
                startActivity(cse);


            }
        });


        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), ITActivity.class);
                startActivity(it);


            }
        });


        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ece = new Intent(getActivity(), ECEActivity.class);
                startActivity(ece);


            }
        });


        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eee = new Intent(getActivity(), EEEActivity.class);
                startActivity(eee);


            }
        });


        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent civil = new Intent(getActivity(), CIVILActivity.class);
                startActivity(civil);


            }
        });


        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mech = new Intent(getActivity(), MECHActivity.class);
                startActivity(mech);


            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent civil = new Intent(getActivity(), CIVILActivity.class);
                startActivity(civil);


            }
        });

        almanac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent almanac = new Intent(Intent.ACTION_VIEW);
                almanac.setData(Uri.parse("https://drive.google.com/uc?export=download&id=1_GyMm14yQowfsb3MlKvvXkFz_eSU9r1N"));
                getActivity().startActivity(almanac);
            }
        });



    }

}
