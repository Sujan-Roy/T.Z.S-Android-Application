package com.example.android.tzs.Arts_facluty_student;

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

public class Student_list extends AppCompatActivity {
     private List<Arts_student> arts_students = new ArrayList<Arts_student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        studentlist();
        studentlistVeiw();
    }



    private void studentlist(){
        //student name list
        arts_students.add(new Arts_student("Sumon Chandra Sinha","Philosophy","01773-507864","Session:2012-13"));
        arts_students.add(new Arts_student("Chondon Chandra Barmon","Bangla","01752245601","Session:2014-15"));
    }
    private void studentlistVeiw() {
        ArrayAdapter<Arts_student> adapter_student = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.students);
        list.setAdapter(adapter_student);
    }

    private class MyListAdapter extends ArrayAdapter<Arts_student>{
         public MyListAdapter(){
             super(Student_list.this,R.layout.arts_student_list,arts_students);
         }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
             View studentView = convertView;
            if(studentView == null){
                studentView = getLayoutInflater().inflate(R.layout.arts_student_list,parent,false);
            }
            //find the student name to work
            Arts_student students =  arts_students.get(position);
            // fill up with informatin
            TextView nameText = (TextView)studentView.findViewById(R.id.std_name);
            nameText.setText(students.getName());

            TextView deptText = (TextView)studentView.findViewById(R.id.std_dept);
            deptText.setText(students.getDepartment());

            TextView phonText = (TextView)studentView.findViewById(R.id.std_phone);
            phonText.setText(students.getPhone());

            TextView sessionText= (TextView)studentView.findViewById(R.id.std_session);
            sessionText.setText(students.getSession());

            return studentView;

           // return super.getView(position, convertView, parent);
        }
    }
}
