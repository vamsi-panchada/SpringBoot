package com.school.schoolmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Session {

    @Id
    private int session_id;
    private String session_name;

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    @Override
    public String toString() {
        return "Session{" +
                "session_id=" + session_id +
                ", session_name='" + session_name + '\'' +
                '}';
    }

}
