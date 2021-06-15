package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.Product;
import ecma.ai.warehouseapp.entity.Warehouse;
import ecma.ai.warehouseapp.projection.CustomProduct;
import ecma.ai.warehouseapp.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "productList", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
