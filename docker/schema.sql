CREATE EXTENSION IF NOT EXISTS vector; -- Ensure the PGVector extension is enabled

CREATE TABLE IF NOT EXISTS documents (
                                         id SERIAL PRIMARY KEY,            -- Auto-incrementing primary key
                                         content TEXT NOT NULL,            -- Document text
                                         embedding VECTOR(384) NOT NULL   -- Vector for embeddings
    );