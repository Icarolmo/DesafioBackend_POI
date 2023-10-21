package backend.brasil.desafios.pointsofinterest.model;

import org.springframework.lang.NonNull;

public record RequestCreatePoint (
    @NonNull
    String name_poi,
    @NonNull
    long coordinate_x,
    @NonNull
    long coordinate_y
    ){}
