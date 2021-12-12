package fr.norsys.web.controller;

public class VehicleDTO {
    public Long id;
    public String registrationNumber;
    public String brandName;

    public VehicleDTO(long id, String registrationNumber, String brandName) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.brandName = brandName;
    }
}
