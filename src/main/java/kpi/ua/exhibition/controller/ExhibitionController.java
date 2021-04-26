package kpi.ua.exhibition.controller;

import kpi.ua.exhibition.model.Exhibit;
import kpi.ua.exhibition.model.Exhibition;
import kpi.ua.exhibition.model.Picture;
import kpi.ua.exhibition.service.ExhibitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/exhibitions")
public class ExhibitionController {
    private final ExhibitionService exhibitionService;

    @Autowired
    public ExhibitionController(ExhibitionService exhibitionService) {
        this.exhibitionService = exhibitionService;
    }

    @GetMapping
    public List<Exhibition> getAll() {
        return exhibitionService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Exhibition exhibition) {
        exhibitionService.save(exhibition);
    }

    @GetMapping("/id")
    public Exhibition getById(@RequestParam(name = "id") Long id) {
        return exhibitionService.getById(id);
    }

    @PostMapping("/id")
    public Exhibition addPicture(@RequestParam(name = "id") Long id, @RequestBody Picture picture) {
        return exhibitionService.addPicture(id, picture);
    }

}
