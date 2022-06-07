package guru.springframework.norris.chuck.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service("jokeServiceImpl")
public class JokeServiceImpl implements JokeService{
    //Make sure to do stuff through constructors not in the variables!
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {this.chuckNorrisQuotes = new ChuckNorrisQuotes();}

    @Override
    public String sayJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
