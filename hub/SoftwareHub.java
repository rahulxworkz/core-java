package com.upura.playstoreapp.hub;
import com.upura.playstoreapp.application.Application;

import java.util.Arrays;

public class SoftwareHub {
    //object type array
    Application[]application = new Application[2];

    int index;
    //class type parameter
    public  boolean addApplication(Application application) {
        System.out.println("method of addApplication");
        boolean isAdded = false;
        if (application != null) {
            this.application[index++] = application;
            isAdded = true;
            System.out.println("application added to softwareHub successfully");

        }
        return isAdded;
    }
    public void get(){
        for(int index=0;index<application.length-1;index++){
            System.out.println(application[index].getAppId()+" "+application[index].getAppName()+" "+application[index].getAppType()+" "+application[index].getVersion()+" "+application[index].getCompanyName()+" "+application[index].getReleaseDate()+" "+application[index].getSizeInMb());
        }
    }
    public Application getApplicationByName(String appName){
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length-1; appIndex++) {
            if(application[appIndex].getAppName() == appName){
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }
    public Application getApplicationById(int appId){
        Application app = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if(application[appIndex].getAppId()== appId){
                app = application[appIndex]  ;
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return app;
    }
    public Application getApplicationByAppType(String appType){
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if(application[appIndex].getAppType() == appType){
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }
    public Application getApplicationNameByType(String appName){
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if(application[appIndex].getAppName() == appName){
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }
    public Application getApplicationTypeByName(String appType){
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if(application[appIndex].getAppType() == appType){
                application1 = application[appIndex];
                System.out.println("Application found.... please collect in the executor");
            }
        }
        return application1;
    }

    public boolean updateVersionAndSizeInMbByName(String updatedVersion ,double updatedSizeInMb  ,String existingAppName) {
        boolean isVersionAndSizeInMbUpdated = false;
        for (int appIndex = 0; appIndex < this.application.length-1; appIndex++) {
            if (application[appIndex].getAppName() == existingAppName){
                    application[appIndex].setVersion(updatedVersion ) ;
                application[appIndex].setSizeInMb(updatedSizeInMb );
                isVersionAndSizeInMbUpdated =true;

            }
        }
        System.out.println("After the App Update "+updatedVersion+ " "+updatedSizeInMb+ " of "+existingAppName);
        return isVersionAndSizeInMbUpdated;
    }

    public void deleteApplicationByAppName(String appName){
        System.out.println("invoked deleteApplicationByAppName");

        int index , newIndex;
        for ( index = 0 ,newIndex =0 ; index < this.application.length-1;index++){
            if (application[index].getAppName() != appName){
                application[newIndex++] = application[index];
                System.out.println("Given App name is deleted from the software hub");
            }
        }
        application = Arrays.copyOf(application , newIndex);
        getAllNewApplication(application);
    }

    public void getAllNewApplication(Application[] application) {
        System.out.println("New Application list");
        for (int i = 0; i < application.length ; i++) {
            System.out.println(application[i].getAppName());
        }
    }
}
