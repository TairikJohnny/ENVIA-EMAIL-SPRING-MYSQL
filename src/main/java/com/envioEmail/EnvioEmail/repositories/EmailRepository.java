package com.envioEmail.EnvioEmail.repositories;

import com.envioEmail.EnvioEmail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
