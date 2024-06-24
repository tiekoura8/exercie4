package ci.tiekoura.csv_backend.repository;

import ci.tiekoura.csv_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
