package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.User;
import ecma.ai.warehouseapp.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;


@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    Set<Warehouse> getWarehouses();


}
