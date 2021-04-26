package kpi.ua.exhibition.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "scultures")
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Sculpture extends Exhibit {
    @ManyToOne
    private Material material;
    private String title;
}
