package com.raywenderlich.android.deezfoodz.network;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xxu on 17-6-8.
 */


public class HttpApisGateWay {
   private  static HttpApisGateWay _INSTANCE;
    private  TwitterApi twitterApi;

   priavte HttpApisGateWay(){

       /**
        * set gson date format
        *  Gson gson = new GsonBuilder()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
        .create();
        */

       String BASE_URL="";

       Retrofit retrofit = new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
               .addConverterFactory(GsonConverterFactory.create()).build();

       this.twitterApi = retrofit.create(TwitterApi.class);

   }

   public static HttpApisGateWay getInstance(){
       if(this._INSTANCE==null) {
           _INSTANCE=new HttpApisGateWay();
       }

       return _INSTANCE;
   }


   private TwitterApi getTwitteApi(){
       return this.twitterApi;
   }


}
