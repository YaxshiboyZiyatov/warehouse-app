package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
}
