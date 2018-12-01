package maxplus.kmj.com.maxplus.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import maxplus.kmj.com.maxplus.R;

public class MediaFragment extends Fragment {


    public static MediaFragment newInstance() {
        MediaFragment fragment = new MediaFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v;
        v=inflater.inflate(R.layout.fragment_media, container, false);
        return v;
    }



}
