FROM ollama/ollama:latest

# Copy the start script into the container
COPY docker/ollama/start-ollama.sh /start-ollama.sh

# Make the script executable
RUN chmod +x /start-ollama.sh

# Expose port
EXPOSE 11434

# Use the script to start the Ollama service
ENTRYPOINT ["/start-ollama.sh"]
