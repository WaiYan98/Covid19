package com.example.covid19.model;

import android.os.Parcel;
import android.os.Parcelable;

public class GlobalData implements Parcelable {

    private String nameCases;
    private int Cases;
    private String nameDeaths;
    private int deaths;
    private String nameRecovered;
    private int recovered;

    public GlobalData(String nameCases, int cases, String nameDeaths, int deaths, String nameRecovered, int recovered) {
        this.nameCases = nameCases;
        Cases = cases;
        this.nameDeaths = nameDeaths;
        this.deaths = deaths;
        this.nameRecovered = nameRecovered;
        this.recovered = recovered;
    }

    public String getNameCases() {
        return nameCases;
    }

    public void setNameCases(String nameCases) {
        this.nameCases = nameCases;
    }

    public int getCases() {
        return Cases;
    }

    public void setCases(int cases) {
        Cases = cases;
    }

    public String getNameDeaths() {
        return nameDeaths;
    }

    public void setNameDeaths(String nameDeaths) {
        this.nameDeaths = nameDeaths;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public String getNameRecovered() {
        return nameRecovered;
    }

    public void setNameRecovered(String nameRecovered) {
        this.nameRecovered = nameRecovered;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return "GlobalDataList{" +
                "nameCases='" + nameCases + '\'' +
                ", Cases=" + Cases +
                ", nameDeaths='" + nameDeaths + '\'' +
                ", deaths=" + deaths +
                ", nameRecovered='" + nameRecovered + '\'' +
                ", recovered=" + recovered +
                '}';
    }

    protected GlobalData(Parcel in) {
        nameCases = in.readString();
        Cases = in.readInt();
        nameDeaths = in.readString();
        deaths = in.readInt();
        nameRecovered = in.readString();
        recovered = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameCases);
        dest.writeInt(Cases);
        dest.writeString(nameDeaths);
        dest.writeInt(deaths);
        dest.writeString(nameRecovered);
        dest.writeInt(recovered);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<GlobalData> CREATOR = new Parcelable.Creator<GlobalData>() {
        @Override
        public GlobalData createFromParcel(Parcel in) {
            return new GlobalData(in);
        }

        @Override
        public GlobalData[] newArray(int size) {
            return new GlobalData[size];
        }
    };
}