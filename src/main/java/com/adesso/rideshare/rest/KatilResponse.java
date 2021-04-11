package com.adesso.rideshare.rest;

public class KatilResponse {

    private SeyahatDto seyahatDto;

    public KatilResponse(SeyahatDto seyahatDto) {
        this.seyahatDto = seyahatDto;
    }

    public Long getId() {
        return seyahatDto.getId();
    }
}
