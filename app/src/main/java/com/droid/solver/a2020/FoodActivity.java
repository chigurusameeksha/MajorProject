package com.droid.solver.a2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class FoodActivity extends AppCompatActivity {
    private Spinner spinner;
    int ci=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if(ci==i)
                    return;
                else
                {
                    if(i==1){
                        Intent in=new Intent(FoodActivity.this , Andhrapradesh.class);
                        startActivity(in);
                    }
                    if(i==2){
                        Intent in=new Intent(FoodActivity.this , Arunchalpradesh.class);
                        startActivity(in);
                    }
                    if(i==3){
                        Intent in=new Intent(FoodActivity.this , Goa.class);
                        startActivity(in);
                    }
                    if(i==4){
                        Intent in=new Intent(FoodActivity.this , Karnataka.class);
                        startActivity(in);
                    }
                    if(i==5){
                        Intent in=new Intent(FoodActivity.this , Kerala.class);
                        startActivity(in);
                    }
                    if(i==6){
                        Intent in=new Intent(FoodActivity.this , MadhyaPradesh.class);
                        startActivity(in);
                    }
                    if(i==7){
                        Intent in=new Intent(FoodActivity.this , Maharashtra.class);
                        startActivity(in);
                    }
                    if(i==8){
                        Intent in=new Intent(FoodActivity.this , Tamilnadu.class);
                        startActivity(in);
                    }
                    if(i==9){
                        Intent in=new Intent(FoodActivity.this , Telangana.class);
                        startActivity(in);
                    }
                    if(i==10){
                        Intent in=new Intent(FoodActivity.this , UtterPradesh.class);
                        startActivity(in);
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


}