package com.upura.station.officer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Officer {

    private int id;
    private String name;
    private String postName;
    private String address;
    private String bloodGroup;
    private int age;
}
