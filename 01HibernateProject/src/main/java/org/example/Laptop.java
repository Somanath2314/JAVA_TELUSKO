package org.example;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable
@Entity
public class Laptop {
@Id
    private int lid;
    private String brandName;
    @Column(name = "laptop_ram")
    private int Ram;
    @ManyToOne
    private Alien alien;
    public String getBrandName() {
        return brandName;
    }

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brandName='" + brandName + '\'' +
                ", Ram=" + Ram +
                '}';
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

}
