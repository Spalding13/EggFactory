package com.example.android.eggfactory;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class EggPartFragment extends Fragment {
    private String LIST_BUN_PARAM = "list_res_ids";
    private String INDEX_BUN_PARAM = "index";
    private final String LOG_TAG = "EggPartFragment";
    private List<Integer> mListIds;
    private int mIndex;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (savedInstanceState != null) {
            mListIds = savedInstanceState.getIntegerArrayList(LIST_BUN_PARAM);
            mIndex = savedInstanceState.getInt(INDEX_BUN_PARAM);
        }

        View root = inflater.inflate(R.layout.egg_part_fragment, container, false);
        final ImageView imageView = (ImageView) root.findViewById(R.id.egg_part_image_view);
        if (mListIds != null) {

            int imageResource = mListIds.get(mIndex);
            imageView.setImageResource(imageResource);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mIndex < mListIds.size() - 1) {
                        mIndex++;
                    } else {
                        mIndex = 0;
                    }
                    imageView.setImageResource(mListIds.get(mIndex));
                }
            });
        } else {
            Log.e(LOG_TAG, "list is null");
        }
        return imageView;
    }

    public void setmIndex(int index) {
        mIndex = index;
    }

    public void setmListIds(List<Integer> list) {
        mListIds = list;
    }

    Bundle savedInstanceState = new Bundle();

    @Override
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(LIST_BUN_PARAM, (ArrayList<Integer>) mListIds);
        currentState.putInt(INDEX_BUN_PARAM, mIndex);

    }
}
