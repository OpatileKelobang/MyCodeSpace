/*
 * Copyright (c) 2019.
 * Opatile Kelobang
 * http://www.bogote.co.za
 * Android App Development
 */

package co.za.bogote.mycodespace;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse
{

    @SerializedName("staus")
    private String status;

    @SerializedName("images")
    List<Images> images;

    public String getStatus() {
        return status;
    }

    public List<Images> getImages() {
        return images;
    }
}

class Images
{
    // JSon Mapping
    @SerializedName("id")
    private int imageId;
    @SerializedName("image_path")
    private String imagePath;

    public int getImageId() {
        return imageId;
    }

    public String getImagePath() {
        return imagePath;
    }
}
