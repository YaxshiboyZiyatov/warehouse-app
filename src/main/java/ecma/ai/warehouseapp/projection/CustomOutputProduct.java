package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Output;
import ecma.ai.warehouseapp.entity.OutputProduct;
import ecma.ai.warehouseapp.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Output getOutput();
}
