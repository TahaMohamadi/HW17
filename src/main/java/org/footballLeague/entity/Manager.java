package org.footballLeague.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class Manager extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;
    private Long lastPrice;

    @Override
    public String toString() {
        return "Manager{" +
                "person=" + person +
                ", team=" + team +
                ", lastPrice=" + lastPrice +
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

    public Long getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Long lastPrice) {
        this.lastPrice = lastPrice;
    }
}
