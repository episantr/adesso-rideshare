package com.adesso.rideshare.service;

import com.adesso.rideshare.model.Seyahat;
import com.adesso.rideshare.repo.SehirRepository;
import com.adesso.rideshare.repo.SeyahatRepository;
import com.adesso.rideshare.rest.*;
import com.adesso.rideshare.util.RideShareUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeyahatServiceImpl implements SeyahatService{

    private final SeyahatRepository seyahatRepository;
    private final SehirRepository sehirRepository;

    public SeyahatServiceImpl(SeyahatRepository seyahatRepository, SehirRepository sehirRepository) {
        this.seyahatRepository = seyahatRepository;
        this.sehirRepository = sehirRepository;
    }

    @Override
    public ResponseEntity<SeyahatEkleResponse> seyahatEkle(SeyahatDto seyahatDto) {
        Seyahat seyahat = Seyahat.builder()
                .tarih(RideShareUtils.covertStringToDate(seyahatDto.getTarih()))
                .koltukSayisi(seyahatDto.getKoltukSayisi())
                .yayinda(Boolean.FALSE)
                .nereden(sehirRepository.findById(seyahatDto.getNereden().getId()).orElseThrow())
                .nereye(sehirRepository.findById(seyahatDto.getNereye().getId()).orElseThrow())
                .aciklama(seyahatDto.getAciklama()).build();

        seyahat = seyahatRepository
                .save(seyahat);

        SeyahatDto output = SeyahatDto.builder()
                .id(seyahat.getId())
                .build();

        return ResponseEntity.ok(new SeyahatEkleResponse(output));
    }

    @Override
    public ResponseEntity<YayinaAlResponse> yayinaAl(SeyahatDto seyahatDto) {
        Seyahat seyahat = seyahatRepository.findById(seyahatDto.getId())
                .orElseThrow();
        seyahat.setYayinda(Boolean.TRUE);
        seyahat = seyahatRepository.save(seyahat);
        SeyahatDto output = SeyahatDto.builder().id(seyahat.getId()).build();
        return ResponseEntity.ok(new YayinaAlResponse(output));
    }

    @Override
    public ResponseEntity<YayindanKaldirResponse> yayindanKaldir(SeyahatDto seyahatDto) {
        Seyahat seyahat = seyahatRepository.findById(seyahatDto.getId())
                .orElseThrow();
        seyahat.setYayinda(Boolean.FALSE);
        seyahat = seyahatRepository.save(seyahat);
        SeyahatDto output = SeyahatDto.builder().id(seyahat.getId()).build();
        return ResponseEntity.ok(new YayindanKaldirResponse(output));
    }

    @Override
    public ResponseEntity<AraResponse> ara(Long nereden, Long nereye) {
        List<Seyahat> seyahatList = seyahatRepository.findAllByNeredenIdAndNereyeId(nereden, nereye);
        List<SeyahatDto> seyahatDtoList = new ArrayList<>();
        for (Seyahat seyahat:seyahatList) {
            seyahatDtoList.add(SeyahatDto.builder()
                    .id(seyahat.getId())
                    .aciklama(seyahat.getAciklama())
                    .koltukSayisi(seyahat.getKoltukSayisi())
                    .nereden(SehirDto.builder().id(seyahat.getNereden().getId()).ad(seyahat.getNereden().getAd()).build())
                    .nereye(SehirDto.builder().id(seyahat.getNereye().getId()).ad(seyahat.getNereye().getAd()).build())
                    .tarih(RideShareUtils.covertDateToString(seyahat.getTarih()))
                    .yayinda(seyahat.getYayinda())
                    .build());
        }
        return ResponseEntity.ok(new AraResponse(seyahatDtoList));
    }

    @Override
    public ResponseEntity<KatilResponse> katil(SeyahatDto seyahatDto) {
        Seyahat seyahat = seyahatRepository.findById(seyahatDto.getId())
                .orElseThrow();
        Integer koltukSayisi = seyahat.getKoltukSayisi();

        if (koltukSayisi > 0) {
            seyahat.setKoltukSayisi(koltukSayisi - 1);
        } else {
            return ResponseEntity.badRequest().body(null);
        }

        seyahat = seyahatRepository.save(seyahat);
        SeyahatDto output = SeyahatDto.builder().id(seyahat.getId()).build();
        return ResponseEntity.ok(new KatilResponse(output));
    }
}
