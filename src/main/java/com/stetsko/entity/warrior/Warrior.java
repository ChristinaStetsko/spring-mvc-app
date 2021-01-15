package com.stetsko.entity.warrior;


import com.stetsko.entity.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "warrior")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Warrior extends AbstractEntity {

    @Column(name = "warrior_name")
    private String name;

    @Column(name = "warrior_surname")
    private String surname;

    @Column(name = "")
    String weapon;

    String membership;

// TODO: 1/15/21 Закончи со ВСЕМИ entities 
}