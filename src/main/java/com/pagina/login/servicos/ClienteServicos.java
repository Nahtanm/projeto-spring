package com.pagina.login.servicos;

import com.pagina.login.entidades.Cliente;
import com.pagina.login.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServicos {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional(readOnly = true)
    public Cliente buscarPorId(Long id){
        return clienteRepository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    @Transactional(readOnly = false)
    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }

    @Transactional
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
