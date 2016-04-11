package epay.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import epay.domain.User;

@Repository
public interface ItemRepository extends MongoRepository<User, String> {

}
