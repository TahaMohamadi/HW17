package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Season;
import org.footballLeague.repository.SeasonRepo;

public class SeasonRepoImpl extends BaseRepositoryImpl<Season,Long> implements SeasonRepo {

    @Override
    public Class<Season> getEntityClass() {
        return null;
    }

    public SeasonRepoImpl(EntityManager em) {
        super(em);
    }

}
