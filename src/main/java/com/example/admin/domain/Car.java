package com.example.admin.domain;
import jakarta.persistence.*;
import lombok.*;


@Builder
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "price")
    private int price;
}
