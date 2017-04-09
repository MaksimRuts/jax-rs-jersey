package com.roots.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Maksim Ruts on 4/9/2017.
 */
@XmlRootElement
public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
