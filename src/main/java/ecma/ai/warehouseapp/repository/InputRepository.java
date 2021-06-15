package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.Input;
import ecma.ai.warehouseapp.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "inputList", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {

}
