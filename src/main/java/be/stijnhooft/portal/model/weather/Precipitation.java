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
public class Precipitation implements Serializable {

    static final long serialVersionUID = 1L;

    /** intensity of the rain/snow/... between 0 (no rain at all) and 100 (the world is going to end) **/
    private int intensity;

    /** probability of the rain/snow/... between 0 and 100 **/
    private double probability;

    private PrecipitationType type;

}
