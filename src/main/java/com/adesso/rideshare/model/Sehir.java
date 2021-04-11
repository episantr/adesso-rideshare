package com.adesso.rideshare.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sehir")
public class Sehir {

    @Id
    @GeneratedValue
    Long id;
    String ad;
    @ManyToMany(fetch = FetchType.EAGER)
    Set<Sehir> komsuSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sehir sehir = (Sehir) o;

        if (!Objects.equals(id, sehir.id)) return false;
        return Objects.equals(ad, sehir.ad);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ad != null ? ad.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sehir{" +
                "ad='" + ad + '\'' +
                '}';
    }
}
