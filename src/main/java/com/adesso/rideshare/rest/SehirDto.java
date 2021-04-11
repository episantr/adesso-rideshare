package com.adesso.rideshare.rest;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SehirDto {

    private Long id;
    private String ad;
    private Set<SehirDto> komsuSet;
}
