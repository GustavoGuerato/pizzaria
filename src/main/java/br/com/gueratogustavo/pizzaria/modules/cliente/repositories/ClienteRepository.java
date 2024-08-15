
package br.com.gueratogustavo.pizzaria.modules.cliente.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gueratogustavo.pizzaria.modules.cliente.Entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID> {
    Optional<ClienteEntity> findbyCpfOrEmail(String cpf, String email);
}
