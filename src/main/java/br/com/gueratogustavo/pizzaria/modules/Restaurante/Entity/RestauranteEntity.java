package br.com.gueratogustavo.pizzaria.modules.Restaurante.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank()
    private String nome;
    @NotBlank()
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
    

}
