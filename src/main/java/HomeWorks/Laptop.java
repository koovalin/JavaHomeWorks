package HomeWorks;

import java.util.*;

public class Laptop {
    Integer id;
    String name;
    String osType;
    Integer hdMemory;
    Integer ramMemory;
    String color;

    public String getName() {return name;}
    public String getOsType() {return osType;}
    public Integer getHdMemory() {return hdMemory;}
    public Integer getRamMemory() {return ramMemory;}
    public String getColor() {return color;}


    {
        id = null;
        name = "Undefined";
        osType = "Undefined";
        hdMemory = null;
        ramMemory = null;
        color = "Undefined";
    }

    Laptop() {
    }

    Laptop(String name, String osType, Integer hdMemory, Integer ramMemory, String Color) {
        this.name = name;
        this.osType = osType;
        this.hdMemory = hdMemory;
        this.ramMemory = ramMemory;
        this.color = Color;
    }

    void displayInfo() {
        System.out.printf("\nName: %s, os: %s, hdMemory: %dGB, ramMemory: %dGB, Color: %s\n", name, osType, hdMemory, ramMemory, color);
    }
}
