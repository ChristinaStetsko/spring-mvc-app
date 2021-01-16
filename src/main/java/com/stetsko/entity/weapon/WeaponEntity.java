package com.stetsko.entity.weapon;

import com.stetsko.entity.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "weapons")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class WeaponEntity extends AbstractEntity {


    private String name;


}
