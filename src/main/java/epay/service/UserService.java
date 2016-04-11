package epay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epay.domain.User;
import epay.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepo;

  public List<User> getUser() {
    User newUser = new User("1");
    newUser.setSignum("test");
    return userRepo.findAll();

  }

}
