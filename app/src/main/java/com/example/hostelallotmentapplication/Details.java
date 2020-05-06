package com.example.hostelallotmentapplication;

public class Details {
    String name,email,roomno,wing1,hostel;

    public Details(String name, String email, String roomno, String wing1, String hostel, int noOfRooms) {
        this.name = name;
        this.email = email;
        this.roomno = roomno;
        this.wing1 = wing1;
        this.hostel = hostel;
        NoOfRooms = noOfRooms;
    }

    int NoOfRooms;

    public String getWing1() {
        return wing1;
    }

    public void setWing1(String wing1) {
        this.wing1 = wing1;
    }


    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public int getNoOfRooms() {
        return NoOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        NoOfRooms = noOfRooms;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public Details()
    {

    }
}
