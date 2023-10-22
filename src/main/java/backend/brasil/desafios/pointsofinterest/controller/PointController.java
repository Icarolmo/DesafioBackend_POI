package backend.brasil.desafios.pointsofinterest.controller;

import backend.brasil.desafios.pointsofinterest.model.RequestCreatePoint;
import backend.brasil.desafios.pointsofinterest.model.RequestPoint;
import backend.brasil.desafios.pointsofinterest.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointController {

    @Autowired
    PointService service;

    @PostMapping("/nearby-points")
    public ResponseEntity nearbyPoints(@Validated @RequestBody RequestPoint data){
        try{
            return ResponseEntity.ok().body(service.getNearbyPoints(data));
        } catch (Exception e){
            return ResponseEntity.internalServerError().body(e);
        }
    }

    @PostMapping("/points/create")
    public ResponseEntity createPoint(@Validated @RequestBody RequestCreatePoint data){
        try{
            return ResponseEntity.ok().body(service.createPoint(data));
        } catch (Exception e){
            return ResponseEntity.internalServerError().body(e);
        }
    }


}
