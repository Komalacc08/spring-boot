package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer technologyId;
    @Column(unique = true)
    private String name;

}
