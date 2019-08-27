package co.grandcircus.Capstone6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.Capstone6.task.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByEmail(String email);

}
