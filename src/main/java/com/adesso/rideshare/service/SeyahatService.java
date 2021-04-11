package com.adesso.rideshare.service;

import com.adesso.rideshare.rest.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface SeyahatService {

    ResponseEntity<SeyahatEkleResponse> seyahatEkle(SeyahatDto seyahatDto);

    ResponseEntity<YayinaAlResponse> yayinaAl(SeyahatDto seyahatDto);

    ResponseEntity<YayindanKaldirResponse> yayindanKaldir(SeyahatDto seyahatDto);

    ResponseEntity<AraResponse> ara(Long nereden, Long nereye);

    ResponseEntity<KatilResponse> katil(SeyahatDto seyahatDto);

}
