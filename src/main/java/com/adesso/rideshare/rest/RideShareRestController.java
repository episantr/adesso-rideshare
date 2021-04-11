package com.adesso.rideshare.rest;

import com.adesso.rideshare.service.SeyahatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/ride-share")
public class RideShareRestController {

    final SeyahatService seyahatService;

    public RideShareRestController(SeyahatService seyahatService) {
        this.seyahatService = seyahatService;
    }

    @PostMapping(path = "/seyahat-ekle", consumes = "application/json", produces = "application/json")
    public ResponseEntity<SeyahatEkleResponse> seyahatEkle(@RequestBody SeyahatEkleRequest request) {
        return seyahatService.seyahatEkle(request.getSeyahatDto());
    }

    @PostMapping(path = "/yayina-al", consumes = "application/json", produces = "application/json")
    public ResponseEntity<YayinaAlResponse> yayinaAl(@RequestBody YayinaAlRequest request) {
        return seyahatService.yayinaAl(request.getSeyahatDto());
    }

    @PostMapping(path = "/yayindan-kaldir", consumes = "application/json", produces = "application/json")
    public ResponseEntity<YayindanKaldirResponse> yayindanKaldir(@RequestBody YayindanKaldirRequest request) {
        return seyahatService.yayindanKaldir(request.getSeyahatDto());
    }

    @PostMapping(path = "/katil", consumes = "application/json", produces = "application/json")
    public ResponseEntity<KatilResponse> katil(@RequestBody KatilRequest request) {
        return seyahatService.katil(request.getSeyahatDto());
    }

    @PostMapping(path = "/ara", consumes = "application/json", produces = "application/json")
    public ResponseEntity<AraResponse> ara(@RequestBody AraRequest request) {
        return seyahatService.ara(request.getNereden(), request.getNereye());
    }
}
