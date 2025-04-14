/**
 * @author Evandro Santos
 */

package org.example.services;

import org.example.domain.Cliente;
import org.example.exceptions.DAOException;
import org.example.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
