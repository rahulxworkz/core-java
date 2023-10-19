package com.upura.restaurant.resto;


import com.upura.restaurant.chefs.Chefs;

import java.util.Arrays;

public class Restauarant {

    Chefs chefs[];
    int index = 0;

    public Restauarant(int size) {
        chefs = new Chefs[size];
    }

    int dummy = 1;

    public boolean addChefs(Chefs chefs) {
        boolean isAdded = false;
        if (chefs != null) {
            chefs.setId(dummy++);
            this.chefs[index++] = chefs;
            isAdded = true;
            System.out.println("Chefs Added Successfully!!");
        }
        return isAdded;
    }

    public void getDetails() {
        for (int i = 0; i < chefs.length - 1; i++) {
            System.out.println("The id of Chef is " + chefs[i].getId());
            System.out.println("The name of Chef is " + chefs[i].getName());
            System.out.println("The post name of chef is " + chefs[i].getChefType());
            System.out.println("Our Chef Specialist in " + chefs[i].getSpecialist());
            System.out.println("The age of Chef is " + chefs[i].getAge());
        }
    }

    public Chefs getChefNameByID(int id) {
        Chefs chef = null;
        for (int i = 0; i < this.chefs.length; i++) {
            if (chefs[i].getId() == id) {
                chef = chefs[i];
                System.out.println("Chef found");
            }
        }
        return chef;
    }

    public Chefs getPostNameByChefName(String name){
        Chefs chef = null;
        for (int i = 0; i < chefs.length ; i++) {
            if(chefs[i].getName() == name){
                chef = chefs[i];
                System.out.println("Post Name Found");
            }
        }
        return chef;
    }

    public Chefs getAddressByChefName(String name){
        Chefs chef = null;
        for (int i = 0; i < chefs.length ; i++) {
            if(chefs[i].getName() == name){
                chef = chefs[i];
                System.out.println("Address Found");
            }
        }
        return chef;
    }

    public boolean updateNameBySpecialization(String name, String newSpecialization) {
        boolean isUpdated = false;
        for (int i = 0; i < chefs.length; i++) {
            if (chefs[i].getName().equals(name)) {
                chefs[i].setSpecialist(newSpecialization);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public void deleteChefById(int id) {
        int i, index;
        for (i = 0, index = 0; i < chefs.length; i++) {
            if (chefs[i].getId() != id) {
                chefs[index++] = chefs[i];
                System.out.println("Officer is deleted");

            }
        }
        chefs = Arrays.copyOf(chefs, index);
        for (int j = 0; j < this.chefs.length; j++) {
            System.out.println("Address :" + chefs[j].getName() +
                    " Officer ID :" + chefs[j].getId() +
                    "Address :" + chefs[j].getAddress() +
                    "Age :" + chefs[j].getAge() +
                    "Gender :" + chefs[j].getGender() +
                    "Post :" + chefs[j].getChefType() +
                    "Specialization :" + chefs[j].getSpecialist());


        }

    }
}
