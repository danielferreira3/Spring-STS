package integracao.bancodedados.contatos;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

	//busca os contatos pelo primeiro nome
	Contato findFirstByNome(String nome);
	
	//busca todos os contatos ignorando letras maiusculas e minuscula
	List<Contato> findAllByNomeIgnoreCaseContaining(String nome);
	
	//ordena por ordem alfabetica, e depois verificar uma palavra
	 @Query(value = "SELECT * FROM contato ORDER BY nome", nativeQuery = true)
	 List<Contato>  buscaTodosContatos2(String string);


}
