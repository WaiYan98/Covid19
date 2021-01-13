package com.example.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid19.R;
import com.example.covid19.adapter.Covid19TotalCasesInWorldAdapter;
import com.example.covid19.model.GlobalCovid19;
import com.example.covid19.model.GlobalData;
import com.example.covid19.util.HorizontalSpaceItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

    public static final String EXTRA_GLOBAL_DATA = "EXTRA_GLOBAL_DATA";

    private List<GlobalData> globalDataList;

    private HomeFragment() {

    }

    @BindView(R.id.recy_covid19_total_cases)
    RecyclerView recyCovid19TotalCases;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();

        if (bundle != null) {
            globalDataList = bundle.getParcelableArrayList(EXTRA_GLOBAL_DATA);
        }


        recyCovid19TotalCases.setAdapter(new Covid19TotalCasesInWorldAdapter(globalDataList));
        recyCovid19TotalCases.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        recyCovid19TotalCases.addItemDecoration(new HorizontalSpaceItemDecoration(20));

    }

    public static HomeFragment getNewInstance(String key, List<GlobalData> globalDataList) {
        HomeFragment hf = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(key, new ArrayList<>(globalDataList));
        hf.setArguments(bundle);
        return hf;
    }

}
