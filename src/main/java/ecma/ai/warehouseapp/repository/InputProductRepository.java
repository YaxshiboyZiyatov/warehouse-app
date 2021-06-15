package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.InputProduct;
import ecma.ai.warehouseapp.projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "inputProductList", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

}
