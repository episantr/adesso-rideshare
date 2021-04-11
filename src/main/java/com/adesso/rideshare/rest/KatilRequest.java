package com.adesso.rideshare.rest;

import lombok.Getter;

@Getter
public class KatilRequest {

    private SeyahatDto seyahatDto;

    public KatilRequest() {
        this.seyahatDto = new SeyahatDto();
    }

    public Long getId() {
        return seyahatDto.getId();
    }

    public void setId(Long id) {
        seyahatDto.setId(id);
    }

}
