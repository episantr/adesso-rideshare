package com.adesso.rideshare.rest;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class SeyahatDto {
    private Long id;
    private String tarih;
    private String aciklama;
    private Integer koltukSayisi;
    private Boolean yayinda;
    private SehirDto nereden;
    private SehirDto nereye;

    public SeyahatDto() {
        this.nereden = new SehirDto();
        this.nereye = new SehirDto();
    }
}
