package id.orchys.app.savekayo.main.image;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.orchys.app.savekayo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddImageFragment extends Fragment {


    public AddImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_image, container, false);
    }

}
