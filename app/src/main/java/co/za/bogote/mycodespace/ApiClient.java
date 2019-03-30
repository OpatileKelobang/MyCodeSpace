/*
 * Copyright (c) 2019.
 * Opatile Kelobang
 * http://www.bogote.co.za
 * Android App Development
 */

package co.za.bogote.mycodespace;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String Base_url = "http://bogote.co.za/galleryapp/scripts/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient()
    {
        if (retrofit == null)
        {
            retrofit =  new Retrofit.Builder().baseUrl("Base_url").addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit;
    }

}
