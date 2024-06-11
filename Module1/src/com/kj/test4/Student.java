package com.kj.test4;

public class Student extends Person{
    // student attributes
    private int uid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void shout() {
        System.out.println("Student is shouting");
    }
}
