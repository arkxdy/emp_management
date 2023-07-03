package com.example.Todo;
import org.springframework.data.repository.CrudRepository;
import com.example.Todo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
