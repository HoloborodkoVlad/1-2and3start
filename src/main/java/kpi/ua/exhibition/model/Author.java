package kpi.ua.exhibition.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "authors")
@Component
public class Author extends Person {
    @OneToMany
    private List<Picture> pictures;
    @OneToMany
    private List<Sculpture> sculptures;
}
