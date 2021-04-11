package com.adesso.rideshare.rest;

import lombok.Getter;

@Getter
public class YayindanKaldirRequest {

    private SeyahatDto seyahatDto;

    public YayindanKaldirRequest() {
        this.seyahatDto = new SeyahatDto();
    }

    public Long getId() {
        return seyahatDto.getId();
    }

    public void setId(Long id) {
        seyahatDto.setId(id);
    }

}
