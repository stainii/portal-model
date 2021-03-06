package be.stijnhooft.portal.model.weather;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class Forecast implements Serializable {

    static final long serialVersionUID = 1L;

    @NonNull private String location;
    @NonNull private LocalDate date;
    @NonNull private String source;
    @NonNull private LocalDateTime createdAt;

    /** temperature in celsius **/
    private Temperature temperature;

    /** cloudiness between 0 and 100 **/
    private Integer cloudiness;

    private Precipitation precipitation;

    private Wind wind;

}
