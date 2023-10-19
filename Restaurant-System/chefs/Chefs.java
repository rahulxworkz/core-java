package com.upura.restaurant.chefs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Chefs {

    private int id;
    private String name;
    private String chefType;
    private String specialist;
    private int age;
    private String address;
    private String gender;

}
