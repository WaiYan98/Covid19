package com.example.view_pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.covid19.adapter.Covid19CaseCountryListAdapter;
import com.example.covid19.model.Covid19;
import com.example.covid19.model.GlobalCovid19;
import com.example.covid19.model.GlobalData;
import com.example.fragment.CountriesFragment;
import com.example.fragment.HomeFragment;
import com.example.fragment.InfoFragment;

import java.util.List;

public class Covid19PagerAdapter extends FragmentStatePagerAdapter {

    private List<GlobalData> globalDataList;
    private List<Covid19> covid19List;
    private Covid19CaseCountryListAdapter.CallBack callBack;
    private CountriesFragment.CallBack callBackCf;

    public Covid19PagerAdapter(@NonNull FragmentManager fm, int behavior, List<GlobalData> globalDataList, List<Covid19> covid19List, Covid19CaseCountryListAdapter.CallBack callBack, CountriesFragment.CallBack callBackCf) {
        super(fm, behavior);
        this.globalDataList = globalDataList;
        this.covid19List = covid19List;
        this.callBack = callBack;
        this.callBackCf = callBackCf;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        HomeFragment hf = new HomeFragment(globalDataList);
        CountriesFragment cf = new CountriesFragment(covid19List, callBack, callBackCf);
        InfoFragment infoF = new InfoFragment();

        switch (position) {
            case 0:
                return hf;
            case 1:
                return cf;
            case 2:
                return infoF;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
