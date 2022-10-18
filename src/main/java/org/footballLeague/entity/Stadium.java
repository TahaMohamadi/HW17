package org.footballLeague.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.footballLeague.base.entity.BaseEntity;

import javax.persistence.Column;

@Entity
public class Stadium extends BaseEntity<Long> {
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @Column(nullable = false)
    private long Code;
    private Integer capacity;

    @Override
    public String toString() {
        return "Stadium{" +
                "city=" + city +
                ", Code=" + Code +
                ", capacity=" + capacity +
                '}';
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public long getCode() {
        return Code;
    }

    public void setCode(long code) {
        Code = code;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
