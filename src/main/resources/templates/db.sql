-- CREATE TABLE hotel_administration.hotel(
--     id         int         NOT NULL PRIMARY KEY,
--     name        varchar(50) NOT NULL,
--     address    varchar(50) NOT NULL,
--     room_qty   int         NOT NULL
-- );
--
-- CREATE TABLE hotel_administration.room(
--     id          int         NOT NULL PRIMARY KEY,
--     hotel_id    int         NOT NULL,
--     capacity    int         NOT NULL,
--     number      int         NOT NULL,
--     is_taken    boolean     NOT NULL,
--     CONSTRAINT fk_hotel
--         FOREIGN KEY(hotel_id)
--             REFERENCES hotel(id)
-- );
--
-- CREATE TABLE hotel_administration.customer (
--     id          int         NOT NULL PRIMARY KEY,
--     full_name   varchar(50) NOT NULL,
--     email       varchar(50) NOT NULL
-- );
--
-- CREATE TABLE hotel_administration.room_customer(
--     room_id    int         NOT NULL,
--     customer_id     int         NOT NULL,
--     PRIMARY KEY(room_id, customer_id),
--         CONSTRAINT fk_room
--         FOREIGN KEY(room_id)
--         REFERENCES room(id),
--     CONSTRAINT fk_customer
--         FOREIGN KEY(customer_id)
--             REFERENCES customer(id)
-- );

INSERT INTO hotel_administration.hotel
    (id, hotel_name, address, room_qty)
VALUES
    (1, 'Chachi', 'Calle 123', 69),
    (2, 'Guachi', 'Calle 456', 420),
    (3, 'Mariachi', 'Calle 789', 1)
;

INSERT INTO hotel_administration.room
    (id, capacity, number, is_taken)
VALUES
    ()
;

INSERT INTO hotel_administration.customer
    (id, full_name, email)
VALUES
    (1, 'Juan Abu', 'juan@abu.com'),
    (2, 'Alas Jan 1', 'alasjan1@abu.com'),
    (3, 'Germen Abu', 'germen@abu.com'),
    (4, 'Fabrizio Pipolito', 'fabri@dipo.com'),
    (5, 'Ducky ABC', 'ducky@abd.com'),
    (6, 'Mad Max', 'mad@max.com')
;
