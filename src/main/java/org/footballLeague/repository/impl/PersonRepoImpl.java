package org.footballLeague.repository.impl;

import jakarta.persistence.EntityManager;
import org.footballLeague.base.repository.impl.BaseRepositoryImpl;
import org.footballLeague.entity.Person;
import org.footballLeague.repository.PersonRepo;

public class PersonRepoImpl  extends BaseRepositoryImpl<Person,Long> implements PersonRepo {
    @Override
    public Class<Person> getEntityClass() {
        return null;
    }

    public PersonRepoImpl(EntityManager em) {
        super(em);
    }


}
