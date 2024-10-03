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
public class BankAccount {
    @Id
    private Long accountId;
    private String ifsc;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "bankAccount")
    private Employee employee;


}
