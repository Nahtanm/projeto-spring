package com.pagina.login.controle;

import com.pagina.login.entidades.Cliente;
import com.pagina.login.servicos.ClienteServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {

    @Autowired
    private ClienteServicos clienteServicos;

    @GetMapping(value = "/{id}")
    public Cliente buscarPorId(@PathVariable Long id){
        return clienteServicos.buscarPorId(id);
    }

    @GetMapping
    public List<Cliente> buscarTodos(){
        return clienteServicos.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        clienteServicos.deletar(id);
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return clienteServicos.salvar(cliente);
    }

}
