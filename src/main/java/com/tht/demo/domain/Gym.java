package com.tht.demo.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "gyms")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "count")
    private Long count;

    @Column(name = "reg_code")
    private String regCode;
}
