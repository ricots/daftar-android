package id.jajaka.pendaftaranmahasiswa.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.jajaka.pendaftaranmahasiswa.R;
import id.jajaka.pendaftaranmahasiswa.activity.LoginCandidate;
import id.jajaka.pendaftaranmahasiswa.activity.RegisterActivity;

/**
 * Created by Willymar on 5/8/2016.
 */
public class TabFragment5 extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private Button btnDaftar;
    private Button btnLogin;
    private static final String ARG_SECTION_NUMBER = "section_number";

    public TabFragment5() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabFragment5 newInstance(int sectionNumber) {
        TabFragment5 fragment = new TabFragment5();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_tab_5, container, false);
        btnDaftar = (Button) rootView.findViewById(R.id.daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnLogin = (Button) rootView.findViewById(R.id.login);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), LoginCandidate.class);
                startActivity(intent);
            }
        });

        return rootView;

    }
}
