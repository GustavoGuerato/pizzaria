package br.com.gueratogustavo.pizzaria.modules.cliente.clienteController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gueratogustavo.pizzaria.modules.cliente.Entity.ClienteEntity;
import br.com.gueratogustavo.pizzaria.modules.cliente.UseCases.CriarClienteUseCase;

@RestController
@RequestMapping("/cliente")
public class clienteController {

    @Autowired
    private CriarClienteUseCase criarClienteUseCase;

    public ResponseEntity<Object> create(@Valid @RequestBody ClienteEntity clienteEntity) {
        try {
            var resultado = this.criarClienteUseCase.execute(clienteEntity);
            return ResponseEntity.ok().body(resultado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
