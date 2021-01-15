package com.stetsko.entity.membership;

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
@Table(name = "membership")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Membership extends AbstractEntity {

    @Column(name = "membership_name")
    private String name;


    @Column(name = "description")
    private String description;
}
