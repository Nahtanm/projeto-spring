package com.pagina.login.controle;

import com.pagina.login.entidades.Cliente;
import com.pagina.login.servicos.ClienteServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/clientes")
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
}
