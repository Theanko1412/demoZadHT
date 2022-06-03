package com.ht.demozad.ShipmentTracking;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping(value ="/shipmentTracking")
public class ShipmentTrackingController {

    @Autowired
    private ShipmentTrackingRepository repository;

    @Autowired
    private ShipmentTrackingService service;


    @GetMapping("")
    public List<ShipmentTracking> getShipment() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ShipmentTracking getShipment(@PathVariable("id") String id) {
        if(service.findById(id).isEmpty()) {
            throw new IllegalArgumentException("Shipment with id: " + id + " does not exist");
        }
        return service.fetch(id);
    }

    //dohvat prema statusu
    @GetMapping("/status/{status}")
    public List<ShipmentTracking> getShipmentWithStatus(@PathVariable String status) {
        return repository.listAllWithStatus(status);
    }

    //dohvat između dva datuma
    @GetMapping("/date/{stringdate1}/{stringdate2}")
    public List<ShipmentTracking> getShipmentBetweenDates(@PathVariable String stringdate1, @PathVariable String stringdate2) {
        LocalDate date1 = LocalDate.parse(stringdate1);
        LocalDate date2 = LocalDate.parse(stringdate2);
        return repository.listAllBetweenCreationDates(date1, date2);
    }

    @PostMapping("")
    public ResponseEntity<ShipmentTracking> createShipment(@RequestBody ShipmentTracking Shipmenttracking) {
        ShipmentTracking saved = service.createShipment(Shipmenttracking);
        return ResponseEntity.created(URI.create("/" + saved.getId())).body(saved);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ShipmentTracking> updateShipment(@PathVariable("id") String id, @RequestBody JsonMergePatch patch) throws JsonPatchException, JsonProcessingException {
        if(service.findById(id).isEmpty()) {
            throw new IllegalArgumentException("Shipment with id: " + id + " does not exist");
        }
        ShipmentTracking shipmentTracking = service.fetch(id);
        ShipmentTracking shipmentPatched = service.applyPatchToShipment(patch, shipmentTracking);
        service.updateShipment(shipmentPatched);
        return ResponseEntity.ok(shipmentPatched);
    }
}
