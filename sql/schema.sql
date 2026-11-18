DROP TABLE IF EXISTS xogadores;
DROP TABLE IF EXISTS celta;
CREATE TABLE xogadores (
                           id SERIAL PRIMARY KEY,
                           nome VARCHAR(50) NOT NULL,
                           posicion VARCHAR(50) NOT NULL,
                           idade INTEGER NOT NULL CHECK (idade > 0)
);
CREATE TABLE celta (
                       id SERIAL PRIMARY KEY,
                       nome VARCHAR(50) NOT NULL,
                       soldo NUMERIC(10, 2) NOT NULL CHECK (soldo >= 0)
);