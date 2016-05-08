package id.jajaka.pendaftaranmahasiswa.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.jajaka.pendaftaranmahasiswa.R;

/**
 * Created by Willymar on 5/8/2016.
 */
public class TabFragment3 extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public TabFragment3() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabFragment3 newInstance(int sectionNumber) {
        TabFragment3 fragment = new TabFragment3();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tab_3, container, false);



        return rootView;

    }
}
