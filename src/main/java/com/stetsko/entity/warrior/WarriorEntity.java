package com.stetsko.entity.warrior;


import com.stetsko.entity.AbstractEntity;
import com.stetsko.entity.membership.MembershipEntity;
import com.stetsko.entity.weapon.WeaponEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "warriors")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class WarriorEntity extends AbstractEntity {

    @Column(name = "warrior_name")
    private String name;

    @Column(name = "warrior_surname")
    private String surname;

    @JoinColumn(name = "weapon_id", referencedColumnName = "warrior_weapon")
    private WeaponEntity weaponEntity;

    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    MembershipEntity membershipEntity;

// TODO: 1/15/21 Закончи со ВСЕМИ entities 
}