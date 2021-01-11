package com.example.covid19.model;

public class GlobalData {

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
}
