package com.example.android.tzs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.tzs.Arts_facluty_student.Student_list;
import com.example.android.tzs.Business_Faculty_Student.Business_Student_List;
import com.example.android.tzs.Law_faculty.Law_faculty_student;
import com.example.android.tzs.Science_faculty_student.Science_Student_List;
import com.example.android.tzs.Social_Science_Faculty.Social_student_List;

public class Member_list extends AppCompatActivity {
  Button arts_btn,law_btn,scienc_btn,busniess_btn,social_btn,life_btn,
    agriculture_btn,eng_btn,fine_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);
        arts_btn = (Button) findViewById(R.id.btn_Arts);
        law_btn = (Button) findViewById(R.id.btn_law);
        scienc_btn = (Button) findViewById(R.id.btn_science);
        busniess_btn = (Button) findViewById(R.id.btn_business);
        social_btn = (Button) findViewById(R.id.btn_social);
        life_btn = (Button) findViewById(R.id.btn_life);
        agriculture_btn = (Button) findViewById(R.id.btn_agriculture);
        eng_btn = (Button) findViewById(R.id.btn_Engineering);
        fine_btn = (Button) findViewById(R.id.btn_finearts);

        arts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_arts = new Intent(Member_list.this, Student_list.class);
                startActivity(intent_arts);
            }
        });

        law_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_law = new Intent(Member_list.this, Law_faculty_student.class);
                startActivity(intent_law);
            }
        });
        scienc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_science = new Intent(Member_list.this,Science_Student_List.class);
                startActivity(intent_science);
            }
        });
        busniess_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_Business = new Intent(Member_list.this,Business_Student_List.class);
                startActivity(intent_Business);
            }
        });
        social_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_Social = new Intent(Member_list.this,Social_student_List.class);
                startActivity(intent_Social);
            }
        });

    }
}
