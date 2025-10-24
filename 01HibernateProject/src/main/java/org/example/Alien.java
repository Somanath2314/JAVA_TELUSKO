package org.example;


import jakarta.persistence.*;

import java.util.List;

//in order to change the table_name and the column name -> you can use the anootations Table and column to do so

@Entity
public class Alien {

    @Id
    private int aid;
    @Column(name = "alien_name")
    private String aname;
    @Column(name = "alien_age")
    private int age;
    @OneToMany(mappedBy = "alien", cascade = CascadeType.ALL)
    private List<Laptop> laptops;


//    transient is used if you dont want to store this in the DB, bez it might be temp variable using just for some calculations etc
    @Transient
    private String tech;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", age=" + age +
                ", laptops=" + laptops +
                ", tech='" + tech + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Laptop> getLaptop() {
        return laptops;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptops = laptop;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

}
