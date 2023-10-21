package backend.brasil.desafios.pointsofinterest.model;

import org.springframework.lang.NonNull;

public record RequestPoint(
        @NonNull
        long coordinate_x,
        @NonNull
        long coordinate_y,
        @NonNull
        long max_distance){}
