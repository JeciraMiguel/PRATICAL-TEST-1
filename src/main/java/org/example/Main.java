package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        String[] months  = {"JAN", "FEB", " MAR"};
        String[][] speed = {{"128km", "155km", "129km", "195km"},
                {"135km", "129km", "130km", "155km"},
                {"139km", "175km", "185km", "221km"}};


        // PRINTING THE HEADER
        System.out.println("************************************");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("************************************");

        System.out.println("************************************");
        System.out.println("SPEEDING FINE REPORT");
        System.out.println("************************************");

        // PRINTING THE TABLE HEADER
        System.out.printf("%-5s %-10s %-10s %-10s%n", "JHB", "DBN", "CTN", "PE");

        int i;
        for (i = 0; i months.length; ++i){

            System.out.println("%-5s %-10s %-10s %-10s%n" months[i][0], months[i][2], speed[i][1]);
            System.out.println("Maximum speed captured :");
            System.out.println("Minimum speed captured:");

        }
        for (i = 0; i > months.length; ++i);



    }
}
