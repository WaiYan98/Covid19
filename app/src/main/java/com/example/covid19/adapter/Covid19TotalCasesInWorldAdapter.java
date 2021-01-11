package com.example.covid19.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid19.R;
import com.example.covid19.model.GlobalCovid19;
import com.example.covid19.model.GlobalData;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Covid19TotalCasesInWorldAdapter extends RecyclerView.Adapter<Covid19TotalCasesInWorldAdapter.ViewHolder> {

    private List<GlobalData> globalDataList;

    public Covid19TotalCasesInWorldAdapter(List<GlobalData> globalDataList) {
        this.globalDataList = globalDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_covid19_cases, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        GlobalData currentGlobalData = globalDataList.get(position);

        holder.txtNameCases.setText(currentGlobalData.getNameCases());
        holder.txtNameDeath.setText(currentGlobalData.getNameDeaths());
        holder.txtNameRecovered.setText(currentGlobalData.getNameRecovered());
        holder.txtCasesNumber.setText(String.valueOf(currentGlobalData.getCases()));
        holder.txtDeathNumber.setText(String.valueOf(currentGlobalData.getDeaths()));
        holder.txtRecoveredNumber.setText(String.valueOf(currentGlobalData.getRecovered()));
    }

    @Override
    public int getItemCount() {
        return globalDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_name_cases)
        TextView txtNameCases;
        @BindView(R.id.txt_cases_number)
        TextView txtCasesNumber;
        @BindView(R.id.txt_name_death)
        TextView txtNameDeath;
        @BindView(R.id.txt_death_number)
        TextView txtDeathNumber;
        @BindView(R.id.txt_name_recovered)
        TextView txtNameRecovered;
        @BindView(R.id.txt_recovered_number)
        TextView txtRecoveredNumber;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
