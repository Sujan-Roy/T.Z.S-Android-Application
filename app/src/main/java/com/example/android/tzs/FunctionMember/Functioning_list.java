package com.example.android.tzs.FunctionMember;

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

public class Functioning_list extends AppCompatActivity {
    private List<Member_item> member_list = new ArrayList<Member_item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functioning_list);
        memberlist();
        memberListView();
    }



    private void memberlist() {
        member_list.add(new Member_item("Amit Roy","Department of Chemistry","01701-966486","Session:2016-17 "));
        member_list.add(new Member_item("Sahbaj Ahamed Tonmoy","Department of International Relations","01796-031790","Session:2016-17 "));
        member_list.add(new Member_item("Manik Hosen","N/A","01792-829850","Session:2016-17 "));
        member_list.add(new Member_item("Apu Chackraborty","Department of Statistics","01760-974980","Session:2016-17 "));
        member_list.add(new Member_item("Md Milon","N/A","01783-139429","Session:2016-17 "));
        member_list.add(new Member_item("Rakib Hasan","Department of Chemistry","01701-966486","Session:2016-17 "));
        member_list.add(new Member_item("Sonjoy Roy","N/A","N/A","Session:2016-17 "));
        member_list.add(new Member_item("Sumon Sahriyar","N/A","N/A","Session:2016-17 "));
        member_list.add(new Member_item("Raju","Department of Bangla","N/A","Session:2016-17 "));
        member_list.add(new Member_item("Alal Alter","Department of Law","N/A","Session:2016-17 "));


    }
    private void memberListView() {
        ArrayAdapter<Member_item> adapterMember = new MyMember();
        ListView list_Member = (ListView) findViewById(R.id.list);
        list_Member.setAdapter(adapterMember);
    }
    private class MyMember extends ArrayAdapter<Member_item>{
        public MyMember(){
            super(Functioning_list.this,R.layout.member_list_demo,member_list);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View memberView = convertView;

            if(memberView==null)
            {
                memberView = getLayoutInflater().inflate(R.layout.member_list_demo,parent,false);
            }
            //find the Member name to work
            Member_item members = member_list.get(position);
            // Add informatin
            TextView textName=(TextView)memberView.findViewById(R.id.m_name);
            textName.setText(members.getM_name());

            TextView textDept= (TextView)memberView.findViewById(R.id.m_dept);
            textDept.setText(members.getM_dept());

            TextView textPhone = (TextView)memberView.findViewById(R.id.m_phone);
            textPhone.setText(members.getM_phone());

            TextView textSession = (TextView)memberView.findViewById(R.id.m_session);
            textSession.setText(members.getM_session());

            return memberView;
        }
    }
}











