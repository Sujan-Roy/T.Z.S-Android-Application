package com.example.android.tzs.Business_Faculty_Student;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tzs.R;
import com.example.android.tzs.Science_faculty_student.Science_Student_Adapter;

import java.util.ArrayList;
import java.util.List;

public class Business_Student_List extends AppCompatActivity {
    private List<Business_Student_Adapter> business_student_adapters = new ArrayList<Business_Student_Adapter>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__student__list);
        BusinesList();
        BusniessListView();
    }

    private void BusinesList() {
        //new Student name add
        business_student_adapters.add(new Business_Student_Adapter("Mizanur Rahman","Accounting and Information System","01780-977840","Session: 2015-16"));

    }


    private void BusniessListView() {
        ArrayAdapter<Business_Student_Adapter> student_business = new BusinessAdapter();
        ListView businessList = (ListView)findViewById(R.id.business_list);
        businessList.setAdapter(student_business);

    }

    private class BusinessAdapter extends ArrayAdapter<Business_Student_Adapter> {
        public BusinessAdapter() {
            super(Business_Student_List.this,R.layout.business_student_demo,business_student_adapters);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View BusinessView = convertView;
            if(BusinessView == null){
                BusinessView = getLayoutInflater().inflate(R.layout.business_student_demo,parent,false);
            }
            //find the postion
            Business_Student_Adapter business = business_student_adapters.get(position);
            // find and add information
            TextView name = (TextView)BusinessView.findViewById(R.id.b_name);
            name.setText(business.getB_Name());

            TextView department= (TextView)BusinessView.findViewById(R.id.b_dept);
            department.setText(business.getB_Dept());

            TextView phone = (TextView) BusinessView.findViewById(R.id.b_phone);
            phone.setText(business.getB_Phone());

            TextView session = (TextView)BusinessView.findViewById(R.id.b_session);
            session.setText(business.getB_Session());

            return BusinessView;
        }
    }

}
