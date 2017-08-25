package com.northcoders.model;

public class Building {

    private Long buildingId = null;
    private String name = null;
    private String type = null;
    private int noOfRooms;
    private int noOfParkingSpaces;

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return this.name;
    }

    public void setBuildingName(String name) {
        this.name = name;
    }

    public String getBuildingType() {
        return this.type;
    }

    public void setBuildingType(String type) {
        this.type = type;
    }

    public int getNoOfRooms() {
        return this.noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public int getNoOfParkingSpaces() {
        return this.noOfParkingSpaces;
    }

    public void setNoOfParkingSpaces(int noOfParkingSpaces) {
        this.noOfParkingSpaces = noOfParkingSpaces;
    }

}

