package com.raywenderlich.android.deezfoodz.network;

import com.raywenderlich.android.deezfoodz.app.Constants;
import com.raywenderlich.android.deezfoodz.model.FoodzListResponse;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by xxu on 17-6-8.
 */

public interface TwitterApi {


    @GET("ndb/list?api_key=" + Constants.API_KEY)
    Observable<FoodzListResponse> getFoodzList();


}
