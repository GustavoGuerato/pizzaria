package br.com.gueratogustavo.pizzaria.modules.cliente.interfaces.validarCep;

public @interface validCEP {
    String message() default "CEP inválido";

    Class<?>[] groups() default {};

    Class<? extends javax.validation.Payload>[] payload() default {};
}