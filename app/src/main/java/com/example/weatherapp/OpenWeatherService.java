package com.example.weatherapp;


import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OpenWeatherService {

    public static void getWeather(String location, Callback callback){
//        location="Nairobi,ke";
        OkHttpClient client = new OkHttpClient.Builder()
                .build();



        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.BASE_URL).newBuilder();


        urlBuilder.addQueryParameter(Constants.QUERY_PARAMETER, location);
        urlBuilder.addQueryParameter("&appid", Constants.WEATHER_TOKEN);
        String url=urlBuilder.build().toString();

        System.out.println(url);

        Request request=new Request.Builder().url(url).build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }
}
