package org.example;

public class Fine {
    private String name;
    private double fine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public Fine(String name, double fine) {
        this.name = name;
        this.fine = fine;
    }
}
