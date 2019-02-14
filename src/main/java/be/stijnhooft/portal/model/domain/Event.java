package be.stijnhooft.portal.model.domain;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Event implements Serializable {

    /**
     * The module that has published the event
     **/
    @NonNull
    private String source;

    /**
     * An identifier which is the same for correlating events, forming a flow of events.
     */
    @NonNull
    private String flowId;

    /**
     * Date and that the event has been published
     **/
    @NonNull
    private LocalDateTime publishDate;

    @NonNull
    private Map<String, String> data;

}
