package HomeWorks;

import java.util.*;

public class Laptop {
    Integer id;
    String name;
    String osType;
    Integer hdMemory;
    Integer ramMemory;
    String color;

    public Integer getId(){return id;}
    public String getName() {return name;}
    public String getOsType() {return osType;}
    public Integer getHdMemory() {return hdMemory;}
    public Integer getRamMemory() {return ramMemory;}
    public String getLapTopColor() {return color;}


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

    Laptop(Integer id, String name, String osType, Integer hdMemory, Integer ramMemory, String Color) {
        this.id = id;
        this.name = name;
        this.osType = osType;
        this.hdMemory = hdMemory;
        this.ramMemory = ramMemory;
        this.color = Color;
    }

    void displayInfo() {
        System.out.printf("\nid: %d, Name: %s, osType: %s, hdMemory: %dGB, ramMemory: %dGB, Color: %s\n", id, name, osType, hdMemory, ramMemory, color);
    }

    public boolean equals(Object o) {
        Laptop t = (Laptop) o;
        return Objects.equals(id, t.id);
    }
}
