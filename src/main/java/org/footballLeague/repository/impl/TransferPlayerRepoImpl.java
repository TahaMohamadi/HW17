package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.TransferPlayer;
import org.footballLeague.repository.TransferPlayerRepo;

public class TransferPlayerRepoImpl extends BaseRepositoryImpl<TransferPlayer, Long> implements TransferPlayerRepo {

    public TransferPlayerRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<TransferPlayer> getEntityClass() {
        return null;
    }
}
