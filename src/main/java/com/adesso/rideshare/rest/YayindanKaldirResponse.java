package com.adesso.rideshare.rest;

public class YayindanKaldirResponse {

    private SeyahatDto seyahatDto;

    public YayindanKaldirResponse(SeyahatDto seyahatDto) {
        this.seyahatDto = seyahatDto;
    }

    public Long getId() {
        return seyahatDto.getId();
    }
}
