package com.adesso.rideshare.rest;

public class SeyahatEkleResponse {

    private SeyahatDto seyahatDto;

    public SeyahatEkleResponse(SeyahatDto seyahatDto) {
        this.seyahatDto = seyahatDto;
    }

    public Long getId() {
        return seyahatDto.getId();
    }
}
