package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Client;
import ecma.ai.warehouseapp.entity.Currency;
import ecma.ai.warehouseapp.entity.Output;
import ecma.ai.warehouseapp.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

}
