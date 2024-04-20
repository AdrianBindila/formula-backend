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
public class SessionResult {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Driver driver;
    @OneToOne
    private Session session;
    private Long time;
    private Long points;
    private SessionStatus status;
}
