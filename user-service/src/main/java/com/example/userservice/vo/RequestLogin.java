package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {

    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than 2")
    @Email
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min = 4, message = "Password must be greater than 4")
    private String password;


}
