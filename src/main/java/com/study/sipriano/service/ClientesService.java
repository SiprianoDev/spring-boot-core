package com.study.sipriano.service;

import com.study.sipriano.model.Cliente;
import com.study.sipriano.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//Container IOC
public class ClientesService {


    @Autowired//é pesada a instanciação, bd etc, uma só instancia no container depois injeta onde quer
    private ClientesRepository repository;

    //Injeção via construtor, mais claro, como se quando instancia uma classe, instancia
    //também sua dependência, pode omitir o Autowired
    //@Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }
    //@Autowired//Injeção via set
    public void setRepository(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    private void validarCliente(Cliente cliente) {
        //Validações
    }

}
