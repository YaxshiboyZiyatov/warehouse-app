package ecma.ai.warehouseapp.repository;

import ecma.ai.warehouseapp.entity.Measurement;
import ecma.ai.warehouseapp.entity.Warehouse;
import ecma.ai.warehouseapp.projection.CustomMeasurement;
import ecma.ai.warehouseapp.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "measurementList", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
