package application.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtworkDTO<Data> implements Serializable {
    private Data data;
}
