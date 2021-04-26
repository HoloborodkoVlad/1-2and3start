package kpi.ua.exhibition.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@Table(name = "visitors")
@Component
public class Visitor extends Person {
    @ManyToMany
    private List<Exhibition> visitedExhibitions;
    @OneToMany
    private List<Ticket> tickets;
}
