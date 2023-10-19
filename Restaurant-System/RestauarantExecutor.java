package com.upura.restaurant;

import com.upura.restaurant.chefs.Chefs;
import com.upura.restaurant.resto.Restauarant;

import java.util.Scanner;

public class RestauarantExecutor {

    public static void main(String[] args) {

        Chefs chefs = new Chefs();
        System.out.println("Enter the Size of an Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//
//        chefs.setId(1);
//        chefs.setName("Sudeepa");
//        chefs.setChefType("Senior Chef");
//        chefs.setSpecialist("Chinese");
//        chefs.setAge(48);

        Restauarant restauarant = new Restauarant(size);

        for (int i = 0; i < size ; i++) {
//            System.out.println("Enter the ID");
//            chefs.setId(sc.nextInt());
            System.out.println("Enter the Name");
            chefs.setName(sc.next());
            System.out.println("Enter the Post");
            chefs.setChefType(sc.next());
            System.out.println("Enter the dish specialist of Chef");
            chefs.setSpecialist(sc.next());
            System.out.println("Enter the Age");
            chefs.setAge(sc.nextInt());
            restauarant.addChefs(chefs);
        }

        restauarant.getDetails();

        String input = null ;

        do {
            System.out.println("Press 1:To get all the Details");
            System.out.println("Press 2:To get Chef name by Id");
            System.out.println("Press 3:To get post name by Chef Name");
            System.out.println("Press 4:To update name by Specialization");

            int options = sc.nextInt();
            switch (options) {
                case 1:
                    restauarant.getDetails();
                    break;
                case 2:
                    System.out.println("Enter id to ge product Name");
                    Chefs name= restauarant.getChefNameByID(sc.nextInt());
                    System.out.println(name);
                    break;
                case 3:
                    System.out.println("Enter Chef name to get post name");
                    Chefs post=restauarant.getPostNameByChefName(sc.next());
                    System.out.println(post);
                    break;
                case 4:
                    System.out.println("Enter Specialization to update name");
                    Chefs spec=restauarant.getAddressByChefName(sc.next());
                    System.out.println(spec);
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println("Do you want to continue yes/no");
            input = sc.next();

        }
        while (input.equals("yes"));
        System.out.println("Thank you for visiting ");

    }



    }

