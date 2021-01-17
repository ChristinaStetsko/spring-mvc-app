package com.stetsko.dao.impl.membership;

import com.stetsko.dao.impl.ORMAbstractDAO;
import com.stetsko.dao.membership.MembershipDAO;
import com.stetsko.entity.membership.MembershipEntity;
import org.springframework.stereotype.Repository;

@Repository
public class Membership extends ORMAbstractDAO<MembershipEntity> implements MembershipDAO {

    @Override
    protected Class<MembershipEntity> getEntityClass() {
        return MembershipEntity.class;
    }
}