package kpi.ua.exhibition.controller;

import kpi.ua.exhibition.model.Exhibit;
import kpi.ua.exhibition.service.ExhibitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/exhibits")
public class ExhibitController {
    private final ExhibitService exhibitService;

    @Autowired
    public ExhibitController(ExhibitService exhibitService) {
        this.exhibitService = exhibitService;
    }

    @GetMapping
    public List<Exhibit> getAll() {
        return exhibitService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Exhibit exhibit) {
        exhibitService.save(exhibit);
    }

    @GetMapping("/id")
    public Exhibit getById(@RequestParam(name = "id") Long id) {
        return exhibitService.getById(id);
    }
}
