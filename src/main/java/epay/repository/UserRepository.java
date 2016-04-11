package epay.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import epay.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  User findBySignum(String signum);

}
