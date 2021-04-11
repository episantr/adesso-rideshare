package com.adesso.rideshare.rest;

import lombok.Getter;

@Getter
public class SeyahatEkleRequest {

    private SeyahatDto seyahatDto;

    public SeyahatEkleRequest() {
        this.seyahatDto = new SeyahatDto();
    }

    public String getTarih() {
        return seyahatDto.getTarih();
    }

    public void setTarih(String tarih) {
        seyahatDto.setTarih(tarih);
    }

    public String getAciklama() {
        return seyahatDto.getAciklama();
    }

    public void setAciklama(String aciklama) {
        seyahatDto.setAciklama(aciklama);
    }

    public Integer getKoltukSayisi() {
        return seyahatDto.getKoltukSayisi();
    }

    public void setKoltukSayisi(Integer koltukSayisi) {
        seyahatDto.setKoltukSayisi(koltukSayisi);
    }

    public Long getNereden() {
        return seyahatDto.getNereden().getId();
    }

    public void setNereden(Long id) {
        seyahatDto.getNereden().setId(id);
    }

    public Long getNereyeId() {
        return seyahatDto.getNereye().getId();
    }

    public void setNereye(Long id) {
        seyahatDto.getNereye().setId(id);
    }
}
