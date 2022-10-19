package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.BaseRepository;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Standing;
import org.footballLeague.repository.StadiumRepo;
import org.footballLeague.repository.StandingRepo;

public class StandingRepoImpl extends BaseRepositoryImpl<Standing,Long> implements StandingRepo {
    public StandingRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Standing> getEntityClass() {
        return null;
    }
}
