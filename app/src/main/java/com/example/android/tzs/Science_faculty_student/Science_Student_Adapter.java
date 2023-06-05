package com.example.android.tzs.Science_faculty_student;

/**
 * Created by Android on 7/1/2017.
 */

public class Science_Student_Adapter {
    private String S_name;
    private String S_dept;
    private String S_phone;
    private String S_session;

    public Science_Student_Adapter(String s_name, String s_dept, String s_phone, String s_session) {
        super();
        S_name = s_name;
        S_dept = s_dept;
        S_phone = s_phone;
        S_session = s_session;
    }

    public String getS_name() {
        return S_name;
    }

    public String getS_dept() {
        return S_dept;
    }

    public String getS_phone() {
        return S_phone;
    }

    public String getS_session() {
        return S_session;
    }
}
