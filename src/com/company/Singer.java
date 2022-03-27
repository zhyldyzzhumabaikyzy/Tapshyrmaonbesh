package com.company;

public class Singer extends Person {
    private String bondName;

    public Singer(String name, String designation, String bondName) {
        super(name, designation);
        this.bondName = bondName;
    }

    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    public void singing() {
    }
    public void playGitar() {
    }

    @Override
    public String toString() {
        return super.getName() + "," + super.getDesignation() + "," + getBondName();
    }
}
