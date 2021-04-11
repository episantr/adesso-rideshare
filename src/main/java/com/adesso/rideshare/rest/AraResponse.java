package com.adesso.rideshare.rest;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AraResponse {

    private List<SeyahatDto> seyahatDtoList;

    public AraResponse(List<SeyahatDto> seyahatDtoList) {
        this.seyahatDtoList = seyahatDtoList;
    }
}
