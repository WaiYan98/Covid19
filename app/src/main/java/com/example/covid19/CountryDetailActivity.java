package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.covid19.adapter.CountryDetailListAdapter;
import com.example.covid19.model.Covid19;
import com.example.covid19.model.Item;
import com.example.covid19.util.VerticalSpaceItemDecoration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CountryDetailActivity extends AppCompatActivity {

    public static final String EXTRA_COVID_19_COUNTRY_DETAIL = "EXTRA_COVID_19_COUNTRY_DETAIL";

    private Covid19 covid19;

    @BindView(R.id.img_flag)
    ImageView imgFlag;
    @BindView(R.id.txt_country_name)
    TextView txtCountryName;
    @BindView(R.id.txt_continent_name)
    TextView txtContinentName;
    @BindView(R.id.recy_country_detail)
    RecyclerView recyCountryDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        if (intent != null) {

            covid19 = intent.getParcelableExtra(EXTRA_COVID_19_COUNTRY_DETAIL);

        }

        Glide
                .with(this)
                .load(covid19.getCountryInfo().getFlag())
                .into(imgFlag);

        txtCountryName.setText(covid19.getCountry());
        txtContinentName.setText(covid19.getContinent());


        recyCountryDetail.setAdapter(new CountryDetailListAdapter(getItemList(covid19)));
        recyCountryDetail.setLayoutManager(new LinearLayoutManager(this));
        recyCountryDetail.addItemDecoration(new VerticalSpaceItemDecoration(8));
    }

    public List<Item> getItemList(Covid19 covid19) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item(covid19.getNameCases(), covid19.getCases()));
        itemList.add(new Item(covid19.getNameTodayCases(), covid19.getTodayCases()));
        itemList.add(new Item(covid19.getNameDeaths(), covid19.getDeaths()));
        itemList.add(new Item(covid19.getNameTodayDeaths(), covid19.getTodayDeaths()));
        itemList.add(new Item(covid19.getNameRecovered(), covid19.getRecovered()));
        itemList.add(new Item(covid19.getNameTodayRecovered(), covid19.getTodayRecovered()));
        itemList.add(new Item(covid19.getNameActive(), covid19.getActive()));
        itemList.add(new Item(covid19.getNameCritical(), covid19.getCritical()));
        itemList.add(new Item(covid19.getNameCasesPerOneMillion(), (int) covid19.getCasesPerOneMillion()));
        itemList.add(new Item(covid19.getNameDeathsPerOneMillion(), (int) covid19.getDeathsPerOneMillion()));
        itemList.add(new Item(covid19.getNameTests(), covid19.getTests()));
        itemList.add(new Item(covid19.getNameTestsPerOneMillion(), (int) covid19.getTestsPerOneMillion()));
        itemList.add(new Item(covid19.getNamePopulation(), covid19.getPopulation()));

        return itemList;
    }

}