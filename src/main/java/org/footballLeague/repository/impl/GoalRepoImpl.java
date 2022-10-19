package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.BaseRepository;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Goal;
import org.footballLeague.repository.GoalRepo;

import java.util.List;

public class GoalRepoImpl extends BaseRepositoryImpl<Goal, Long> implements GoalRepo {

    public GoalRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Goal> getEntityClass() {
        return null;
    }
}
