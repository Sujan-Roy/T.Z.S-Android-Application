package com.example.android.tzs.Business_Faculty_Student;

/**
 * Created by Android on 7/1/2017.
 */

public class Business_Student_Adapter {
    private String b_Name;
    private String b_Dept;
    private String b_Phone;
    private String b_Session;

    public Business_Student_Adapter(String b_Name,String b_Dept, String b_Phone, String b_Session) {
        super();
        this.b_Name = b_Name;
        this.b_Dept = b_Dept;

        this.b_Phone = b_Phone;
        this.b_Session = b_Session;
    }

    public String getB_Name() {
        return b_Name;
    }

    public String getB_Dept() {
        return b_Dept;
    }

    public String getB_Phone() {
        return b_Phone;
    }

    public String getB_Session() {
        return b_Session;
    }
}
