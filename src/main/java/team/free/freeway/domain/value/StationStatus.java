package team.free.freeway.domain.value;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StationStatus {

    AVAILABLE("모두 사용 가능"),
    SOME_AVAILABLE("일부 사용 가능"),
    UNAVAILABLE("모두 사용 불가능"),
    UNKNOWN("확인 불가");

    @JsonValue
    private final String statusName;
}
