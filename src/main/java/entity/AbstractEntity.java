package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@ToString
@Getter
@Setter
public abstract class AbstractEntity implements IEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // TODO: 1/14/21 добавь @Column для бд
    protected Long id;
}
