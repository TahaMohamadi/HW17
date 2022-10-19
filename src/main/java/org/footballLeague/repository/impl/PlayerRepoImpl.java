package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.BaseRepository;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Manager;
import org.footballLeague.entity.Player;
import org.footballLeague.repository.ManagerRepo;
import org.footballLeague.repository.PlayerRepo;

public class PlayerRepoImpl extends BaseRepositoryImpl<Player,Long> implements PlayerRepo {
    public PlayerRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Player> getEntityClass() {
        return null;
    }
}
