package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.OutputProduct;
import ecma.ai.warehouseapp.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "outputProductList", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {

}
