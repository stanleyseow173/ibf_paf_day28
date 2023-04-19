package sg.edu.nus.iss.workshop28.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.workshop28.model.Game;
import sg.edu.nus.iss.workshop28.model.Review;
import sg.edu.nus.iss.workshop28.repository.BoardGameRepository;

@Service
public class BoardGameService {
    
    @Autowired
    private BoardGameRepository repo;

    public Optional<Game> aggregateGameReviews(String gameId){
        return this.repo.aggregateGameReviews(gameId);
    }

    public List<Review> aggregateMinMaxGameReviews(Integer limit, String username, String rating){
        return this.repo.aggregateMinMaxGameReviews(limit, username, rating);
    }
}
