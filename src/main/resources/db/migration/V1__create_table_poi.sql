CREATE TABLE point_of_interest (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    name_poi VARCHAR(50) NOT NULL,
    coordinate_x BIGINT NOT NULL,
    coordinate_y BIGINT NOT NULL
);
