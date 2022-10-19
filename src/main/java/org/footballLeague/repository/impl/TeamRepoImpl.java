package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.BaseRepository;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Team;
import org.footballLeague.repository.TeamRepo;

public class TeamRepoImpl extends BaseRepositoryImpl<Team,Long> implements TeamRepo {
    public TeamRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Team> getEntityClass() {
        return null;
    }
}
