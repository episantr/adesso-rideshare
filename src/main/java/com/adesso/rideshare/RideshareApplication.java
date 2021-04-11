package com.adesso.rideshare;

import com.adesso.rideshare.util.SehirleriYarat;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RideshareApplication implements CommandLineRunner {

    final SehirleriYarat sehirleriYarat;

    public RideshareApplication(SehirleriYarat sehirleriYarat) {
        this.sehirleriYarat = sehirleriYarat;
    }

    public static void main(String[] args) {
        SpringApplication.run(RideshareApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sehirleriYarat.sehirleriYarat();
    }
}
