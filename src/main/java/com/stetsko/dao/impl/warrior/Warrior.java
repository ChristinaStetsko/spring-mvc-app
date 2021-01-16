package com.stetsko.dao.impl.warrior;

import com.stetsko.dao.impl.ORMAbstractDAO;
import com.stetsko.dao.warrior.WarriorDAO;
import com.stetsko.entity.warrior.WarriorEntity;
import org.springframework.stereotype.Repository;

@Repository
public class Warrior extends ORMAbstractDAO<WarriorEntity> implements WarriorDAO {

    @Override
    protected Class<WarriorEntity> getEntityClass() {
        return WarriorEntity.class;
    }
}