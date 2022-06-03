package com.ht.demozad.ShipmentTracking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
interface ShipmentTrackingRepository extends JpaRepository<ShipmentTracking, String> {

    @Query(value = "SELECT * from shipment_tracking s where s.status = :status", nativeQuery = true)
    List<ShipmentTracking> listAllWithStatus(String status);

    //lower bound not inclusive
    @Query(value = "SELECT * from shipment_tracking s where s.create_date >= :date1 and s.create_date <= :date2", nativeQuery = true)
    List<ShipmentTracking> listAllBetweenCreationDates(LocalDate date1, LocalDate date2);

}
