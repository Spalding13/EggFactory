package com.example.android.eggfactory;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.GridView;
import android.widget.Toast;

import com.example.android.eggfactory.data.EggResourceFetcher;

import static com.example.android.eggfactory.data.EggResourceFetcher.getBottoms;
import static com.example.android.eggfactory.data.EggResourceFetcher.getMiddles;
import static com.example.android.eggfactory.data.EggResourceFetcher.getUppers;

public class MainActivity extends FragmentActivity implements MasterListFragment.OnTouchCallbacks{
    int mHeadIndex;
    int mBodyIndex;
    int mLegIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            EggPartFragment upperFragment = new EggPartFragment();
            upperFragment.setmListIds(EggResourceFetcher.getUppers());
            upperFragment.setmIndex(0);
            android.app.FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .add(R.id.upper_frame, upperFragment, null)
                    .commit();

            EggPartFragment middleFragment = new EggPartFragment();
            middleFragment.setmListIds(EggResourceFetcher.getMiddles());
            middleFragment.setmIndex(0);
            fragmentManager.beginTransaction()
                    .add(R.id.middle_frame, middleFragment, null).commit();

            EggPartFragment bottomFragment = new EggPartFragment();
            bottomFragment.setmListIds(EggResourceFetcher.getBottoms());
            bottomFragment.setmIndex(0);
            fragmentManager.beginTransaction()
                    .add(R.id.lower_frame, bottomFragment, null).commit();

            GridView gridView = (GridView) findViewById(R.id.grid_list);
            gridView.setNumColumns(3);


        }
    }

    public void doSomething(int position){
        Toast.makeText(this, "Position clicked = " + position, Toast.LENGTH_SHORT).show();
        int partNumber = position/20;
        Log.i("Part number is","="+partNumber);
        //This is to ensure a correct number between 0-19
        int index=position-partNumber*20;


        switch (partNumber){
            case 0:mHeadIndex=index;
                EggPartFragment upperFragment = new EggPartFragment();
                upperFragment.setmListIds(EggResourceFetcher.getUppers());
                upperFragment.setmIndex(mHeadIndex);
                getFragmentManager().beginTransaction()
                        .replace(R.id.upper_frame, upperFragment, null).commit();
            break;
            case 1:mBodyIndex=index;
                EggPartFragment middleFragment = new EggPartFragment();
                middleFragment.setmListIds(EggResourceFetcher.getMiddles());
                middleFragment.setmIndex(mBodyIndex);
                getFragmentManager().beginTransaction()
                        .replace(R.id.middle_frame, middleFragment, null).commit();
            break;
            case 2:mLegIndex=index;
                EggPartFragment lowerFragment = new EggPartFragment();
                lowerFragment.setmListIds(EggResourceFetcher.getBottoms());
                lowerFragment.setmIndex(mLegIndex);
                getFragmentManager().beginTransaction()
                        .replace(R.id.lower_frame, lowerFragment, null).commit();
            break;





        }

    }
}
