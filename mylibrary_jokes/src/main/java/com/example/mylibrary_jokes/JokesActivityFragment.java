package com.example.mylibrary_jokes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokesActivityFragment extends Fragment {


    public JokesActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_jokes_activity, container, false);
       String gce_res = getActivity().getIntent().getStringExtra("gce_result");
        TextView gce_result_show = (TextView) v.findViewById(R.id.jokes_text_view);
        if(gce_res==""){
            gce_res="no data to show";
        }
        gce_result_show.setText(gce_res);

        return v;
    }

}
