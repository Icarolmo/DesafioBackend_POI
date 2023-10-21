package backend.brasil.desafios.pointsofinterest.dto;

import backend.brasil.desafios.pointsofinterest.model.Coordinate;
import backend.brasil.desafios.pointsofinterest.model.Point;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ResponsePointDTO {

    List<Coordinate> lanchonete = new ArrayList<>();

    List<Coordinate> joalheria = new ArrayList<>();

    List<Coordinate> pub = new ArrayList<>();

    List<Coordinate> supermercado = new ArrayList<>();


    public void setPoint(Point data){
        String namePoint = data.getNamePOI();
        if(namePoint.equals(new String("lanchonete"))){
            lanchonete.add(new Coordinate(data.getCoordinate_x(), data.getCoordinate_y()));
            return ;
        }
        if(namePoint.equals(new String("joalheria"))){
            joalheria.add(new Coordinate(data.getCoordinate_x(), data.getCoordinate_y()));
            return ;
        }
        if(namePoint.equals(new String("pub"))){
            pub.add(new Coordinate(data.getCoordinate_x(), data.getCoordinate_y()));
            return ;
        }
        if(namePoint.equals(new String("supermercado"))) {
            supermercado.add(new Coordinate(data.getCoordinate_x(), data.getCoordinate_y()));
            return;
        }
    }
}
