package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.covid19.model.Covid19;
import com.example.covid19.model.GlobalCovid19;
import com.example.covid19.retrofit.Covid19Service;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SetUpActivity extends AppCompatActivity {

    @BindView(R.id.lottie_animation)
    LottieAnimationView lottieAnimation;

    private GlobalCovid19 globalCovid19;
    private Covid19Service covid19Service;
    private List<Covid19> covid19List;
    private boolean covid19ApiCompleted;
    private boolean globalApiCompleted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        ButterKnife.bind(this);

        Log.d("tag", "onCreate: ");

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://disease.sh/v3/covid-19/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        covid19Service = retrofit.create(Covid19Service.class);

        makeCovid19Api();
        makeGlobalCovid19Api();

    }

    public void goToMainActivity(GlobalCovid19 globalCovid19, List<Covid19> covid19List) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.EXTRA_GLOBAL_COVID_19, globalCovid19);
        intent.putExtra(MainActivity.EXTRA_COVID_19, new ArrayList<>(covid19List));
        startActivity(intent);
        finish();
    }

    private void makeCovid19Api() {

        covid19Service.getAllCovid19Data(false, false, true)
                .enqueue(new Callback<List<Covid19>>() {
                    @Override
                    public void onResponse(Call<List<Covid19>> call, Response<List<Covid19>> response) {

                        covid19ApiCompleted = true;

                        Log.d("tag", "onResponse: ");

                        covid19List = response.body();

                        if (globalApiCompleted) {
                            goToMainActivity(globalCovid19, covid19List);
                        }

                    }

                    @Override
                    public void onFailure(Call<List<Covid19>> call, Throwable t) {
                        Toast.makeText(SetUpActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        Log.d("tag", "AfterEnqueue ");
    }

    private void makeGlobalCovid19Api() {

        covid19Service.getAllGlobalCovid19(false, false)
                .enqueue(new Callback<GlobalCovid19>() {
                    @Override
                    public void onResponse(Call<GlobalCovid19> call, Response<GlobalCovid19> response) {

                        globalApiCompleted = true;

                        globalCovid19 = response.body();

                        if (covid19ApiCompleted) {
                            goToMainActivity(globalCovid19, covid19List);
                        }

                    }

                    @Override
                    public void onFailure(Call<GlobalCovid19> call, Throwable t) {
                        Toast.makeText(SetUpActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}