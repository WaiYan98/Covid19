package com.example.covid19.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Covid19 implements Parcelable {

    private long updated;
    private String country;
    private CountryInfo countryInfo;
    private int cases;
    private int todayCases;
    private int deaths;
    private int todayDeaths;
    private int recovered;
    private int todayRecovered;
    private int active;
    private int critical;
    private double casesPerOneMillion;
    private double deathsPerOneMillion;
    private int tests;
    private double testsPerOneMillion;
    private int population;
    private String continent;
    private int oneCasePerPeople;
    private int oneDeathPerPeople;
    private int oneTestPerPeople;
    private double activePerOneMillion;
    private double recoveredPerOneMillion;
    private double criticalPerOneMillion;

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(int todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getTodayRecovered() {
        return todayRecovered;
    }

    public void setTodayRecovered(int todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public double getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(double casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public double getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(double deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public int getTests() {
        return tests;
    }

    public void setTests(int tests) {
        this.tests = tests;
    }

    public double getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(double testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    public void setOneCasePerPeople(int oneCasePerPeople) {
        this.oneCasePerPeople = oneCasePerPeople;
    }

    public int getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    public void setOneDeathPerPeople(int oneDeathPerPeople) {
        this.oneDeathPerPeople = oneDeathPerPeople;
    }

    public int getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    public void setOneTestPerPeople(int oneTestPerPeople) {
        this.oneTestPerPeople = oneTestPerPeople;
    }

    public double getActivePerOneMillion() {
        return activePerOneMillion;
    }

    public void setActivePerOneMillion(double activePerOneMillion) {
        this.activePerOneMillion = activePerOneMillion;
    }

    public double getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    public void setRecoveredPerOneMillion(double recoveredPerOneMillion) {
        this.recoveredPerOneMillion = recoveredPerOneMillion;
    }

    public double getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    public void setCriticalPerOneMillion(double criticalPerOneMillion) {
        this.criticalPerOneMillion = criticalPerOneMillion;
    }

    public String getNameCases() {
        return "Total Cases";
    }

    public String getNameTodayCases() {
        return "Today Cases";
    }

    public String getNameDeaths() {
        return "Total Deaths";
    }

    public String getNameTodayDeaths() {
        return "Today Deaths";
    }

    public String getNameRecovered() {
        return "Total Recovered";
    }

    public String getNameTodayRecovered() {
        return "Today Recovered";
    }

    public String getNameActive() {
        return "Active Cases";
    }

    public String getNameCritical() {
        return "Serious Critical";
    }

    public String getNameCasesPerOneMillion() {
        return "Total Cases/1M population ";
    }

    public String getNameDeathsPerOneMillion() {
        return "Deaths/1M population";
    }

    public String getNameTests() {
        return "Total Tests";
    }

    public String getNameTestsPerOneMillion() {
        return "Tests/1M population";
    }

    public String getNamePopulation() {
        return "Population";
    }


    @Override
    public String toString() {
        return "Covid19{" +
                "updated=" + updated +
                ", country='" + country + '\'' +
                ", countryInfo=" + countryInfo +
                ", cases=" + cases +
                ", todayCases=" + todayCases +
                ", deaths=" + deaths +
                ", todayDeaths=" + todayDeaths +
                ", recovered=" + recovered +
                ", todayRecovered=" + todayRecovered +
                ", active=" + active +
                ", critical=" + critical +
                ", casesPerOneMillion=" + casesPerOneMillion +
                ", deathsPerOneMillion=" + deathsPerOneMillion +
                ", tests=" + tests +
                ", testsPerOneMillion=" + testsPerOneMillion +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                ", oneCasePerPeople=" + oneCasePerPeople +
                ", oneDeathPerPeople=" + oneDeathPerPeople +
                ", oneTestPerPeople=" + oneTestPerPeople +
                ", activePerOneMillion=" + activePerOneMillion +
                ", recoveredPerOneMillion=" + recoveredPerOneMillion +
                ", criticalPerOneMillion=" + criticalPerOneMillion +
                '}';
    }

    protected Covid19(Parcel in) {
        updated = in.readLong();
        country = in.readString();
        countryInfo = (CountryInfo) in.readValue(CountryInfo.class.getClassLoader());
        cases = in.readInt();
        todayCases = in.readInt();
        deaths = in.readInt();
        todayDeaths = in.readInt();
        recovered = in.readInt();
        todayRecovered = in.readInt();
        active = in.readInt();
        critical = in.readInt();
        casesPerOneMillion = in.readDouble();
        deathsPerOneMillion = in.readDouble();
        tests = in.readInt();
        testsPerOneMillion = in.readDouble();
        population = in.readInt();
        continent = in.readString();
        oneCasePerPeople = in.readInt();
        oneDeathPerPeople = in.readInt();
        oneTestPerPeople = in.readInt();
        activePerOneMillion = in.readDouble();
        recoveredPerOneMillion = in.readDouble();
        criticalPerOneMillion = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(updated);
        dest.writeString(country);
        dest.writeValue(countryInfo);
        dest.writeInt(cases);
        dest.writeInt(todayCases);
        dest.writeInt(deaths);
        dest.writeInt(todayDeaths);
        dest.writeInt(recovered);
        dest.writeInt(todayRecovered);
        dest.writeInt(active);
        dest.writeInt(critical);
        dest.writeDouble(casesPerOneMillion);
        dest.writeDouble(deathsPerOneMillion);
        dest.writeInt(tests);
        dest.writeDouble(testsPerOneMillion);
        dest.writeInt(population);
        dest.writeString(continent);
        dest.writeInt(oneCasePerPeople);
        dest.writeInt(oneDeathPerPeople);
        dest.writeInt(oneTestPerPeople);
        dest.writeDouble(activePerOneMillion);
        dest.writeDouble(recoveredPerOneMillion);
        dest.writeDouble(criticalPerOneMillion);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Covid19> CREATOR = new Parcelable.Creator<Covid19>() {
        @Override
        public Covid19 createFromParcel(Parcel in) {
            return new Covid19(in);
        }

        @Override
        public Covid19[] newArray(int size) {
            return new Covid19[size];
        }
    };
}