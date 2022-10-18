package org.footballLeague.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class City extends BaseEntity<Long> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long code;


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code=" + code +
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
}
