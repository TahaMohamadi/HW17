package org.footballLeague.entity;

import jakarta.persistence.*;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class Person extends BaseEntity<Long> {

    @Column (nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String LastName;
    @Column (nullable = false)
    private Long idCode;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", idCode=" + idCode +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Long getIdCode() {
        return idCode;
    }

    public void setIdCode(Long idCode) {
        this.idCode = idCode;
    }
}
