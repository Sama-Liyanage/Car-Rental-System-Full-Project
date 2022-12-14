package lk.spring.repo;

import lk.spring.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepo extends JpaRepository<Login,String> {
    @Query(value = "SELECT loginID FROM Login ORDER BY loginID DESC LIMIT 1",nativeQuery = true)
    String getLastID();
}
