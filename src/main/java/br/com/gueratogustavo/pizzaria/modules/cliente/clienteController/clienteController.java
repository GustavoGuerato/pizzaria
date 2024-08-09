package br.com.gueratogustavo.pizzaria.modules.cliente.clienteController;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gueratogustavo.pizzaria.modules.cliente.Entity.ClienteEntity;

@RestController
@RequestMapping("/cliente")
public class clienteController {

    public ResponseEntity<Object> create(@Valid @RequestBody ClienteEntity clienteEntity) {
        try {

        } catch (Exception e) {
        }
        return null;
    }

}
