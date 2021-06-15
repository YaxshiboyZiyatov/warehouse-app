package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.User;
import ecma.ai.warehouseapp.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "userList", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
