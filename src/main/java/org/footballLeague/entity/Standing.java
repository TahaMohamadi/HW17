package org.footballLeague.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.footballLeague.base.entity.BaseEntity;

@Entity
public class Standing extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;
    private Integer matchPlayed;
    private Integer win;
    private Integer draw;
    private Integer loos;
    private Integer gf;
    private Integer ga;
    private Integer gd;
    private Integer pts;

    @Override
    public String toString() {
        return "Standing{" +
                "team=" + team +
                ", matchPlayed=" + matchPlayed +
                ", win=" + win +
                ", draw=" + draw +
                ", loos=" + loos +
                ", gf=" + gf +
                ", ga=" + ga +
                ", gd=" + gd +
                ", pts=" + pts +
                '}';
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getMatchPlayed() {
        return matchPlayed;
    }

    public void setMatchPlayed(Integer matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getLoos() {
        return loos;
    }

    public void setLoos(Integer loos) {
        this.loos = loos;
    }

    public Integer getGf() {
        return gf;
    }

    public void setGf(Integer gf) {
        this.gf = gf;
    }

    public Integer getGa() {
        return ga;
    }

    public void setGa(Integer ga) {
        this.ga = ga;
    }

    public Integer getGd() {
        return gd;
    }

    public void setGd(Integer gd) {
        this.gd = gd;
    }

    public Integer getPts() {
        return pts;
    }

    public void setPts(Integer pts) {
        this.pts = pts;
    }
}
