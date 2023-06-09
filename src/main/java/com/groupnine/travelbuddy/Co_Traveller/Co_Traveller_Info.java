package com.groupnine.travelbuddy.Co_Traveller;
import java.sql.Time;
import java.sql.Date;
import java.text.SimpleDateFormat;
public class Co_Traveller_Info  {
    String Transportation,Fromplace,Toplace,Name,Mail;
    Integer Serviceno;
    Time time;
    Date date;
//    public Co_Traveller_Info(String transportation, String serviceNo, String from, String to, String date, String time) {
//    }
//    public Co_Traveller_Info(String name, String dest) {
//    }
//    public Co_Traveller_Info(String name, String dest, String date, String time) {
//    }
    public Co_Traveller_Info(String name,String transportation, int serviceNo, String from, String to, java.sql.Date date, java.sql.Time time) {
        this.Name=name;setTransportation(transportation); setServiceno(serviceNo); setFromplace(from); setToplace(to); setDate(date); setTime(time);
    }
    public Co_Traveller_Info(String destination,String date,String time,String email){
        setToplace(destination);setDate(java.sql.Date.valueOf(date));setTime(java.sql.Time.valueOf(time));setMail(email);
    }

    public Co_Traveller_Info(String name, String dest, java.sql.Date date, java.sql.Time time) {
    }

    public Co_Traveller_Info(String name) {
        setName(name);
    }

    public Co_Traveller_Info(String name, String email, Integer serviceno) {
        setName(name); setMail(email); setServiceno(serviceno);
    }

    public Co_Traveller_Info(String name, String email, Integer serviceno, Date date, java.sql.Time time) {
        setName(name); setMail(email); setServiceno(serviceno); setDate(date); setTime(time);
    }

    public String getMail(){return Mail;}
    public void setMail(String Mail){this.Mail = Mail;}
    public String getTransportation(){return Transportation;}
    public void setTransportation(String Transportation){this.Transportation = Transportation;}
    public int getServiceno(){return Serviceno;}
    public void setServiceno(int Serviceno){this.Serviceno = Serviceno;}
    public String getFromplace(){return Fromplace;}
    public void setFromplace(String Fromplace){this.Fromplace = Fromplace;}
    public String getToplace(){return Toplace;}
    public void setToplace(String Toplace){this.Toplace = Toplace;}
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date;
    }
    public String getDateInString() {
        return date.toString();
    }
    public Time getTime() { return time; }
    public String getTimeInString() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return format.format(time);
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name){this.Name = Name;}
    public void setTime(Time time) { this.time = time; }
    public Co_Traveller_Info(String transportation,int serviceno,String fromplace,String toplace,Date date,Time time,String name){
        setTransportation(transportation);setServiceno(serviceno);setFromplace(fromplace);setToplace(toplace);setDate(date);setTime(time);setName(name);}



}
