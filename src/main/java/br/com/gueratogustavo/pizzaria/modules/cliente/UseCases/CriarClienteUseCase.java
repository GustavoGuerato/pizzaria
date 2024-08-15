package br.com.gueratogustavo.pizzaria.modules.cliente.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gueratogustavo.pizzaria.modules.cliente.Entity.ClienteEntity;
import br.com.gueratogustavo.pizzaria.modules.cliente.repositories.ClienteRepository;

@Service
public class CriarClienteUseCase {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteRepository execute(ClienteEntity clienteEntity) {
        this.clienteRepository.findbyCpfOrEmail(clienteEntity.getCpf(), clienteEntity.getEmail()).ifPresent((user) -> {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        ;

    }
}
