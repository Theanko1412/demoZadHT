package com.ht.demozad.ShipmentTracking;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ShipmentTrackingJPAImpl implements ShipmentTrackingService{

    @Autowired
    private ShipmentTrackingRepository ShipmentRepository;

    @Override
    public List<ShipmentTracking> listAll() {
        return ShipmentRepository.findAll();
    }

    @Override
    public ShipmentTracking fetch(String id) {
        return findById(id).orElseThrow(
                () -> new IllegalArgumentException()
        );
    }

    @Override
    public Optional<ShipmentTracking> findById(String id) {
        Assert.notNull(id, "ID must be given");
        return ShipmentRepository.findById(id);
    }

    @Override
    public ShipmentTracking createShipment(ShipmentTracking shipmentTracking) {
        Assert.isNull(shipmentTracking.getId(),
                "Shipment ID must be null, not: " + shipmentTracking.getId()
        );
        return ShipmentRepository.save(shipmentTracking);
    }

    @Override
    public ShipmentTracking updateShipment(ShipmentTracking shipmentTracking) {
        return ShipmentRepository.save(shipmentTracking);
    }

    @Override
    public ShipmentTracking deleteShipment(String id) {
        ShipmentTracking shipmentTracking = fetch(id);
        ShipmentRepository.delete(shipmentTracking);
        return shipmentTracking;
    }

    //problem sa koristenjem patch sa varijablom tipa LocalTime
    public ObjectMapper ObjectMapperContextResolver() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return objectMapper;
    }

    @Override
    public ShipmentTracking applyPatchToShipment(JsonMergePatch patch, ShipmentTracking shipmentTracking) throws JsonPatchException, JsonProcessingException {
        ObjectMapper objectMapper = ObjectMapperContextResolver();
        JsonNode patched = patch.apply(objectMapper.convertValue(shipmentTracking, JsonNode.class));
        return objectMapper.treeToValue(patched, ShipmentTracking.class);
    }

    @Override
    public List<ShipmentTracking> listAllWithStatus(String status) {
        return ShipmentRepository.listAllWithStatus(status);
    }

    @Override
    public List<ShipmentTracking> listAllBetweenCreationDates(LocalDate date1, LocalDate date2) {
        return ShipmentRepository.listAllBetweenCreationDates(date1, date2);
    }
}
