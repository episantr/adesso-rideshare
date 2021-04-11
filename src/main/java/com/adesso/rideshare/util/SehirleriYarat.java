package com.adesso.rideshare.util;

import com.adesso.rideshare.model.Sehir;
import com.adesso.rideshare.repo.SehirRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;

@Component
public class SehirleriYarat {
    final SehirRepository sehirRepository;

    public SehirleriYarat(SehirRepository sehirRepository) {
        this.sehirRepository = sehirRepository;
    }

    public void sehirleriYarat() {
        for (int i = 1; i <= 200; i++) {
            sehirRepository.save(Sehir.builder().ad("Sehir-" + i).komsuSet(new HashSet<>()).build());
        }
        komsulariAyarla();
    }

    public void komsulariAyarla() {
        List<Sehir> sehirList = sehirRepository.findAll();

        for (Sehir sehir:sehirList) {
            Long id = sehir.getId();
            if (id % 20 == 1) {
                if (id / 20 == 0) {
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 21).orElseThrow());
                } else if (id / 20 == 9 ) {
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 21).orElseThrow());
                } else {
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 20).orElseThrow());
                }
            } else if (id % 20 == 0) {
                if (id / 20 == 1) {
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 20).orElseThrow());
                } else if (id / 20 == 10 ) {
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 20).orElseThrow());
                } else {
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 21).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 20).orElseThrow());
                }
            } else {
                if (id / 20 == 0) {
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 21).orElseThrow());
                } else if (id / 20 == 9 ) {
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 21).orElseThrow());
                } else {
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 1).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id - 21).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 19).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 20).orElseThrow());
                    sehir.getKomsuSet().add(sehirRepository.findById(id + 21).orElseThrow());
                }
            }
            sehirRepository.save(sehir);
        }

    }
}
