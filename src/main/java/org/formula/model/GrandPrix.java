package org.formula.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class GrandPrix {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Circuit circuit;
    @OneToMany
    private List<Session> sessions;
    private LocalDateTime raceDate;
}