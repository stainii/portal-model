package be.stijnhooft.portal.model.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ForecastRequests {

    private Collection<ForecastRequest> forecastRequests;

}
