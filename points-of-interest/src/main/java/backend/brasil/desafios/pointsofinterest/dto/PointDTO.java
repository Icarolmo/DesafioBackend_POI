package backend.brasil.desafios.pointsofinterest.dto;

import backend.brasil.desafios.pointsofinterest.model.Point;
import backend.brasil.desafios.pointsofinterest.model.RequestCreatePoint;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PointDTO {

    long id;

    String namePOI;

    long coordinate_x;

    long coordinate_y;

    public PointDTO(Point data){
        this.id = data.getId();
        this.namePOI = data.getNamePOI();
        this.coordinate_x = data.getCoordinate_x();
        this.coordinate_y = data.getCoordinate_y();
    }
}
