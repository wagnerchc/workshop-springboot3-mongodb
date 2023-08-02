package com.wpch.workshopmongo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wpch.workshopmongo.domain.Post;
import com.wpch.workshopmongo.domain.User;
import com.wpch.workshopmongo.dto.AuthorDTO;
import com.wpch.workshopmongo.repository.PostRepository;
import com.wpch.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		postRepository.deleteAll();
		
		Post post1 = new Post(null, Instant.parse("2023-08-02T18:00:00Z"), "Mussum Ipsum", "Mussum Ipsum, cacilds vidis litro abertis.  Todo mundo vê os porris que eu tomo, mas ninguém vê os tombis que eu levo! Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Suco de cevadiss deixa as pessoas mais interessantis. A ordem dos tratores não altera o pão duris.", new AuthorDTO(maria));
		Post post2 = new Post(null, Instant.parse("2023-08-03T18:00:00Z"), "Cacilds vidis litro abertis", "Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis. Cevadis im ampola pa arma uma pindureta. In elementis mé pra quem é amistosis quis leo. Detraxit consequat et quo num tendi nada.", new AuthorDTO(maria));
		Post post3 = new Post(null, Instant.parse("2023-08-04T18:00:00Z"), "Mussum Ipsum, cacilds vidis litro abertis", "Cevadis im ampola pa arma uma pindureta. Nullam volutpat risus nec leo commodo, ut interdum diam laoreet. Sed non consequat odio. Si num tem leite então bota uma pinga aí cumpadi! Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus.", new AuthorDTO(alex));
		
		postRepository.saveAll(Arrays.asList(post1, post2, post3));
		
	}

}