package org.formula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Session {
    @Id
    @GeneratedValue
    private Long id;

    //since a driver may be unable to participate in Practice or Qualifying
    //allow the driver list to change on a session-by-session basis
    @OneToMany
    private List<Driver> drivers;

    @OneToMany
    private List<SessionResult> results;

    private SessionType sessionType;
    private SubSessionType subSessionType; //Practice 1 2 or 3, Qualifying 1 2 or 3, null otherwise
    private LocalDateTime sessionDateTime;
}
