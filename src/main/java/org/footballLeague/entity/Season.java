package org.footballLeague.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.footballLeague.base.entity.BaseEntity;

import java.sql.Date;

@Entity
public class Season extends BaseEntity<Long> {
    @Column(nullable = false)
    private Date fromDate;
    private Date thruDate;
    private Integer number;

    @Override
    public String toString() {
        return "Season{" +
                "fromDate=" + fromDate +
                ", thruDate=" + thruDate +
                ", number=" + number +
                '}';
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
