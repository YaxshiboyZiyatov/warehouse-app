package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getName();

    String getPhoneNumber();
}
