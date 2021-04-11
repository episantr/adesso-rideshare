package com.adesso.rideshare.rest;

public class YayinaAlResponse {

    private SeyahatDto seyahatDto;

    public YayinaAlResponse(SeyahatDto seyahatDto) {
        this.seyahatDto = seyahatDto;
    }

    public Long getId() {
        return seyahatDto.getId();
    }
}
