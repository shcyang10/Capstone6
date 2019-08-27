package co.grandcircus.Capstone6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.Capstone6.task.Task;

public interface TasklistRepo extends JpaRepository<Task, Integer> {

}
