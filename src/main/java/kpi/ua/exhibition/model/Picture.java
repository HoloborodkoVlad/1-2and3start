package kpi.ua.exhibition.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pictures")
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Picture extends Exhibit {
    private String title;
}
