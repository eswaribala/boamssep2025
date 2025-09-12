package com.boa.tradingservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullNameDTO {

    private String firstName;
    private String lastName;
    private String middleName;
}
