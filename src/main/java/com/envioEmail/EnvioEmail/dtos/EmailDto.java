package com.envioEmail.EnvioEmail.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    // Referencia do proprietario que está enviando o email
    @NotBlank
    private String ownerRef;

    // Referencia de quem está enviando o email
    @NotBlank
    @Email
    private String emailFrom;

    // Referencia de quem era receber o email
    @NotBlank
    @Email
    private String emailTo;

    // Titulo do email
    @NotBlank
    private String subject;

    // Corpo do email
    @NotBlank
    private String text;
}
