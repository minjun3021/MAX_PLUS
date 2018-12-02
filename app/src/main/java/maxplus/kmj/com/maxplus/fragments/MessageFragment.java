package maxplus.kmj.com.maxplus.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import maxplus.kmj.com.maxplus.R;
import maxplus.kmj.com.maxplus.adapter.RecyclerviewAdapter;
import maxplus.kmj.com.maxplus.item.Item;

public class MessageFragment extends Fragment {
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    RecyclerviewAdapter mAdapter;

    public static MessageFragment newInstance() {
        MessageFragment fragment = new MessageFragment();
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
        v=inflater.inflate(R.layout.fragment_message, container, false);
        ArrayList<Item> items = new ArrayList<>();
        mRecyclerView = v.findViewById(R.id.message_recyclerview);
        items.add(new Item("리플", 100,"구매완료","2018-12-02"));
        items.add(new Item("리플", 100,"구매완료","2018-12-02"));
        items.add(new Item("리플", 100,"구매완료","2018-12-02"));
        mLayoutManager = new LinearLayoutManager(getContext());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RecyclerviewAdapter(items);
        mRecyclerView.setAdapter(mAdapter);
        return v;
    }



}
