package com.example.hostelallotmentapplication;

public class Details {
    String Name,Email,RoomNO,Wing1,newHostel;
    int noOfRooms;

    public Details()
    {

    }

    public Details(String name, String email, String roomNO, String wing1, String newHostel, int noOfRooms) {
        Name = name;
        Email = email;
        RoomNO = roomNO;
        Wing1 = wing1;
        this.newHostel = newHostel;
        this.noOfRooms = noOfRooms;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRoomNO() {
        return RoomNO;
    }

    public void setRoomNO(String roomNO) {
        RoomNO = roomNO;
    }

    public String getWing1() {
        return Wing1;
    }

    public void setWing1(String wing1) {
        Wing1 = wing1;
    }

    public String getNewHostel() {
        return newHostel;
    }

    public void setNewHostel(String newHostel) {
        this.newHostel = newHostel;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }
}
