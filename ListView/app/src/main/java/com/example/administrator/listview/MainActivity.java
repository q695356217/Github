package com.example.administrator.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private List<Animal> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAnimals();//初始化动物数据
        AnimalAdapter adapter=new AnimalAdapter(MainActivity.this,R.layout.animal_item,animalList);
        ListView listView =(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal a = animalList.get(position);
                Toast.makeText(MainActivity.this, a.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void initAnimals()
    {

            Animal Lion =new Animal("Lion",R.drawable.lion);
            animalList.add(Lion);
            Animal Tiger =new Animal("Tiger",R.drawable.tiger);
            animalList.add(Tiger);
            Animal Monkey =new Animal("Monkey",R.drawable.monkey);
            animalList.add(Monkey);
            Animal Dog =new Animal("Dog",R.drawable.dog);
            animalList.add(Dog);
            Animal Cat =new Animal("Cat",R.drawable.cat);
            animalList.add(Cat);
            Animal Elephant =new Animal("Elephant",R.drawable.elephant);
            animalList.add(Elephant);


    }
}

