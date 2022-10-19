package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.TransferManager;

public class TransferManagerRepoImpl extends BaseRepositoryImpl<TransferManager, Long> implements TransferPlayerRepo {
    public TransferManagerRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<TransferManager> getEntityClass() {
        return null;
    }
}
