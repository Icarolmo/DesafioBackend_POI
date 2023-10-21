package backend.brasil.desafios.pointsofinterest.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "point")
@Table(name = "point_of_interest", schema = "challenge")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "name_poi")
    String namePOI;

    @Column(name = "coordinate_x")
    long coordinate_x;

    @Column(name = "coordinate_y")
    long coordinate_y;

    public Point(RequestCreatePoint data){
        this.namePOI = data.name_poi();
        this.coordinate_x = data.coordinate_x();
        this.coordinate_y = data.coordinate_y();
    }
}
