package io.github.devmarodrigues.email.services;

import io.github.devmarodrigues.email.models.EmailModel;
import io.github.devmarodrigues.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public void sendingEmail(EmailModel emailModel) {

    }
}
