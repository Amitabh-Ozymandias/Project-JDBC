
-- Sample schema recreated (truncated for brevity)
CREATE TABLE Airports (
    airport_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Routes (
    route_id INT PRIMARY KEY,
    source_airport_id INT,
    destination_airport_id INT,
    miles INT,
    FOREIGN KEY (source_airport_id) REFERENCES Airports(airport_id),
    FOREIGN KEY (destination_airport_id) REFERENCES Airports(airport_id)
);
-- (rest of schema truncated for brevity in this snippet)
