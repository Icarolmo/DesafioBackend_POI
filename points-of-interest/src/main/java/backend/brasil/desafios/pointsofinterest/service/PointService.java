package backend.brasil.desafios.pointsofinterest.service;

import backend.brasil.desafios.pointsofinterest.dto.PointDTO;
import backend.brasil.desafios.pointsofinterest.model.Point;
import backend.brasil.desafios.pointsofinterest.model.RequestCreatePoint;
import backend.brasil.desafios.pointsofinterest.model.RequestPoint;
import backend.brasil.desafios.pointsofinterest.model.ResponsePoint;
import backend.brasil.desafios.pointsofinterest.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

@Service
public class PointService {

    @Autowired
    PointRepository repository;

    public boolean distanceCalculus(long max_distance, long client_x, long client_y, long repository_x, long repository_y){
        return sqrt( pow((client_x - repository_x), 2) + pow(( client_y - repository_y), 2)) <= 10;
    }

    public ResponsePoint getNearbyPoints(RequestPoint data){
        var allPoints = repository.findAll();

        ResponsePoint newResponse = new ResponsePoint();

        allPoints.forEach(Point -> {
            if(distanceCalculus(data.max_distance(), data.coordinate_x(), data.coordinate_y(), Point.getCoordinate_x(), Point.getCoordinate_y())) {
                newResponse.setPoint(Point);
            }
        });
        return newResponse;
    }

    public PointDTO createPoint(RequestCreatePoint data){
        Point newPoint = new Point(data);
        return new PointDTO(repository.save(newPoint));
    }


    

 }
