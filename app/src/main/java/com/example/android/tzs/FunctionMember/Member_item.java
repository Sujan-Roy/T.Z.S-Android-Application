package com.example.android.tzs.FunctionMember;

/**
 * Created by Android on 6/30/2017.
 */

public class Member_item {
    private String m_name;
    private String m_dept;
    private String m_phone;
    private String m_session;

    public Member_item(String m_name, String m_dept, String m_phone, String m_session) {
        super();
        this.m_name = m_name;
        this.m_dept = m_dept;
        this.m_phone = m_phone;
        this.m_session = m_session;
    }

    public String getM_name() {
        return m_name;
    }

    public String getM_dept() {
        return m_dept;
    }

    public String getM_phone() {
        return m_phone;
    }

    public String getM_session() {
        return m_session;
    }
}
