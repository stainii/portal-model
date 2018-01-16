package be.stijnhooft.portal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@AllArgsConstructor
public class Event {

    @NonNull
    private String source;

    @NonNull
    private LocalDateTime publishDate;

    @NonNull
    private Map<String, String> data;

}
