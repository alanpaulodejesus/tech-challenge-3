package br.com.fiap.techChallenge3.infraestructure.config.web;

import br.com.fiap.techChallenge3.entity.restaurant.gateway.RestaurantGateway;
import br.com.fiap.techChallenge3.entity.review.gateway.ReviewGateway;
import br.com.fiap.techChallenge3.infraestructure.config.db.repository.RestaurantRepository;
import br.com.fiap.techChallenge3.infraestructure.config.db.repository.ReviewRepository;
import br.com.fiap.techChallenge3.infraestructure.restaurant.gateway.RestaurantDatabaseGateway;
import br.com.fiap.techChallenge3.infraestructure.review.gateway.ReviewDatabaseGateway;
import br.com.fiap.techChallenge3.usecase.restaurant.CreateRestaurantUseCase;
import br.com.fiap.techChallenge3.usecase.restaurant.DeleteRestaurantUseCase;
import br.com.fiap.techChallenge3.usecase.restaurant.GetRestaurantUseCase;
import br.com.fiap.techChallenge3.usecase.restaurant.SearchRestaurantUseCase;
import br.com.fiap.techChallenge3.usecase.restaurant.UpdateRestaurantUseCase;
import br.com.fiap.techChallenge3.usecase.review.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MvcConfig {

    @Bean
    public CreateRestaurantUseCase createRestaurantUseCase(RestaurantRepository restaurantRepository){
        RestaurantGateway restaurantGateway = new RestaurantDatabaseGateway(restaurantRepository);
        return new CreateRestaurantUseCase(restaurantGateway);
    }

    @Bean
    public DeleteRestaurantUseCase deleteRestaurantUseCase(RestaurantRepository restaurantRepository){
        RestaurantGateway restaurantGateway = new RestaurantDatabaseGateway(restaurantRepository);
        return new DeleteRestaurantUseCase(restaurantGateway);
    }

    @Bean
    public GetRestaurantUseCase getRestaurantUseCase(RestaurantRepository restaurantRepository){
        RestaurantGateway restaurantGateway = new RestaurantDatabaseGateway(restaurantRepository);
        return new GetRestaurantUseCase(restaurantGateway);
    }

    @Bean
    public SearchRestaurantUseCase searchRestaurantUseCase(RestaurantRepository restaurantRepository){
        RestaurantGateway restaurantGateway = new RestaurantDatabaseGateway(restaurantRepository);
        return new SearchRestaurantUseCase(restaurantGateway);
    }

    @Bean
    public UpdateRestaurantUseCase updateRestaurantUseCase(RestaurantRepository restaurantRepository){
        RestaurantGateway restaurantGateway = new RestaurantDatabaseGateway(restaurantRepository);
        return new UpdateRestaurantUseCase(restaurantGateway);
    }

    @Bean
    public CreateReviewUseCase createReviewUseCase(ReviewRepository reviewRepository){
        ReviewGateway revewGateway = new ReviewDatabaseGateway(reviewRepository);
        return new CreateReviewUseCase(revewGateway);
    }

    @Bean
    public DeleteReviewUseCase deleteRevewUseCase(ReviewRepository reviewRepository){
        ReviewGateway reviewGateway = new ReviewDatabaseGateway(reviewRepository);
        return new DeleteReviewUseCase(reviewGateway);
    }

    @Bean
    public GetReviewUseCase getReviewUseCase(ReviewRepository reviewRepository){
        ReviewGateway reviewGateway = new ReviewDatabaseGateway(reviewRepository);
        return new GetReviewUseCase(reviewGateway);
    }

    @Bean
    public SearchReviewUseCase searchReviewtUseCase(ReviewRepository reviewRepository){
        ReviewGateway reviewGateway = new ReviewDatabaseGateway(reviewRepository);
        return new SearchReviewUseCase(reviewGateway);
    }

    @Bean
    public UpdateReviewUseCase updateReviewUseCase(ReviewRepository reviewRepository){
        ReviewGateway reviewGateway = new ReviewDatabaseGateway(reviewRepository);
        return new UpdateReviewUseCase(reviewGateway);
    }
}
