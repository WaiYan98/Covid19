package com.example.covid19.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


import com.google.gson.annotations.SerializedName;

public class CountryInfo implements Parcelable {

    @SerializedName("_id")
    private int id;
    private String iso2;
    private String iso3;
    private double lat;
    @SerializedName("long")
    private double lon;
    private String flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "CountryInfo{" +
                "id=" + id +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", flag='" + flag + '\'' +
                '}';
    }

    protected CountryInfo(Parcel in) {
        id = in.readInt();
        iso2 = in.readString();
        iso3 = in.readString();
        lat = in.readDouble();
        lon = in.readDouble();
        flag = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(iso2);
        dest.writeString(iso3);
        dest.writeDouble(lat);
        dest.writeDouble(lon);
        dest.writeString(flag);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<CountryInfo> CREATOR = new Parcelable.Creator<CountryInfo>() {
        @Override
        public CountryInfo createFromParcel(Parcel in) {
            return new CountryInfo(in);
        }

        @Override
        public CountryInfo[] newArray(int size) {
            return new CountryInfo[size];
        }
    };
}

