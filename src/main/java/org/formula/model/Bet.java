package org.formula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bet {
    //A user may bet on a driver for a particular race or sprint
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Session session;
    @OneToOne
    private User user;
}
