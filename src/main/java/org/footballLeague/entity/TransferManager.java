package org.footballLeague.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class TransferManager extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;
    @OneToOne
    @JoinColumn(name = "from_team_id")
    private Team fromTeam;
    @OneToOne
    @JoinColumn(name = "to_team_id")
    private Team toTeam;
    private long price;
    @OneToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @Override
    public String toString() {
        return "TransferManager{" +
                "manager=" + manager +
                ", fromTeam=" + fromTeam +
                ", toTeam=" + toTeam +
                ", price=" + price +
                ", season=" + season +
                '}';
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Team getFromTeam() {
        return fromTeam;
    }

    public void setFromTeam(Team fromTeam) {
        this.fromTeam = fromTeam;
    }

    public Team getToTeam() {
        return toTeam;
    }

    public void setToTeam(Team toTeam) {
        this.toTeam = toTeam;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}

