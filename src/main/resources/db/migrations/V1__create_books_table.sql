CREATE TABLE books(
    boookId BIGINT PRIMARY KEY,
    bookName VARCHAR(100) NOT NULL UNIQUE,
    bookAuthor VARCHAR(45) NOT NULL,
    releaseDate TIMESTAMP NOT NULL
);