# Use the official PostgreSQL image as the base
FROM postgres:15
# Install necessary dependencies and build pgvector
RUN apt-get update && \
        apt-get install -y postgresql-server-dev-15 build-essential git && \
        git clone https://github.com/pgvector/pgvector.git /pgvector && \
        cd /pgvector && \
        make && make install && \
        apt-get remove -y build-essential git && \
        apt-get autoremove -y && \
        rm -rf /pgvector /var/lib/apt/lists/*
# Set the default PostgreSQL configuration (optional)
COPY docker/postgres/custom-postgresql.conf /etc/postgresql/postgresql.conf
EXPOSE 11434
# Update the entrypoint to include custom configuration
CMD ["postgres", "-c", "config_file=/etc/postgresql/postgresql.conf"]
