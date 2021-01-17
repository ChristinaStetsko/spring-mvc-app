package com.stetsko.dao.impl.weapon;

import com.stetsko.dao.impl.ORMAbstractDAO;
import com.stetsko.dao.weapon.WeaponDAO;
import com.stetsko.entity.weapon.WeaponEntity;
import org.springframework.stereotype.Repository;

@Repository
public class Weapon extends ORMAbstractDAO<WeaponEntity> implements WeaponDAO {

    @Override
    protected Class<WeaponEntity> getEntityClass() {
        return WeaponEntity.class;
    }
}