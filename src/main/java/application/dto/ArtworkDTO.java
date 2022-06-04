package application.dto;

import application.dto.attribute.Pagination;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtworkDTO<Data> implements Serializable {
    private Pagination pagination;
    private Data data;
}

