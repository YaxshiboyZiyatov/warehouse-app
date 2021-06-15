package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getName();
}
