package org.footballLeague.entity;

import jakarta.persistence.*;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class Team extends BaseEntity<Long> {
    @Column(nullable = false)
    private String name;
    private Long code;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @OneToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", city=" + city +
                ", stadium=" + stadium +
                ", manager=" + manager +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
