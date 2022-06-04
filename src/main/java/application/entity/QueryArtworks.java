package application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="query_artworks")
@Getter @Setter
public class QueryArtworks implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String method;
    @Column
    private LocalDateTime dateTime;

    public QueryArtworks(String method, LocalDateTime dateTime){
        this.method = method;
        this.dateTime = dateTime;
    }
    public QueryArtworks() {}
}
