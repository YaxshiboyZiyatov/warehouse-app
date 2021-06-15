package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();


}
