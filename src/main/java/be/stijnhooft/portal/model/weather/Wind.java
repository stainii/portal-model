package be.stijnhooft.portal.model.weather;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Wind implements Serializable {
    private int beaufort;
    private WindDirection direction;
}
