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
public class DaftarFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public DaftarFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static DaftarFragment newInstance(int sectionNumber) {
        DaftarFragment fragment = new DaftarFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_daftar, container, false);



        return rootView;

    }
}
