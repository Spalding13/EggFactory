package com.example.android.eggfactory.data;

import com.example.android.eggfactory.R;

import java.util.ArrayList;
import java.util.List;

public class EggResourceFetcher {

    private static final List<Integer> uppers = new ArrayList<Integer>() {{
        add(R.drawable.top_1);
        add(R.drawable.top_2);
        add(R.drawable.top_3);
        add(R.drawable.top_4);
        add(R.drawable.top_5);
        add(R.drawable.top_6);
        add(R.drawable.top_7);
        add(R.drawable.top_8);
        add(R.drawable.top_9);
        add(R.drawable.top_9n1);
        add(R.drawable.top_9n2);
        add(R.drawable.top_9n3);
        add(R.drawable.top_9n4);
        add(R.drawable.top_9n5);
        add(R.drawable.top_9n6);
        add(R.drawable.top_9n7);
        add(R.drawable.top_9n8);
        add(R.drawable.top_9n9);
        add(R.drawable.top_9n10);
        add(R.drawable.top_9n11);
    }};

    private static final List<Integer> middles = new ArrayList<Integer>() {{
        add(R.drawable.middle_1);
        add(R.drawable.middle_2);
        add(R.drawable.middle_3);
        add(R.drawable.middle_4);
        add(R.drawable.middle_5);
        add(R.drawable.middle_6);
        add(R.drawable.middle_7);
        add(R.drawable.middle_8);
        add(R.drawable.middle_9);
        add(R.drawable.middle_9n1);
        add(R.drawable.middle_9n2);
        add(R.drawable.middle_9n3);
        add(R.drawable.middle_9n4);
        add(R.drawable.middle_9n5);
        add(R.drawable.middle_9n6);
        add(R.drawable.middle_9n7);
        add(R.drawable.middle_9n8);
        add(R.drawable.middle_9n9);
        add(R.drawable.middle_9n10);
        add(R.drawable.middle_9n11);


    }};

    private static final List<Integer> bottoms = new ArrayList<Integer>() {{
        add(R.drawable.bottom);
        add(R.drawable.bottom_1);
        add(R.drawable.bottom_2);
        add(R.drawable.bottom_3);
        add(R.drawable.bottom_4);
        add(R.drawable.bottom_5);
        add(R.drawable.bottom_6);
        add(R.drawable.bottom_7);
        add(R.drawable.bottom_8);
        add(R.drawable.bottom_9);
        add(R.drawable.bottom_9n1);
        add(R.drawable.bottom_9n2);
        add(R.drawable.bottom_9n3);
        add(R.drawable.bottom_9n4);
        add(R.drawable.bottom_9n5);
        add(R.drawable.bottom_9n6);
        add(R.drawable.bottom_9n7);
        add(R.drawable.bottom_9n8);
        add(R.drawable.bottom_9n9);
        add(R.drawable.bottom_9n10);


    }};

    private static final List<Integer> allParts = new ArrayList<Integer>(){{
       addAll(uppers);
       addAll(middles);
       addAll(bottoms);
    }};
    public static List<Integer> getUppers() {
        return uppers;
    }

    public static List<Integer> getMiddles() {
        return middles;
    }

    public static List<Integer> getBottoms() {
        return bottoms;
    }

    public static List<Integer> getAllParts() {return allParts;}
}
