package br.com.gueratogustavo.pizzaria.modules.cliente.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gueratogustavo.pizzaria.modules.cliente.Entity.ClienteEntity;
import br.com.gueratogustavo.pizzaria.modules.cliente.repositories.ClienteRepository;

@Service
public class CriarClienteUseCase {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteEntity execute(ClienteEntity clienteEntity) throws Exception {
        if (this.clienteRepository.findbyCpfOrEmail(clienteEntity.getCpf(), clienteEntity.getEmail()).isPresent()) {
            throw new Exception("Cliente com CPF ou e-mail já existe.");
        }
        
        return clienteRepository.save(clienteEntity);
    }
}
