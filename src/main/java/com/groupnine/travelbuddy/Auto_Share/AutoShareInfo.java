package com.groupnine.travelbuddy.Auto_Share;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AutoShareInfo {
    String fullname, place;
    Integer no_of_vacs;
    Time time;
    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }
    public String getPlace() { return place; }
    public void setPlace(String place) { this.place = place; }
    public Integer getNo_of_vacs() { return no_of_vacs; }
    public void setNo_of_vacs(Integer no_of_vacs) { this.no_of_vacs = no_of_vacs; }
    public Time getTime() { return time; }
    public String getTimeInString() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String timeStr = format.format(time);
        return timeStr;
    }
    public void setTime(Time time) { this.time = time; }
    public AutoShareInfo(String fullname, String place, Integer no_of_vacs, Time time) {
        setFullname(fullname); setPlace(place); setNo_of_vacs(no_of_vacs); setTime(time);
    }

}
