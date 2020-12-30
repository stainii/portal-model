package be.stijnhooft.portal.model.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Temperature implements Serializable {

    static final long serialVersionUID = 1L;

    private double minTemperature;
    private double maxTemperature;
    private Double feelsLike;

}
