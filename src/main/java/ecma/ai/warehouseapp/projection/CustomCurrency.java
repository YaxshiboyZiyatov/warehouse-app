package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
}
