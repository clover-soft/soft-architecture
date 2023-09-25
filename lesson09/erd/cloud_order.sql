CREATE TABLE Users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(255)
);

CREATE TABLE Orders (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT,
  order_date DATE,
  cpu_cores INT,
  memory INT,
  disk_space INT,
  os_type ENUM('windows', 'ubuntu', 'debian', 'freebsd'),
  ip_addresses INT,
  FOREIGN KEY (user_id) REFERENCES Users(id)
);