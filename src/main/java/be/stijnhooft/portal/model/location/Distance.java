package be.stijnhooft.portal.model.location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Distance implements Serializable {
    private String location1Query;
    private String location2Query;
    private double km;
}
