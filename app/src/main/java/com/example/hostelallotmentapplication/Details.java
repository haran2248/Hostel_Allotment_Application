package com.example.hostelallotmentapplication;

public class Details {
    String name,email,roomno,wing1,wing2,wing3,wing4,wing5,hostel;
    int NoOfRooms;

    public String getWing1() {
        return wing1;
    }

    public void setWing1(String wing1) {
        this.wing1 = wing1;
    }

    public String getWing2() {
        return wing2;
    }

    public void setWing2(String wing2) {
        this.wing2 = wing2;
    }

    public String getWing3() {
        return wing3;
    }

    public void setWing3(String wing3) {
        this.wing3 = wing3;
    }

    public String getWing4() {
        return wing4;
    }

    public void setWing4(String wing4) {
        this.wing4 = wing4;
    }

    public String getWing5() {
        return wing5;
    }

    public void setWing5(String wing5) {
        this.wing5 = wing5;
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

    public Details(String name, String email, String roomno, String wing1, String wing2, String wing3, String wing4, String wing5, String hostel, int noOfRooms) {
        this.name = name;
        this.email = email;
        this.roomno = roomno;
        this.wing1 = wing1;
        this.wing2 = wing2;
        this.wing3 = wing3;
        this.wing4 = wing4;
        this.wing5 = wing5;
        this.hostel = hostel;
        NoOfRooms = noOfRooms;
    }
    public Details()
    {

    }
}
