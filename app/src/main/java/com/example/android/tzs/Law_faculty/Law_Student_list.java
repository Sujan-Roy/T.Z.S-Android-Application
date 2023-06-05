package com.example.android.tzs.Law_faculty;

/**
 * Created by Android on 7/1/2017.
 */

public class Law_Student_list {
    private String l_Name;
    private String l_dept;
    private String l_Phone;
    private String l_Session;

    public Law_Student_list(String l_Name, String l_dept, String l_Phone, String l_Session) {
        super();
        this.l_Name = l_Name;
        this.l_dept = l_dept;
        this.l_Phone = l_Phone;
        this.l_Session = l_Session;
    }

    public String getL_Name() {
        return l_Name;
    }

    public String getL_dept() {
        return l_dept;
    }

    public String getL_Phone() {
        return l_Phone;
    }

    public String getL_Session() {
        return l_Session;
    }
}
