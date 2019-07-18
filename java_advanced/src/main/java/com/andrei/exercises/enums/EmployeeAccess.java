package com.andrei.exercises.enums;

public enum EmployeeAccess {
    ANDREI("High", 1),
    ALEX("Medium", 2),
    MIHAI("Low", 3);

    String accessType;
    int accessID;

    EmployeeAccess(String accessType, int accessID) {
        this.accessType = accessType;
        this.accessID = accessID;
    }

    public void print(){
        System.out.println("Domnul "+this.name()+" are access de tip "+accessType+" cu codul: "+accessID+".");
    }
}
