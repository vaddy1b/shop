--liquibase formatted sql
-- Create table for "snowcase"
CREATE TABLE snowcase (
                         id UUID PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         address VARCHAR(255) NOT NULL,
                         type VARCHAR(255) NOT NULL,
                         creation_date TIMESTAMP NOT NULL,
                         last_updated_date TIMESTAMP NOT NULL,
                         CONSTRAINT CK_showcase_address CHECK (snowcase.address <> '')
);

-- Create table for "item"
CREATE TABLE item (
                       id UUID PRIMARY KEY,
                       id_showcase UUID NOT NULL,
                       position INT NOT NULL,
                       name VARCHAR(255) NOT NULL,
                       type VARCHAR(255) NOT NULL,
                       price DECIMAL(10, 2) NOT NULL,
                       addition_date TIMESTAMP NOT NULL,
                       modification_date TIMESTAMP NOT NULL,
                       CONSTRAINT FK_item_showcase FOREIGN KEY (id_showcase) REFERENCES snowcase (id),
                       CONSTRAINT CK_item_price CHECK (item.price >= 1000.0)
);


INSERT INTO snowcase (name, address, type, creation_date, last_updated_date)
VALUES ('Showcase 1', '123 Main Street', 'Type 1', '2022-01-01', '2022-01-01'),
       ('Showcase 2', '456 Elm Street', 'Type 2', '2022-01-02', '2022-01-02'),
       ('Showcase 3', '789 Oak Street', 'Type 3', '2022-01-03', '2022-01-03');


INSERT INTO item (position, name, type, price, addition_date, modification_date)
VALUES (2, 'Ноутбук', 'Компьютерные товары', 1500.00, '2022-01-04', '2022-01-05'),
       (1, 'Холодильник', 'Кухонная техника', 2000.00, '2022-01-06', '2022-01-07'),
       (3, 'Смартфон', 'Гаджеты', 1200.00, '2022-01-08', '2022-01-09'),
       (1, 'Мультиварка', 'Кухонная техника', 1500.00, '2022-01-10', '2022-01-11'),
       (4, 'Камера', 'Фото-видео техника', 1800.00, '2022-01-12', '2022-01-13'),
       (1, 'Тостер', 'Кухонная техника', 1300.00, '2022-01-14', '2022-01-15'),
       (3, 'Умные часы', 'Гаджеты', 1800.00, '2022-01-16', '2022-01-17'),
       (5, 'Пылесос', 'Бытовая техника', 1900.00, '2022-01-18', '2022-01-19'),
       (4, 'Фотоаппарат', 'Фото-видео техника', 2500.00, '2022-01-20', '2022-01-21'),
       (2, 'Ноутбук', 'Компьютерные товары', 2000.00, '2022-01-22', '2022-01-23');

