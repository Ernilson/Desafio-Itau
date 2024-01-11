package br.com.testeItau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.testeItau.dtos.ClientesDTO;
import br.com.testeItau.entity.Clientes;
import br.com.testeItau.service.ClienteService;


@RestController
@RequestMapping("/client")
public class ClientesController {
	
	@Autowired
	private ClienteService service;
	
	@PostMapping("/save")
	public ResponseEntity<Clientes> saveClientes(@RequestBody ClientesDTO dto){
		
		Clientes client = service.saveClient(dto);
		
		return ResponseEntity.ok().body(client);
	}
	
	@GetMapping("/allList")
	public ResponseEntity<List<Clientes>> listAllClients(){
		List<Clientes> clientsList = service.listAllClientes();
		return ResponseEntity.ok().body(clientsList);
	}

}
