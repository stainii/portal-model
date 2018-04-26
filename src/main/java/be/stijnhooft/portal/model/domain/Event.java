package be.stijnhooft.portal.model.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class Event {

    @NonNull
    private String source;

    @NonNull
    private LocalDateTime publishDate;

    @NonNull
    private Map<String, String> data;

}
