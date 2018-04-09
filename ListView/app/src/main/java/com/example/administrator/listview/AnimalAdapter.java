package com.example.administrator.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */

public class AnimalAdapter extends ArrayAdapter<Animal> {
    private int resourceId;

    public AnimalAdapter(Context context,int textViewResourceId,List<Animal> objects)
    {
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Animal animal =getItem(position);//获取当前项的Animal实例
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView animalImage=(ImageView) view.findViewById(R.id.animal_image);
        TextView animalName=(TextView) view.findViewById(R.id.animal_name);
        animalImage.setImageResource(animal.getImageId());
        animalName.setText(animal.getName());
        return view;
    }
}
