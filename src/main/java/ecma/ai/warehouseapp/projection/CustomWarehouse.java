package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();

    String getName();




}
