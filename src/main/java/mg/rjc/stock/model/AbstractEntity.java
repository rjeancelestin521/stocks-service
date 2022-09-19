package mg.rjc.stock.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "created_at", nullable = false )
    @CreationTimestamp
    @JsonProperty( access = JsonProperty.Access.WRITE_ONLY )
    private Instant createdAt;

    @UpdateTimestamp
    @Column( name = "updated_at" )
    @JsonProperty( access = JsonProperty.Access.WRITE_ONLY )
    private Instant updatedAt;

}
