package com.example.android.tzs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     TextView Wtext,Adtext;

    Button btnAdviser,btnComitee,btnMember;
    ImageView logo_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Wtext = (TextView) findViewById(R.id.welcomeText);
        logo_image = (ImageView) findViewById(R.id.logo);
        Adtext = (TextView) findViewById(R.id.Advisertext);
        btnAdviser = (Button) findViewById(R.id.AdviserBtn);
        btnComitee = (Button) findViewById(R.id.CommiteeBtn);
        btnMember = (Button) findViewById(R.id.Memberbtn);
        btnMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_member= new Intent(MainActivity.this,Member_list.class);
                startActivity(intent_member);
                Toast.makeText(getApplicationContext(),"Welcome to our Member list",Toast.LENGTH_SHORT).show();
            }
        });
        btnAdviser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_Adviser= new Intent(MainActivity.this,Adviser_list.class);
                startActivity(intent_Adviser);
                Toast.makeText(getApplicationContext(),"Welcome to our Adviser list",Toast.LENGTH_SHORT).show();
            }
        });
        btnComitee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_committee= new Intent(MainActivity.this,Committee_list.class);
                startActivity(intent_committee);
                Toast.makeText(getApplicationContext(),"Welcome to 2017 Committee List",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
