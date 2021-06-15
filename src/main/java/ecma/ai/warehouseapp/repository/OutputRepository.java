package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.Output;
import ecma.ai.warehouseapp.projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "outputList", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {

}
