package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.BaseRepository;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Manager;
import org.footballLeague.entity.Match;
import org.footballLeague.repository.ManagerRepo;
import org.footballLeague.repository.MatchRepo;

public class MatchRepoImpl extends BaseRepositoryImpl<Match,Long> implements MatchRepo {
    public MatchRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Match> getEntityClass() {
        return null;
    }
}
