package com.example.android.eggfactory;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.eggfactory.data.EggPartAdapter;

public class MasterListFragment extends Fragment{

    OnTouchCallbacks mCallback;
    public interface OnTouchCallbacks{
        void doSomething(int position);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // This makes sure that the host activity has implemented the callback interface
        // If not, it throws an exception
        try {
            mCallback = (OnTouchCallbacks) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnTouchCallbacks");
        }
    }

    public MasterListFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.master_list_fragment, container, false);
        GridView gridView = (GridView)view.findViewById(R.id.grid_list);
        gridView.setNumColumns(3);
        EggPartAdapter gridAdapter = new EggPartAdapter(getContext());
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mCallback.doSomething(i);
            }
        });
        return gridView;
    }
}
