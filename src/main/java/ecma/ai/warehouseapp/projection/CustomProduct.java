package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Attachment;
import ecma.ai.warehouseapp.entity.Category;
import ecma.ai.warehouseapp.entity.Measurement;
import ecma.ai.warehouseapp.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    Category getCategory();

    Attachment getAttachment();

    Measurement getMeasurement();

}
