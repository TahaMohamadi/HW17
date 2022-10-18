package org.footballLeague.entity;

import jakarta.persistence.*;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class Goal extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @ManyToOne
    @JoinColumn(name = "from_team_id")
    private Team fromTeam;
    @ManyToOne
    @JoinColumn(name = "to_team_id")
    private Team toTeam;
    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;
    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @Override
    public String toString() {
        return "Goal{" +
                "player=" + player +
                ", fromTeam=" + fromTeam +
                ", toTeam=" + toTeam +
                ", match=" + match +
                ", season=" + season +
                '}';
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
