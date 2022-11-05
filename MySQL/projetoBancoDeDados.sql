CREATE DATABASE rpg;

USE rpg;

SHOW TABLES;

CREATE TABLE personagem (
idPersonagem INTEGER PRIMARY KEY AUTO_INCREMENT,
nomePersonagem VARCHAR(30) NOT NULL,
danoPersonagem INTEGER NOT NULL,
defesaPersonagem INTEGER NOT NULL,
hpPersonagem INTEGER NOT NULL
);

INSERT INTO personagem VALUES (NULL, "Frodo Bolseiro", 5 , 6 , 10);
INSERT INTO personagem VALUES (NULL, "Passolargo", 8 , 7 , 20);
INSERT INTO personagem VALUES (NULL, "Gandalf", 8 , 9 , 30);
INSERT INTO personagem VALUES (NULL, "Barbárvore", 10 , 10 , 50);
INSERT INTO personagem VALUES (NULL, "Legolas", 12 , 5 , 16);
INSERT INTO personagem VALUES (NULL, "Gmili", 8 , 4 , 23);
INSERT INTO personagem VALUES (NULL, "Orc", 15 , 6 , 10);
INSERT INTO personagem VALUES (NULL, "Uruk-Hai", 6 , 7 , 51);
INSERT INTO personagem VALUES (NULL, "Laracna", 12 , 5 , 19);
INSERT INTO personagem VALUES (NULL, "Nazgûl", 5 , 9 , 10);


CREATE TABLE jogador (
idJogador INTEGER PRIMARY KEY AUTO_INCREMENT,
classeJogador VARCHAR(30) NOT NULL,
skillJogador INTEGER NOT NULL,
idPC INTEGER NOT NULL,
FOREIGN KEY(idPC) REFERENCES personagem(idPersonagem)
);

INSERT INTO jogador VALUES (NULL, "ladrão", 5 , 1 );
INSERT INTO jogador VALUES (NULL, "lutador", 5 , 2 );
INSERT INTO jogador VALUES (NULL, "mago", 5 , 3 );
INSERT INTO jogador VALUES (NULL, "lutador", 5 , 4 );
INSERT INTO jogador VALUES (NULL, "arqueiro", 5 , 5 );
INSERT INTO jogador VALUES (NULL, "lutador", 5 , 6 );


CREATE TABLE monstro (
idMonstro INTEGER PRIMARY KEY AUTO_INCREMENT,
classeMonstro VARCHAR(30) NOT NULL,
skillMonstro INTEGER NOT NULL,
idNPC INTEGER NOT NULL,
FOREIGN KEY(idNPC) REFERENCES personagem(idPersonagem)
);

INSERT INTO monstro VALUES (NULL, "lutador", 5 , 7 );
INSERT INTO monstro VALUES (NULL, "mago", 52 , 8 );
INSERT INTO monstro VALUES (NULL, "Arqueiro", 12 , 9 );
INSERT INTO monstro VALUES (NULL, "lutador", 26 , 10 );

SELECT MAX(danoPersonagem) FROM personagem; 
SELECT MIN(danoPersonagem) FROM personagem; 
SELECT MAX(defesaPersonagem) FROM personagem; 
SELECT MIN(defesaPersonagem) FROM personagem;
SELECT AVG(hpPersonagem) FROM personagem;
SELECT SUM(hpPersonagem) FROM personagem;

SELECT * FROM monstro WHERE skillMonstro BETWEEN 10 AND 30;

SELECT idPersonagem, nomePersonagem, hpPersonagem FROM personagem WHERE idVendedor = 4;
SELECT * FROM jogador WHERE idJogador = 3 OR idJogador =6;
SELECT * FROM monstro WHERE classeMonstro LIKE "lutador";















