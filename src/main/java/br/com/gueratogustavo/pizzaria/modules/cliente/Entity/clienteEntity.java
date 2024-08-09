package br.com.gueratogustavo.pizzaria.modules.cliente.Entity;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import br.com.gueratogustavo.pizzaria.modules.cliente.interfaces.validarCep.validCEP;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class clienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank()
    private String nome;

    @CPF
    @NotBlank()
    private String cpf;

    @Length(min = 10, max = 100, message = "o campo senha deve ter no minimo 10 caracteres")
    @NotBlank()
    private String senha;

    @Email
    @NotBlank()
    private String email;
    @NotBlank()
    private String rua;
    @NotBlank()
    private String bairro;
    @NotBlank()
    private String cidade;
    @NotBlank()
    private String estado;

    @validCEP
    @NotBlank()
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP deve estar no formato 99999-999")
    private String cep;
}
