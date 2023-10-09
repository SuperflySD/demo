package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {

    @Id
    @SequenceGenerator(name="seq",sequenceName="client_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private  Long id;
    private String name;
}
