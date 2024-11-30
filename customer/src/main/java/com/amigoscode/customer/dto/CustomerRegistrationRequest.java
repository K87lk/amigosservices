package com.amigoscode.customer.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
}
