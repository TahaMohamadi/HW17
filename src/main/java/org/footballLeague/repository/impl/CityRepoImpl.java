package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.City;
import org.footballLeague.repository.CityRepo;
import org.hibernate.Session;

import java.util.List;

public class CityRepoImpl extends BaseRepositoryImpl<City,Long>  implements CityRepo {
    public CityRepoImpl(Session session) {
        super(session);
    }

    @Override
    public Class<City> getEntityClass() {
        return null;
    }
}
