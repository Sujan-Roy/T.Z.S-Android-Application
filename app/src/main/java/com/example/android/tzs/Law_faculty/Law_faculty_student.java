package com.example.android.tzs.Law_faculty;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tzs.FunctionMember.Member_item;
import com.example.android.tzs.R;

import java.util.ArrayList;
import java.util.List;

public class Law_faculty_student extends AppCompatActivity {
    private List<Law_Student_list> law_student = new ArrayList<Law_Student_list>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_faculty_student);
        StudentList();
        StudentListView();
    }

    private void StudentList() {
        //new student name
        law_student.add(new Law_Student_list("Fozle Rabbi Tomal","Department of Law","01744-759970","Session:2015-16"));
        //law_student.add(new Law_Student_list("Fozle Rabbi Tomal","Department of Law","01744-759970","Session:2015-16"));
    }
    private void StudentListView(){
        ArrayAdapter<Law_Student_list> Law_Adapter = new LawMember();
        ListView lawMemberList = (ListView) findViewById(R.id.law_faculty_list);
        lawMemberList.setAdapter(Law_Adapter);
    }
    private class LawMember extends ArrayAdapter<Law_Student_list>{
        public LawMember(){
            super(Law_faculty_student.this,R.layout.law_student_demo,law_student);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View lawmemberView = convertView;

            if(lawmemberView ==null){
                lawmemberView = getLayoutInflater().inflate(R.layout.law_student_demo,parent,false);

            }
            //find the member name
            Law_Student_list Student_list = law_student.get(position);
            //add the name or information
            TextView name = (TextView)lawmemberView.findViewById(R.id.l_name);
            name.setText(Student_list.getL_Name());

            TextView department = (TextView)lawmemberView.findViewById(R.id.l_dept);
            department.setText(Student_list.getL_dept());

            TextView phone = (TextView)lawmemberView.findViewById(R.id.l_phone);
            phone.setText(Student_list.getL_Phone());

            TextView session = (TextView)lawmemberView.findViewById(R.id.l_session);
            session.setText(Student_list.getL_Session());

            return lawmemberView;
        }
    }
}
