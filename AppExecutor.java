package com.upura.playstoreapp;
import com.upura.playstoreapp.hub.SoftwareHub;

import com.upura.playstoreapp.application.Application;

public class AppExecutor {

        public static void main(String[] args) {
            Application application = new Application();
            application.setAppId(1);
            application.setAppName("Mr.driver");
            application.setAppType("Gaming");
            application.setCompanyName("ESA Games");
            application.setSizeInMb(501.26d);
            application.setReleaseDate("23/02/2003");
            application.setVersion("1.01v");

            Application application1 = new Application();
            application1.setAppId(2);
            application1.setAppName("WhatsApp");
            application1.setAppType("SocialMedia");
            application1.setCompanyName("Meta");
            application1.setSizeInMb(102.03d);
            application1.setReleaseDate("25/09/2011");
            application1.setVersion("5.01v");

//            System.out.println(application.getAppId());

            SoftwareHub softwareHub=new SoftwareHub();
            softwareHub.addApplication(application);
            SoftwareHub softwareHub1=new SoftwareHub();
            softwareHub1.addApplication(application1);
            softwareHub.get();
            softwareHub.updateVersionAndSizeInMbByName("5.03v" , 103.55d , "WhatsApp");
            softwareHub1.getApplicationByName("WhatsApp");
            softwareHub.deleteApplicationByAppName("WhatsApp");

        }
}
