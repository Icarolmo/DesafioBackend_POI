package backend.brasil.desafios.pointsofinterest.repository;

import backend.brasil.desafios.pointsofinterest.model.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, String> {
}
