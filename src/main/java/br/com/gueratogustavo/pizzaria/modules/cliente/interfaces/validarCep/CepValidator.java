package br.com.gueratogustavo.pizzaria.modules.cliente.interfaces.validarCep;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.client.RestTemplate;

public class CepValidator implements ConstraintValidator<validCEP, String> {

    @Override
    public boolean isValid(String cep, ConstraintValidatorContext context) {
        if (cep == null || cep.isBlank()) {
            return false;
        }

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            String response = restTemplate.getForObject(url, String.class);
            return response != null && !response.contains("\"erro\": true");
        } catch (Exception e) {
            return false;
        }
    }

}
