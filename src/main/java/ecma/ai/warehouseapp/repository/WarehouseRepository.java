package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.Warehouse;
import ecma.ai.warehouseapp.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "tuplamlar", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
