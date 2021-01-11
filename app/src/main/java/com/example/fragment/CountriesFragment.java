package com.example.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.annimon.stream.Collectors;
import com.annimon.stream.Stream;
import com.example.covid19.CountryDetailActivity;
import com.example.covid19.R;
import com.example.covid19.adapter.Covid19CaseCountryListAdapter;
import com.example.covid19.model.Covid19;
import com.example.covid19.util.VerticalSpaceItemDecoration;

import java.util.List;
import java.util.function.Predicate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CountriesFragment extends Fragment {

    private List<Covid19> covid19List;
    private Covid19CaseCountryListAdapter.CallBack callBack;
    private CallBack callBackCf;

    public CountriesFragment(List<Covid19> covid19List, Covid19CaseCountryListAdapter.CallBack callBack, CallBack callBackCf) {
        this.covid19List = covid19List;
        this.callBack = callBack;
        this.callBackCf = callBackCf;
    }

    @BindView(R.id.auto_complete_text_view)
    AutoCompleteTextView autoCompleteTextView;
    @BindView(R.id.recy_covid19_case_country_list)
    RecyclerView recyCovid19CaseCountryList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Covid19CaseCountryListAdapter covid19CaseCountryListAdapter = new Covid19CaseCountryListAdapter(getContext(), covid19List);
        covid19CaseCountryListAdapter.setCallBack(callBack);

        String[] countriesNameArray = getCountriesNameArray(covid19List);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, countriesNameArray);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener((parent, view1, position, id) -> {

            Covid19 covid19 = searchCountry(covid19List, adapter.getItem(position));
            callBackCf.onClickSearch(covid19);
        });



                recyCovid19CaseCountryList.setAdapter(covid19CaseCountryListAdapter);
        recyCovid19CaseCountryList.setLayoutManager(new LinearLayoutManager(getContext()));
        recyCovid19CaseCountryList.addItemDecoration(new VerticalSpaceItemDecoration(8));
    }


    public Covid19 searchCountry(List<Covid19> covid19List, String query) {

        List<Covid19> resultCovid19 = Stream.of(covid19List)
                .filter(covid19 -> covid19.getCountry().equalsIgnoreCase(query))
                .collect(Collectors.toList());

        if (!resultCovid19.isEmpty()) {
            return resultCovid19.get(0);
        }
        return null;
    }

    public interface CallBack {
        void onClickSearch(Covid19 covid19);
    }

    public String[] getCountriesNameArray(List<Covid19> covid19List) {

        String[] countriesNameArray = new String[covid19List.size()];

        for (int i = 0; i < covid19List.size(); i++) {

            countriesNameArray[i] = covid19List.get(i).getCountry();
        }

        return countriesNameArray;
    }
}
