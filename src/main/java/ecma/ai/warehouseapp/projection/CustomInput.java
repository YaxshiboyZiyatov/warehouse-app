package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Currency;
import ecma.ai.warehouseapp.entity.Input;
import ecma.ai.warehouseapp.entity.Supplier;
import ecma.ai.warehouseapp.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    String getFactureNumber();

    String getCode();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

}
