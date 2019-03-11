package com.example.ics45jlab;

public class Info {
    private String name, email, phonenumber, uid;

    public Info (){
        name = "NA";
        email = "NA";
        phonenumber = "NA";
    }

    public Info (String n, String em, String pn, String id)
    {
        this.name = n;
        this.email = em;
        this.phonenumber = pn;
        this.uid = id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhonenumber(){
        return phonenumber;
    }

    public String getuid(){
        return uid;
    }

    public String toString(){
        return name + " " + email + " " + phonenumber;
    }
}
