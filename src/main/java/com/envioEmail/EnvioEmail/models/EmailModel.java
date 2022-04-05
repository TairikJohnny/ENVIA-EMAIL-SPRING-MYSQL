package com.envioEmail.EnvioEmail.models;

import com.envioEmail.EnvioEmail.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "TB_EMAIL")
public class EmailModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;

    // Referencia do proprietario que está enviando o email
    private String ownerRef;

    // Referencia de quem está enviando o email
    private String emailFrom;

    // Referencia de quem era receber o email
    private String emailTo;

    // Titulo do email
    private String subject;

    // Corpo do email
    // Coluna do tipo TEXT pra poder ter mais caracteres
    @Column(columnDefinition = "TEXT")
    private String text;

    // Data de envio do email
    private LocalDateTime sendDateEmail;

    // Status do email
    private StatusEmail statusEmail;

}
