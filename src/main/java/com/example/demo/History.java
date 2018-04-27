/*
package com.example.demo;

import javax.persistence.*;
import java.util.Set;

public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String eAddress;
   private String phone;
    private String experience;
    private String eAchievements;
    private String ability;

    @OneToMany(mappedBy= "director",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    public Set<History> histories;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String geteAchievements() {
        return eAchievements;
    }

    public void seteAchievements(String eAchievements) {
        this.eAchievements = eAchievements;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
*/
