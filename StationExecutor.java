package com.upura.station;

import com.upura.station.officer.Officer;
import com.upura.station.station.PoliceStation;

import java.util.Scanner;

public class StationExecutor {

    public static void main(String[] args) {

          Officer officer = new Officer();
//
//        officer.setId(1);
//        officer.setName("Rahul");
//        officer.setPostName("Superintend of Police");
//        officer.setAge(25);
//
//        Officer officer1 = new Officer();
//
//        officer1.setId(2);
//        officer1.setName("Agni");
//        officer1.setPostName("Sub Inspector");
//        officer1.setAge(31);
//
//        PoliceStation policeStation = new PoliceStation();
//        policeStation.addOfficers(officer);
//        policeStation.getDetails();
//        PoliceStation policeStation1 = new PoliceStation();
//        policeStation1.addOfficers(officer1);
//        policeStation1.getDetails();


//        policeStation.getOfficerNameByPostName("Superintend of Police");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        PoliceStation policeStation = new PoliceStation(size);

        for (int i = 0; i < size ; i++) {
           System.out.println("Enter the ID");
            officer.setId(sc.nextInt());
            System.out.println("Enter Name");
            officer.setName(sc.next());
            System.out.println("Enter the post Name");
            officer.setPostName(sc.next());
            System.out.println("Enter the Age");
            officer.setAge(sc.nextInt());
            policeStation.addOfficers(officer);
            policeStation.getDetails();
            System.out.println("Enter name to get Age");
            policeStation.getOfficerAgeByName(sc.next());

        }

    }
}
