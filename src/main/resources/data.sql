-- Insertar espacios de coworking
INSERT INTO space (id, name, location, capacity) VALUES
(1, 'Espacio Alpha', 'Centro Empresarial, Bogotá', 20),
(2, 'Espacio Beta', 'Zona Financiera, Medellín', 15),
(3, 'Espacio Gamma', 'Parque Tecnológico, Cali', 10);

-- Insertar reservas
INSERT INTO reservation (id, space_id, user_name, start_time, end_time) VALUES
(1, 1, 'Carlos Pérez', '2025-02-22 09:00:00', '2025-02-22 12:00:00'),
(2, 2, 'Mariana Gómez', '2025-02-23 14:00:00', '2025-02-23 17:00:00'),
(3, 3, 'Luis Rodríguez', '2025-02-24 08:30:00', '2025-02-24 11:30:00');
