package com.example.administrator.listview;

/**
 * Created by Administrator on 2018/3/26.
 */

public class Animal {
    private String name;
    private int imageId;
    public Animal(String name,int imageId)
    {
        this.name=name;
        this.imageId=imageId;
    }
    public String getName()
    {
        return name;
    }
    public int getImageId()
    {
        return imageId;
    }
}
