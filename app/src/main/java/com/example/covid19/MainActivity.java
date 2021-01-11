package com.example.covid19;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.covid19.adapter.Covid19CaseCountryListAdapter;
import com.example.covid19.model.Covid19;
import com.example.covid19.model.GlobalCovid19;
import com.example.covid19.model.GlobalData;
import com.example.covid19.util.Sorting;
import com.example.fragment.CountriesFragment;
import com.example.view_pager.Covid19PagerAdapter;
import com.google.android.material.tabs.TabLayout;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Covid19CaseCountryListAdapter.CallBack, CountriesFragment.CallBack {

    public static final String EXTRA_COVID_19 = "EXTRA_COVID_19";
    public static final String EXTRA_GLOBAL_COVID_19 = "EXTRA_GLOBAL_COVID_19";
    private List<Covid19> covid19AllData;
    private GlobalCovid19 globalCovid19;
    private List<Covid19> covid19List;

    @BindView(R.id.vp_covid_19)
    ViewPager vpCovid19;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        if (intent != null) {
            globalCovid19 = intent.getParcelableExtra(EXTRA_GLOBAL_COVID_19);
            covid19List = intent.getParcelableArrayListExtra(EXTRA_COVID_19);
        }

        List<GlobalData> globalDataList = getGlobalDataList(globalCovid19);
        List<Covid19> sortedCovid19List = Sorting.sortCovid19List(covid19List);

        vpCovid19.setAdapter(new Covid19PagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, globalDataList, sortedCovid19List, this, this));

        tabLayout.setupWithViewPager(vpCovid19);

        setTabIcon(tabLayout.getTabAt(0), R.drawable.ic_home);
        setTabIcon(tabLayout.getTabAt(1), R.drawable.ic_country);
        setTabIcon(tabLayout.getTabAt(2), R.drawable.ic_info);


    }

    public void setTabIcon(TabLayout.Tab tab, @DrawableRes int icon) {

        View view = getLayoutInflater().inflate(R.layout.tab_icon, null, false);
        ImageView imgTabIcon = view.findViewById(R.id.img_tab_icon);

        imgTabIcon.setImageDrawable(ContextCompat.getDrawable(this, icon));

        tab.setCustomView(view);

    }

    public void goToCountryDetailActivity(Covid19 covid19) {
        Intent intent = new Intent(this, CountryDetailActivity.class);
        intent.putExtra(CountryDetailActivity.EXTRA_COVID_19_COUNTRY_DETAIL, covid19);
        startActivity(intent);
    }

    private List<GlobalData> getGlobalDataList(GlobalCovid19 globalCovid19) {

        List<GlobalData> globalDataList = new ArrayList<>();

        globalDataList.add(new GlobalData("Total Coronavirus Cases,World:", globalCovid19.getCases(),
                "Total Deaths", globalCovid19.getDeaths(),
                "Total Recovered", globalCovid19.getRecovered()));
        globalDataList.add(new GlobalData("Today Coronavirus Cases,World:", globalCovid19.getTodayCases(),
                "Today Deaths", globalCovid19.getTodayDeaths(),
                "Today Recovered", globalCovid19.getTodayRecovered()));

        return globalDataList;
    }

    @Override
    public void onClickDetail(Covid19 currentCountryCovid19data) {
        goToCountryDetailActivity(currentCountryCovid19data);
    }

    @Override
    public void onClickSearch(Covid19 covid19) {
        goToCountryDetailActivity(covid19);
    }
}