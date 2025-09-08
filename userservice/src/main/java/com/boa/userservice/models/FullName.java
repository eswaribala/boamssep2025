package com.boa.userservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullName {

    @Column(name="first_name",nullable=false,length=100)
    private String firstName;
    @Column(name="last_name",nullable=false,length=100)
    private String lastName;
    @Column(name="middle_name",nullable=true,length=100)
    private String middleName;
}
