package erod.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
public class JokeServiceImpl implements JokeService{

	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	public JokeServiceImpl() {
		super();
		this.chuckNorrisQuotes =new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
