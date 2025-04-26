DROP TABLE IF EXISTS chat_messages;
DROP TABLE IF EXISTS prompt_settings;
DROP TABLE IF EXISTS databases;
DROP TABLE IF EXISTS chats;
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users(
                                    id BIGSERIAL PRIMARY KEY,
                                    email VARCHAR,
                                    password_hash VARCHAR,
                                    created_at TIMESTAMP,
                                    status INTEGER
);

CREATE TABLE IF NOT EXISTS chats(
                                    id BIGSERIAL PRIMARY KEY,
                                    chat_title VARCHAR,
                                    created_at TIMESTAMP,
                                    user_id BIGINT,
                                    FOREIGN KEY (user_id) REFERENCES users(id)
    );

CREATE TABLE IF NOT EXISTS prompt_settings(
                                              id BIGSERIAL PRIMARY KEY,
                                              technique INTEGER,
                                              n_value INTEGER,
                                              examples TEXT,
                                              created_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_messages(
                                            id BIGSERIAL PRIMARY KEY,
                                            sender VARCHAR,
                                            content TEXT,
                                            created_at TIMESTAMP,
                                            chat_id BIGINT,
                                            prompt_id BIGINT,
                                            FOREIGN KEY (chat_id) REFERENCES chats(id),
    FOREIGN KEY (prompt_id) REFERENCES prompt_settings(id)
    );

CREATE TABLE IF NOT EXISTS databases(
                                        id BIGSERIAL PRIMARY KEY,
                                        schema_text TEXT,
                                        data_text TEXT,
                                        created_at TIMESTAMP,
                                        chat_id BIGINT,
                                        FOREIGN KEY (chat_id) REFERENCES chats(id)
    );
