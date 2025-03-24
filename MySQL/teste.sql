
DROP DATABASE IF EXISTS MeuTeste;

-- Create a table named 'users'
CREATE DATABASE MeuTeste;

USE MeuTeste;


CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,  -- Unique identifier for each user
    username VARCHAR(50) NOT NULL,           -- Username of the user
    password VARCHAR(255) NOT NULL,          -- Password of the user (hashed)
    email VARCHAR(100) NOT NULL UNIQUE,      -- Email address of the user
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- Timestamp of when the user was created
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,  -- Timestamp of the last update 
    _status ENUM('on','del','off'),
    _empty1 TEXT, -- Para usar no futuro
    _empty2 TEXT, -- Para usar no futuro
    _empty3 TEXT -- Para usar no futuro
);

-- Optional: Insert a sample user into the 'users' table
INSERT INTO users 
(
    username,
    password,
    email,
	_status
) VALUES(
    'sampleUser',
    SHA1('hashedPassword123'),
    'sample@example.com',
	'on'
);
