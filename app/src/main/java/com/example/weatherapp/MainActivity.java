package com.example.weatherapp;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.btnfind)
    Button mBtnFind;
    @BindView(R.id.editText)
    EditText mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    public void onClick(View v){
        if(v==mBtnFind){
            String location= mLocation.getText().toString();
            Intent intent= new Intent(MainActivity.this, WeatherActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}
