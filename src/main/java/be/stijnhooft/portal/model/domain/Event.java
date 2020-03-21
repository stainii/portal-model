package be.stijnhooft.portal.model.domain;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Builder
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
     * What does this event do with the flow? Does it start the flow, update the flow, end the flow?
     * TODO: when doing a major breaking change, make this field @NonNull please!
     */
    private FlowAction flowAction;

    /**
     * Date and that the event has been published
     **/
    @NonNull
    private LocalDateTime publishDate;

    @NonNull
    private Map<String, String> data;

}
