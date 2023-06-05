package com.example.android.tzs.Science_faculty_student;

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

public class Science_Student_List extends AppCompatActivity {
  private List<Science_Student_Adapter> science_student_adapters = new ArrayList<Science_Student_Adapter>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science__student__list);
        scienceStudentList();
        scienceStudentListView();
    }

    private void scienceStudentList() {
        science_student_adapters.add(new Science_Student_Adapter("Liton Chandra Barmon","Department of Mathematics","01770-826494","Session: 2012-13"));

    }
    private void scienceStudentListView(){
        ArrayAdapter<Science_Student_Adapter> student_science = new ScienceAdapter();
        ListView scienceList = (ListView) findViewById(R.id.science_List);
        scienceList.setAdapter(student_science);
    }
    private class ScienceAdapter extends ArrayAdapter<Science_Student_Adapter>{
        public  ScienceAdapter(){
            super(Science_Student_List.this,R.layout.science_student_demo,science_student_adapters);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View scienceView = convertView;
            if(scienceView == null)
            {
                scienceView = getLayoutInflater().inflate(R.layout.science_student_demo,parent,false);
            }
            Science_Student_Adapter science = science_student_adapters.get(position);

            TextView name = (TextView)scienceView.findViewById(R.id.s_name);
            name.setText(science.getS_name());

            TextView dept= (TextView)scienceView.findViewById(R.id.s_dept);
            dept.setText(science.getS_dept());

            TextView phone = (TextView)scienceView.findViewById(R.id.s_phone);
            phone.setText(science.getS_phone());

            TextView session = (TextView)scienceView.findViewById(R.id.s_session);
            session.setText(science.getS_session());

            return scienceView;
        }
    }
}
