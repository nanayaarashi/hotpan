package com.project.pan.ui.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.project.pan.R;
import com.project.pan.ui.viewpager.ViewPagerAdapter;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private ArrayList<Integer> mImgArray = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initImgResource();
        ViewPagerAdapter mAdapter = new ViewPagerAdapter(this.getContext(), mImgArray);

        ViewPager mPager = root.findViewById(R.id.imageViewPager);
        mPager.setAdapter(mAdapter);
        mPager.setPadding(100, 0, 100, 0);

        return root;
    }


    private void initImgResource() {
        mImgArray.add(R.drawable.dong_po_rou_1080x676);
        mImgArray.add(R.drawable.fennelandherbbarbecu_67598_16x9);
        mImgArray.add(R.drawable.fgoeufs_brouilles_6);
        mImgArray.add(R.drawable.fish_curry_09718_16x9);
        mImgArray.add(R.drawable.honey_orange_roast_sea_bass_with_lentils);
        mImgArray.add(R.drawable.recipe_image_legacy_id_423533_12);
        mImgArray.add(R.drawable.sauteed_fish_platter);
        mImgArray.add(R.drawable.smoky_hake_beans_greens_with_quick_garlic_mayonnaise);
        mImgArray.add(R.drawable.softened_sweet_onion_and_80481_16x9);
    }
}