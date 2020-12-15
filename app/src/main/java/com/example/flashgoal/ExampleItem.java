package com.example.flashgoal;

public class ExampleItem {
    private String mImageUrl;
    private String mName;
    //private int mLikes;
    public ExampleItem(String imageUrl, String name) {
        mImageUrl = imageUrl;
        mName = name;
       // mLikes = likes;
    }
    public String getImageUrl() {
        return mImageUrl;
    }
    public String getName() {
        return mName;
    }
   // public int getLikeCount() {
   //     return mLikes;
   // }
}
