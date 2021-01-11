package com.example.covid19.model;

import android.os.Parcel;
import android.os.Parcelable;

public class GlobalCovid19 implements Parcelable {

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
    private long population;
    private int oneCasePerPeople;
    private int oneDeathPerPeople;
    private int oneTestPerPeople;
    private double activePerOneMillion;
    private double recoveredPerOneMillion;
    private double criticalPerOneMillion;
    private int affectedCountries;

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

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getOneCasePerPeople() {
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

    public int getAffectedCountries() {
        return affectedCountries;
    }

    public void setAffectedCountries(int affectedCountries) {
        this.affectedCountries = affectedCountries;
    }

    @Override
    public String toString() {
        return "GlobalCovid19{" +
                "cases=" + cases +
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
                ", oneCasePerPeople=" + oneCasePerPeople +
                ", oneDeathPerPeople=" + oneDeathPerPeople +
                ", oneTestPerPeople=" + oneTestPerPeople +
                ", activePerOneMillion=" + activePerOneMillion +
                ", recoveredPerOneMillion=" + recoveredPerOneMillion +
                ", criticalPerOneMillion=" + criticalPerOneMillion +
                ", affectedCountries=" + affectedCountries +
                '}';
    }

protected GlobalCovid19(Parcel in) {
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
        population = in.readLong();
        oneCasePerPeople = in.readInt();
        oneDeathPerPeople = in.readInt();
        oneTestPerPeople = in.readInt();
        activePerOneMillion = in.readDouble();
        recoveredPerOneMillion = in.readDouble();
        criticalPerOneMillion = in.readDouble();
        affectedCountries = in.readInt();
        }

@Override
public int describeContents() {
        return 0;
        }

@Override
public void writeToParcel(Parcel dest, int flags) {
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
        dest.writeLong(population);
        dest.writeInt(oneCasePerPeople);
        dest.writeInt(oneDeathPerPeople);
        dest.writeInt(oneTestPerPeople);
        dest.writeDouble(activePerOneMillion);
        dest.writeDouble(recoveredPerOneMillion);
        dest.writeDouble(criticalPerOneMillion);
        dest.writeInt(affectedCountries);
        }

@SuppressWarnings("unused")
public static final Parcelable.Creator<GlobalCovid19> CREATOR = new Parcelable.Creator<GlobalCovid19>() {
@Override
public GlobalCovid19 createFromParcel(Parcel in) {
        return new GlobalCovid19(in);
        }

@Override
public GlobalCovid19[] newArray(int size) {
        return new GlobalCovid19[size];
        }
        };
        }