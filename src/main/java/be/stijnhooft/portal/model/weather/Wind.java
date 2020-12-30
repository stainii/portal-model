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
public class Wind implements Serializable {

    static final long serialVersionUID = 1L;

    private int beaufort;
    private WindDirection direction;
}
