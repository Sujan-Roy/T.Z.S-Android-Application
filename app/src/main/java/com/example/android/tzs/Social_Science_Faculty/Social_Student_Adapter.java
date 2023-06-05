package com.example.android.tzs.Social_Science_Faculty;

/**
 * Created by Android on 7/3/2017.
 */

public class Social_Student_Adapter {
    private String so_Name;
    private String so_Dept;
    private String so_Phone;
    private String so_Session;

    public Social_Student_Adapter(String so_Name, String so_Dept, String so_Phone, String so_Session) {
        super();
        this.so_Name = so_Name;
        this.so_Dept = so_Dept;
        this.so_Phone = so_Phone;
        this.so_Session = so_Session;
    }

    public String getSo_Name() {
        return so_Name;
    }

    public String getSo_Dept() {
        return so_Dept;
    }

    public String getSo_Phone() {
        return so_Phone;
    }

    public String getSo_Session() {
        return so_Session;
    }
}
