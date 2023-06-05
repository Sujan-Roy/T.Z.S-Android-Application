package com.example.android.tzs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Adviser_list extends AppCompatActivity {
 ListView adviser_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adviser_list);
        adviser_list = (ListView) findViewById(R.id.adviser);
    }
}
