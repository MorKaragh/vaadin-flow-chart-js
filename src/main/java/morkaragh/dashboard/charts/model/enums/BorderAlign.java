package morkaragh.dashboard.charts.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BorderAlign {
    center, inner;

    @JsonValue
    public String forJson(){
        return this.name();
    }

}
