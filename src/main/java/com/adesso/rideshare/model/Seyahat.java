package com.adesso.rideshare.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seyahat")
public class Seyahat {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate tarih;
    private String aciklama;
    private Integer koltukSayisi;
    private Boolean yayinda;
    @ManyToOne
    private Sehir nereden;
    @ManyToOne
    private Sehir nereye;

    public Set<Sehir> guzergah() {
        return new HashSet<>();
    }

    @Override
    public String toString() {
        return "Seyahat{" +
                "tarih=" + tarih +
                ", nereden=" + nereden +
                ", nereye=" + nereye +
                '}';
    }
}
