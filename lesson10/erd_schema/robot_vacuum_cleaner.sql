CREATE TABLE Users (
  id BIGINT AUTO_INCREMENT,
  email VARCHAR(255) UNIQUE,
  password_hash VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE Rooms (
  id BIGINT AUTO_INCREMENT,
  name VARCHAR(255),
  area INT,
  robot_id BIGINT,
  PRIMARY KEY (id),
  FOREIGN KEY (robot_id) REFERENCES Devices(id)
);

CREATE TABLE Schedules (
  id BIGINT AUTO_INCREMENT,
  day_of_week ENUM('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'),
  start_time DATETIME,
  end_time DATETIME,
  room_id BIGINT,
  robot_id BIGINT,
  PRIMARY KEY (id),
  FOREIGN KEY (room_id) REFERENCES Rooms(id),
  FOREIGN KEY (robot_id) REFERENCES Devices(id)
);

CREATE TABLE Devices (
  id BIGINT AUTO_INCREMENT,
  robot_serial_number VARCHAR(255) UNIQUE,
  robot_model VARCHAR(255),
  filter_counter INT,
  brush_counter INT,
  sensor_dirt_level INT,
  last_cleaning_mode ENUM('Влажная', 'Сухая', 'Стандартная'),
  battery_level INT,
  user_id BIGINT,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES Users(id)
);

CREATE TABLE Cleaning_Logs (
  id BIGINT,
  device_id BIGINT,
  start_time DATETIME,
  end_time DATETIME,
  cleaned_area INT,
  room_id BIGINT,
  cleaning_mode ENUM('Влажная', 'Сухая', 'Стандартная'),
  cleaning_type ENUM('Пользовательская', 'Сатндартная'),
  FOREIGN KEY (id) REFERENCES Devices(id),
  FOREIGN KEY (device_id) REFERENCES Devices(id),
  FOREIGN KEY (room_id) REFERENCES Rooms(id)
);