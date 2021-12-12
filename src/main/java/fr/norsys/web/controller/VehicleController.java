package fr.norsys.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @GetMapping()
    public List<VehicleDTO> findVehicles() {
        return List.of(new VehicleDTO(10L, "EE584", "AUDI"));
    }

}
