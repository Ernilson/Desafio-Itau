package br.com.testeItau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testeItau.dtos.ClientesDTO;
import br.com.testeItau.entity.Clientes;
import br.com.testeItau.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository service;
	
		
	public Clientes saveClient(ClientesDTO dto) {
		
		Clientes client = new Clientes();
		client.setFistName(dto.firstName());
		client.setLastName(dto.lastName());
		client.setParticipation(dto.participation());
		if(client == null|| 
				 client.getFistName()== null||
				 client.getLastName()== null||
				 client.getParticipation()== null) {
			throw new NullPointerException();
		}
				
		return service.save(client);
	}
	
	public List<Clientes> listAllClientes(){
		List<Clientes> allClentes = service.findAll();
		if (allClentes == null) {
			throw new NullPointerException();
		}
		return allClentes;
	}

}
