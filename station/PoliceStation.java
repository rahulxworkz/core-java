package com.upura.station.station;
import com.upura.station.officer.Officer;

import java.util.Arrays;

public class PoliceStation {

        Officer officer[];
        int index;

    public PoliceStation(int size){

        officer =new Officer[size];


    }

        public boolean addOfficers(Officer officer){
            boolean isAdded = false;
            if(officer != null){
                this.officer[index++] = officer;
            isAdded = true;
                System.out.println("Officers added successfully");
            }
            return isAdded;
        }

        public void getDetails(){
            for (int i = 0; i < officer.length-1 ; i++) {
                System.out.println("The id of Officer is "+officer[i].getId()+"\n"+
                        "The name of Officer is "+officer[i].getName()+"\n"+
                        "The post name of Officer is "+officer[i].getPostName()+"\n"+
                        "The age of Officer is "+officer[i].getAge());
            }
        }

        public Officer getOfficerNameByPostName(String postName){
              Officer officer1 = null;
              for (int i = 0; i < this.officer.length ; i++){
                  if (officer[i].getPostName() == postName ) {
                      officer1 = officer[i];
                      System.out.println("Officer found");
                  }
              }
              return officer1;
        }

    public  String getAddressById(int id){

        String policid=null;
        for (int index = 0; index < officer.length; index++) {
            if(officer[index].getId()==id){
                policid=officer[index].getAddress();
            }

        }
        return policid;
    }

    public Officer getOfficerInfoById(int id){
        Officer off=null;
        for (int index = 0; index < officer.length; index++) {
            if(officer[index].getId()==id){
                off=officer[index];
            }

        }
        return off;
    }

    public int getOfficerAgeByName(String name){
        int age=0;
        for (int index = 0; index < officer.length-1; index++) {
            if(officer[index].getName().equals(name)){
                age=officer[index].getAge();
            }
        }
        return age;
    }
    public String getPostByName(String name){

        for (int index = 0; index < officer.length; index++) {
            if(officer[index].getName()==name){
                return officer[index].getPostName();

            }

        }
        return null;
    }
    public  String getPostNameById(int id){
        String post=null;
        for (int index = 0; index < officer.length; index++) {
            if(officer[index].getId()==id){
                post=officer[index].getPostName();
            }

        }
        return post;
    }
    public boolean updatePostnameByName(String updatedPost ,String name){
        boolean isAdded=false;
        for (int index = 0; index < officer.length; index++) {
            if(officer[index].getName()==name){
                officer[index].setPostName(updatedPost);
                isAdded=true;
            }
        }
        return isAdded;

    }

    public void deleteOfficerById(int id){
        int index,newindex;
        for ( index=0,newindex=0; index <officer.length ; index++) {
            if(officer[index].getId()!=id){
                officer[newindex]=officer[index];

            }
            else{
                System.out.println("given officer is suspended");


            }

        }
        officer= Arrays.copyOf(officer,newindex);
    }
    public void getnewOfficerslist(Officer[]officers){
        System.out.println("new officers list");
        for (int index = 0; index < officers.length; index++) {
            System.out.println(officers[index].getId()+""+
                    officers[index].getName()+""+
                    officers[index].getAge()+""+
                    officers[index].getPostName()+""+
                    officers[index].getBloodGroup());

        }
    }

}

