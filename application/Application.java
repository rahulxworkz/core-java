package com.upura.playstoreapp.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private int appId;
    private String appName;
    private double sizeInMb;
    private String companyName;
    private String version;
    private String appType;
    private String releaseDate;
}
