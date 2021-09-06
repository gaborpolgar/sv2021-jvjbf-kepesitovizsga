create table world_record
(
    id   bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255),
    value DOUBLE,
    unit_of_measure VARCHAR(255),
    date_of_record DATE,
    recorder_id BIGINT
);