package com.example.android.tzs.Arts_facluty_student;

/**
 * Created by Android on 6/30/2017.
 */

public class Arts_student {
    private String name;
    private String department;
    private String phone;
    private String session;

    public Arts_student(String name, String department, String phone, String session) {
        super();
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.session = session;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return phone;
    }

    public String getSession() {
        return session;
    }
}
