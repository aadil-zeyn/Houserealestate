package io.bootify.my_app.domain;


import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Houses {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String status;

    @Column(nullable = false)
    private Integer bed;

    @Column(nullable = false)
    private Integer bath;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal acreLot;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(nullable = false, length = 50)
    private String state;

    @Column(nullable = false, length = 10)
    private String zipCode;

    @Column(nullable = false)
    private Integer houseSize;

    @Column
    private LocalDate prevSoldDate;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal price;

}
