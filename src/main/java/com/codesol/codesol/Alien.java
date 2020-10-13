package com.codesol.codesol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String tech;

    @Autowired
    private Laptop laptop;
    public Alien() {
        super();
        System.out.println("One object created..");
    }

    public int getAid() {
        return aid;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public void show()
    {
        System.out.println("You are in Show Method");
        laptop.compile();
    }
}
