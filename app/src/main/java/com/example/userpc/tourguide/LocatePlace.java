package com.example.userpc.tourguide;

public class LocatePlace {
    private String mName;
    private String mAddressOfPlace;
    private int mImageId;

    public LocatePlace(String nameOfPlace, String addressOfPlace) {
        mName = nameOfPlace;
        mAddressOfPlace = addressOfPlace;
    }
    public LocatePlace(String nameOfPlace, String addressOfPlace,int imageId) {
        mName = nameOfPlace;
        mAddressOfPlace = addressOfPlace;
        mImageId=imageId;
    }

    public String getName() {
        return mName;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getAddressOfPlace() {
        return mAddressOfPlace;
    }
}