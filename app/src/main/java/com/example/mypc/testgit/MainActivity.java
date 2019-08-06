package com.example.mypc.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"branch1",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Branch2",Toast.LENGTH_LONG).show();
    }
}
