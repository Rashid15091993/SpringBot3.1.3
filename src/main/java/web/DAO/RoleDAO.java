package web.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
}