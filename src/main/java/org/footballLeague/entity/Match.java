package org.footballLeague.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class Match extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;
    @OneToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;
    private Integer homeGoal;
    private Integer awayGoal;
    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;
    @OneToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @Override
    public String toString() {
        return "Match{" +
                "homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", homeGoal=" + homeGoal +
                ", awayGoal=" + awayGoal +
                ", season=" + season +
                ", stadium=" + stadium +
                '}';
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getHomeGoal() {
        return homeGoal;
    }

    public void setHomeGoal(Integer homeGoal) {
        this.homeGoal = homeGoal;
    }

    public Integer getAwayGoal() {
        return awayGoal;
    }

    public void setAwayGoal(Integer awayGoal) {
        this.awayGoal = awayGoal;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }
}
