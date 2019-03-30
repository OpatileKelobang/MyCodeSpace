/*
 * Copyright (c) 2019.
 * Opatile Kelobang
 * http://www.bogote.co.za
 * Android App Development
 */

package co.za.bogote.mycodespace;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("get_images.php")
    Call<List<DataResponse>> getImages(@Query("page_number") int page, @Query("item_count") int items);
}
