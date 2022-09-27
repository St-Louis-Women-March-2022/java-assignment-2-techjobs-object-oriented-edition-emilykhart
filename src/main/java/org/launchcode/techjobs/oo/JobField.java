package org.launchcode.techjobs.oo;

public abstract class JobField {
    private int id;
    private static int nextID = 1;
    private String value;

    public JobField(String value) {
        id=nextID;
        nextID++;
        this.value=value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == "") {
            this.value = "Data not available";
        }
        return value;
    }
}
