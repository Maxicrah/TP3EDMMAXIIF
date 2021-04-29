package ar.edu.unju.edm.service;

import java.util.List;

//import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Cliente;
//@Service 
public interface IClienteService {
	public Cliente crearCliente();
	public void guardarCliente(Cliente unCliente);
	public List<Cliente> obtenerTodosClientes();

}