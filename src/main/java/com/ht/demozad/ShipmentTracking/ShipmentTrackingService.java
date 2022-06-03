package com.ht.demozad.ShipmentTracking;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ShipmentTrackingService {

    List<ShipmentTracking> listAll();

    ShipmentTracking fetch(String id);

    Optional<ShipmentTracking> findById(String id);

    ShipmentTracking createShipment(ShipmentTracking shipmentTracking);

    ShipmentTracking updateShipment(ShipmentTracking shipmentTracking);

    ShipmentTracking deleteShipment(String id);

    ShipmentTracking applyPatchToShipment(JsonMergePatch patch, ShipmentTracking shipmentTracking) throws JsonPatchException, JsonProcessingException;

    List<ShipmentTracking> listAllWithStatus(@Param("status") String status);

    List<ShipmentTracking> listAllBetweenCreationDates(LocalDate date1, LocalDate date2);
}
