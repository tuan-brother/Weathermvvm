package com.example.demo1.ui.main.Retrofit;

import com.example.demo1.ui.main.classinfo.Classinfo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public interface WeatherAPIs {
        /*
        Get request to fetch city weather.Takes in two parameter-city name and API key.
        */
        @GET("/data/2.5/weather")
        Call<Classinfo> getWeatherByCity(@Query("q") String city, @Query("appid") String apiKey);
       /* Call < T > getMovieDatils(@Path("movie_id") String movieID);*/
    }
}
