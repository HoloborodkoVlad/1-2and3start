package kpi.ua.exhibition.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Data
@NoArgsConstructor
@MappedSuperclass
@Table(name = "exhibits")
@Component
public class Exhibit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Author author;
    private String description;
}
