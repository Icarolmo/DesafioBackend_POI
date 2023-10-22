package backend.brasil.desafios.pointsofinterest.dto;

import org.springframework.lang.NonNull;

public record RequestPointDTO(
        @NonNull
        long coordinate_x,
        @NonNull
        long coordinate_y,
        @NonNull
        long max_distance){}
