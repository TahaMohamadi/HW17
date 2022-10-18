package org.footballLeague.entity;

import jakarta.persistence.*;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class Player  extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    private long lastPrice;
    private Integer number;

    @Override
    public String toString() {
        return "player{" +
                "person=" + person +
                ", team=" + team +
                ", lastPrice=" + lastPrice +
                ", number=" + number +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public long getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(long lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
