package com.example.androidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list=findViewById(R.id.recyclerview_id);
        project[] projectArray = {
                new project("Getting Started App", "Our very first project , the default 'Hello World' app!", R.drawable.getting_started),
                new project("Quote App", "motivational quote app for software developers", R.drawable.quote),
                new project("Bmi Calculator", "A real life bmi calculator app which gives understanding about various programming concept like variable,methods and conditional logic", R.drawable.calculator),
                new project("Inches converter", "A basic converter app which convert inches into meter",R.drawable.tape ),
                new project("FoodGram", "A menu app for fictional restaurant,learning about Activities,Classes,Objects,Arrays,Intent and Listviews", R.drawable.hungry_developer)
        };

        projectAdapter adapter=new projectAdapter(projectArray);

        list.setAdapter(adapter);
    }
}