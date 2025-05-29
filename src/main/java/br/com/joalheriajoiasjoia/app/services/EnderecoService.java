package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	// Adicionar Endereço
	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	// Buscar Endereço
	public List<Endereco> getAllEndereco() {
		return enderecoRepository.findAll();
	}

	// Buscar Endereço por ID
	public Endereco getEnderecoById(Long id_endereco) {
		return enderecoRepository.findById(id_endereco).orElse(null);
	}

	// Deletar Endereço
	public void deleteEndereco(Long id_endereco) {
		enderecoRepository.deleteById(id_endereco);
	}

}
