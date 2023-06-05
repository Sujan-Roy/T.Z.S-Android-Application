package com.example.android.tzs.Social_Science_Faculty;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tzs.R;

import java.util.ArrayList;
import java.util.List;

public class Social_student_List extends AppCompatActivity {
  private List<Social_Student_Adapter> social_student_adapters = new ArrayList<Social_Student_Adapter>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social__student__list);
        socialStudentList();
        socialStudentListView();

    }

    private void socialStudentList() {
        //new student
        social_student_adapters.add(new Social_Student_Adapter("Chonda Roy","Department of Economics","N/A","Session: 2015-16"));

    }
    private void socialStudentListView(){
        ArrayAdapter<Social_Student_Adapter> student_social = new SocialAdapter();
        ListView socialList = (ListView) findViewById(R.id.social_List);
        socialList.setAdapter(student_social);
    }
    private class SocialAdapter extends ArrayAdapter<Social_Student_Adapter>{
        public SocialAdapter(){
            super(Social_student_List.this,R.layout.social_student_demo,social_student_adapters);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View socialView = convertView;
            if(socialView == null){
                socialView = getLayoutInflater().inflate(R.layout.social_student_demo,parent,false);
            }

            Social_Student_Adapter social = social_student_adapters.get(position);

            //name to be add

            TextView name = (TextView)socialView.findViewById(R.id.so_name);
            name.setText(social.getSo_Name());

            TextView department = (TextView)socialView.findViewById(R.id.so_dept);
            department.setText(social.getSo_Dept());

            TextView phone = (TextView)socialView.findViewById(R.id.so_phone);
            phone.setText(social.getSo_Phone());

            TextView session = (TextView)socialView.findViewById(R.id.so_session);
            session.setText(social.getSo_Session());

            return socialView;
        }
    }
}
