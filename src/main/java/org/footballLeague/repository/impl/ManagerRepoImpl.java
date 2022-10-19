package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Manager;
import org.footballLeague.repository.ManagerRepo;

public class ManagerRepoImpl extends BaseRepositoryImpl<Manager,Long> implements ManagerRepo {
    public ManagerRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Manager> getEntityClass() {
        return null;
    }
}
