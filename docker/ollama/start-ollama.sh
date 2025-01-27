#!/bin/bash

# Wait for Ollama service to be ready (if needed)
#while ! curl -s http://localhost:11434; do
  #echo "Waiting for Ollama to start..."
  #sleep 2
#done

# Pull the model if not already downloaded
if [ ! -d "/root/.ollama/models/all-minilm" ]; then
  echo "Model not found. Pulling all-minilm..."
  ollama pull all-minilm
  #ollama list -- to verify models
fi

# Start Ollama service
ollama serve
