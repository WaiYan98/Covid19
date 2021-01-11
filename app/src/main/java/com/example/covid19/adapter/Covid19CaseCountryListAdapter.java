package com.example.covid19.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.covid19.R;
import com.example.covid19.model.Covid19;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Covid19CaseCountryListAdapter extends RecyclerView.Adapter<Covid19CaseCountryListAdapter.ViewHolder> {

    private List<Covid19> covid19List = new ArrayList<>();
    private Context context;
    private CallBack callBack;

    public Covid19CaseCountryListAdapter(Context context, List<Covid19> covid19List) {
        this.context = context;
        this.covid19List = covid19List;
    }

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_covid19_case_country_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Covid19 currentCovid19Country = covid19List.get(position);

        holder.txtNo.setText(String.valueOf(position + 1) + ".");

        Glide
                .with(context)
                .load(currentCovid19Country.getCountryInfo().getFlag())
                .into(holder.imgFlag);

        holder.txtCountryName.setText(currentCovid19Country.getCountry());
        holder.txtTotalCases.setText(String.valueOf(currentCovid19Country.getCases()));
        holder.txtTodayCases.setText(String.valueOf(currentCovid19Country.getTodayCases()));

        holder.txtDetail.setOnClickListener(v -> {
            callBack.onClickDetail(currentCovid19Country);
        });

    }

    @Override
    public int getItemCount() {
        return covid19List.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_no)
        TextView txtNo;
        @BindView(R.id.img_flag)
        ImageView imgFlag;
        @BindView(R.id.txt_country_name)
        TextView txtCountryName;
        @BindView(R.id.txt_total_cases)
        TextView txtTotalCases;
        @BindView(R.id.txt_today_cases)
        TextView txtTodayCases;
        @BindView(R.id.txt_detail)
        TextView txtDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface CallBack {
        void onClickDetail(Covid19 currentCountryCovid19Data);
    }
}
