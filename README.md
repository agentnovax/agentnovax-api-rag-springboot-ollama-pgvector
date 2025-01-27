
# <img src="https://raw.githubusercontent.com/agentnovax/www.agentnovax.com/main/assets/banners/AgentNovaX-Banner.png" alt="AgentNovaX Banner" height="300" width="100%">

---

# AgentNovaX

## Welcome to **AgentNovaX**! 🌍✨

At [AgentNovaX](https://www.agentnovax.com/), our vision is to create a world where **innovation**, **collaboration**, **technology**, and **sustainability** work hand-in-hand to empower communities. We aim to provide tools that **simplify tasks**, **increase productivity**, and contribute to a **better planet**. Through **creativity**, **inclusivity**, and **environmental consciousness**, we strive to inspire a global movement toward shared success and continuous growth. 🌱💡

---

# 🚀 **Retrieval-Augmented Generation (RAG)**

## Overview

**Retrieval-Augmented Generation (RAG)** is a cutting-edge natural language processing (NLP) technique that combines **retrieval-based** and **generation-based** methods to significantly enhance the performance of language models for tasks like **question answering**, **text generation**, and **semantic search**. RAG integrates two key components: **retrieving relevant information** from a knowledge base or corpus and **generating meaningful content** based on that information.

---

### Key Concepts of RAG:

#### 1. **🔍 Retrieval-Based Methods**:
- In this step, relevant information is retrieved from a **large corpus of text** or database based on the input query. This is typically done by converting the input into an **embedding** and searching for the most relevant documents or pieces of text using vector databases.
- Example: For a query like *"What is the capital of France?"*, the system retrieves relevant passages like "The capital of France is Paris."

#### 2. **📝 Generation-Based Methods**:
- After retrieving the relevant documents or text, a **language model** (like **GPT-3**, **T5**, or **BERT**) is used to **generate a response** based on the retrieved content. This is the "augmented generation" step where the model synthesizes the retrieved data into a coherent, informative response.

---

### Architecture of RAG:

#### 1. **🔄 Retrieval**:
- The input query (e.g., *"What is the capital of France?"*) is converted into an **embedding** using a pre-trained model like **BERT** or **MiniLM**.
- The embedding is then used to search a vector database (e.g., **PGVector**, **FAISS**, **Elasticsearch**) for the most relevant documents.

#### 2. **🧠 Augmentation**:
- Once relevant documents are retrieved, a **generation model** (e.g., **GPT-3**, **T5**, or **BART**) takes the input query along with the retrieved documents to generate a complete, contextually relevant response.

#### 3. **💡 Combination**:
- By combining retrieval and generation, RAG enhances the **accuracy** and **relevance** of responses. The generation model is augmented with dynamic, up-to-date information, allowing the model to provide more informed and accurate answers.

---

## Advantages of RAG

- **⚡ Enhanced Accuracy**: The retrieval mechanism allows the model to access more accurate and context-specific information, improving response quality.
- **📚 Dynamic Knowledge**: Instead of relying solely on fixed pre-trained knowledge, RAG can use **real-time external information** retrieved from documents or databases.
- **🌐 Open-Domain Performance**: RAG excels in open-domain tasks like **question answering** and **semantic search**, where the model needs to answer queries based on external information.

---

## Use Cases

RAG can be used across a variety of applications, including:

- **❓ Question Answering (QA)**:
    - Provides more precise and relevant answers by retrieving information from a knowledge base or external documents.

- **💬 Dialogue Systems**:
    - Enhances conversational AI systems by retrieving related documents and generating more informed, context-aware responses.

- **📑 Summarization**:
    - Retrieves relevant content from long documents and generates concise summaries.

---

## Example of RAG in Action:

1. **Input**:
    - *"What is the capital of France?"*

2. **🔍 Retrieval**:
    - The system retrieves relevant documents, such as:
        - "The capital of France is Paris."

3. **📝 Generation**:
    - Using the retrieved data, the model generates a response:
        - "The capital of France is Paris."

---

## Conclusion

**Retrieval-Augmented Generation (RAG)** is a powerful technique that enhances the generation process by combining the strengths of both **retrieval** and **generation**. By leveraging real-time information retrieval, RAG can provide better performance for tasks like **question answering**, **semantic search**, and **text generation**, making it an invaluable tool for NLP applications.
**Although we are using a smaller model to in this set up locally however ollama allows you to use any model for instance llama 2 or llama 3 with much larger parameters but is not recommended to run larger model locally without going thorough minimum system requirement**. We can even use the existing large models like GPT to make use their wide parameters in case model can't be host locally.

---

## **AgentNovaX-SpringRAGAPI** - Spring Boot Project with Postgre Vector, Ollama and All-MiniLM Model 🚀

**AgentNovaX-SpringRAGAPI** demonstrates the implementation of **Retrieval-Augmented Generation (RAG)** using a **Spring Boot** backend, locally hosted **all-MiniLM model** on **Ollama**, and **PGVector** as the vector database. This architecture allows the integration of retrieval and generation techniques to enhance the information retrieval process and provide more relevant results when interacting with language models.

Perfect for developers looking to locally host **NLP Models** into their **Spring Boot** applications with **PostgreSQL** as the backend vector data store, providing a complete **RAG solution**.

---

## Architecture Overview

- **Ollama** hosts the **all-MiniLM model**, which generates dense vector embeddings from text queries.
- **PGVector** is used to store and retrieve vector embeddings efficiently from a PostgreSQL database.
- **Spring Boot API** interacts with Ollama to generate embeddings for queries, stores the vectors in PGVector, and performs semantic search with generated embeddings for a Retrieval-Augmented Generation (RAG) system.

---

## Features 🔑

### 🌟 **Key Features of the RAG Application**:

1. **🧑‍💻 **Spring Boot Backend**:
    - **Fast and Scalable REST API**: Build robust APIs to handle text queries and responses.
    - **Integrated with PGVector**: Seamlessly interacts with the **PGVector** PostgreSQL extension to store and retrieve vector embeddings for text queries.
    - **Secure Authentication**: Leverage **JWT** for secure, token-based authentication.
    - **Seamless Communication**: Interfaces with **Ollama** to call the **all-MiniLM** model to generate embeddings.
    - **Containerized with Docker**: Full Docker support for easy deployment and portability.

---

2. **🧠 **Ollama with all-MiniLM Model**:
    - **Local Hosting of all-MiniLM**: Hosts the **all-MiniLM** model locally using **Ollama** for generating high-quality embeddings.
    - **Efficient and Lightweight**: **MiniLM** (384-dimensional embeddings) offers great performance with low latency compared to larger models like BERT.
    - **Flexible and Extensible**: Easily switch between different models or deploy new ones using **Ollama**.
    - **Real-Time Embeddings**: Generate embeddings dynamically from text inputs for use in the RAG pipeline.

---

3. **🔑 **PGVector (Vector Database)**:
    - **PostgreSQL Vector Extension**: Leverages **PGVector** to store embeddings in PostgreSQL for efficient search and retrieval.
    - **Efficient Vector Search**: Use vector similarity search to quickly find the most relevant documents from the database.
    - **Dimensionality Support**: Supports **384-dimensional embeddings** generated by **all-MiniLM** for fast and accurate retrieval.
    - **Scalable Storage**: Easily manage and scale vector embeddings, enabling open-domain search and retrieval tasks.
    - **SQL Interface**: Seamlessly integrates with PostgreSQL, making it easy to query, store, and manage embeddings directly using SQL commands.

---

4. **🔗 **Retrieval-Augmented Generation (RAG) Workflow**:
    - **Text Embedding Generation**: Convert text queries into embeddings using the **all-MiniLM model** hosted locally via **Ollama**.
    - **Semantic Search**: Perform **semantic search** on the vector database (**PGVector**) to find the most relevant documents or passages related to the query.
    - **Generation of Contextual Responses**: Augment the text query with retrieved information to generate more accurate, informed, and contextually relevant responses using generation-based models.
    - **Real-Time Updates**: The model can continuously learn from new data added to the vector database for more accurate and up-to-date results.

---

5. **🛠️ **Dockerized Deployment**:
    - **Easy Setup**: Dockerized containers for each service (Spring Boot, PostgreSQL, Ollama) ensure a quick and hassle-free setup.
    - **Portability**: Run the entire application stack on any platform that supports Docker, making deployment and scaling easy.
    - **Multi-Container Support**: Uses **Docker Compose** to orchestrate multiple containers for a fully functional local environment.

---

6. **📈 **Scalability and Performance**:
    - **Optimized Vector Storage**: **PGVector** provides fast retrieval of embeddings with minimal latency, supporting large-scale applications.
    - **Efficient Caching**: Use caching mechanisms to speed up retrieval times for frequently queried embeddings.
    - **High Throughput**: The system is designed to handle high loads of concurrent queries, ensuring responsiveness even with large datasets.

---

## Prerequisites ⚙️

### Tools and Technologies 🛠️
- **Java** (23)
- **Spring Boot** (3.4.1): Backend framework for building REST APIs.
- **PostgreSQL** (17)
- **PGVector**: A PostgreSQL extension for storing vector embeddings and performing vector searches.
- **Ollama**: Tool to serve models like all-MiniLM for generating embeddings.
- **Docker**: Containerization to simplify deployment and environment setup. 
- **Postman**: For testing APIs.
- ****


---

## Installation 🏗️

### Step 1: Set Up PostgreSQL 🗃️

#### 1. Install PostgreSQL
- **Windows**:
    - Download the installer from the [official site](https://www.postgresql.org/download/).
    - Follow the installation instructions.
    - Set up a password for the `postgres` user during installation.
- **Linux**:
  ```bash
  sudo apt update
  sudo apt install postgresql postgresql-contrib
  ```
- **macOS**:
  ```bash
  brew install postgresql
  ```

#### 2. Start PostgreSQL Service
- **Windows**: Use **pgAdmin** or start the service from the services tab.
- **Linux/macOS**:
  ```bash
  sudo service postgresql start
  ```

#### 3. Create a Database and enable vector extension
- Access the PostgreSQL shell:
  ```bash
  psql -U postgres
  ```
- Create a database and tables using the script in [`schema.sql`](docker/schema.sql):
  ```postgresql
  CREATE DATABASE "postgres"
  WITH OWNER = postgres ENCODING = 'UTF8';
  ```

- Exit the shell:
  ```sql
  \q
  ```

### Step 2: Set Up Docker 🚢
### 2. Docker Setup

#### 2.1 **Dockerize the Spring Boot Application**

Ensure your Spring Boot application is properly configured and can run in a Docker container. Update configuration inside [**Dockerfile**](docker/Dockerfile) and [**docker-compose**](docker/docker-compose.yml) setup for Spring Boot.

#### 2.2 **Customise Postgres image**

Update postgres configuration inside [**Dockerfile**](docker/postgres/Dockerfile) and [**custom-postgresql**](docker/postgres/custom-postgresql.conf) setup for Postgres SQL with Vector.

#### 2.3 **Customise Ollama image and install custom model**

Update ollama configuration inside [**Dockerfile**](docker/ollama/Dockerfile) and [**start-ollama**](docker/ollama/start-ollama.sh) setup for ollama with all-minilm model locally we can skip this step and can directly use available larger model API likes GPT for specific use cases.

---

## Running the Project ⚡

### 1. Clone the Repository
```bash
git clone <repository_url>
cd <repository_name>
```

### 2. Update Configuration 🛠️
Update the `application.properties` or `application.yml` file:
```properties

spring.datasource.url=jdbc:postgresql://database:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update

ollama.model=all-minilm
ollama.embeddingURL="http://ollama:11434/api/embed"
```

### 3. Build and Run 🚀

Once all the configurations are set, follow these steps to run the project:

1. **Build the Spring Boot Application**:

```bash
./mvnw clean package
```
or (**Gradle**)
```bash
./gradlew bootJar
```

2. **Start the Docker Containers**:

```bash
docker-compose up --build
```

This will start:
- **PostgreSQL** with PGVector.
- **Ollama** to serve the **all-MiniLM model**.
- **Spring Boot Application** that connects to the other services.

3. **Test the API**:
 You can now test your API using tools like **Postman** or **curl**. You can send text data to the Spring Boot API, which will generate an embedding using the **all-MiniLM model** hosted via Ollama, store the embedding in PostgreSQL (via PGVector), and retrieve the embeddings for RAG.

---

## API Usage 📡

### API Testing with Postman 🛠️

This project comes with a **Postman collection** inside **assets/postman** to easily test the API endpoints. You can import the [`agentnovax-api-rag-springboot-ollama-pgvector.postman_collection`](assets/postman/agentnovax-api-rag-springboot-ollama-pgvector.postman_collection) into your **Postman** application to start testing.

### How to Use the Postman Collection

1. **Download the Postman Collection**:  
   Download the [`agentnovax-api-rag-springboot-ollama-pgvector.postman_collection`](assets/postman/agentnovax-api-rag-springboot-ollama-pgvector.postman_collection) from the repository.

2. **Import into Postman**:  
   Open Postman and click on the "Import" button on the top left. Select the downloaded collection file and import it into Postman.

3. **Test API Endpoints**:  
   Once imported, you can start testing the **RAG Index** and **RAG Query** endpoint provided by the API.

This collection simplifies testing the API without needing to manually craft requests and responses.

---

## Contributions ✨

We welcome contributions! Feel free to **open a pull request** or raise an **issue** for enhancements or bug fixes.

---

## Additional Notes 📋

- **Testing**: Use tools like **Postman** or **cURL** to test API endpoints.
- **Scaling**: Consider containerization with **Docker** for consistent deployment across environments.
- **Models**: Refer to the documentation for detailed setup for other models that can be hosted locally.
- For more information, check out the [Spring Boot Documentation](https://spring.io/projects/spring-boot), [Ollama](https://ollama.com), [PGVector](https://github.com/pgvector/pgvector) and [Docker](https://docs.docker.com/).

---

## License 📄

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0) - see the [LICENSE](LICENSE.md) file for details..

---

## Contact 📧

For any queries, feel free to reach out via [agentnovaxp@gmail.com](mailto:agentnovaxp@gmail.com).

---

## Follow AgentNovaX 🌍

Stay connected with **AgentNovaX** through our social media channels:

- [X (Twitter)](https://twitter.com/agentnovax) 🐦
- [LinkedIn](https://linkedin.com/company/agentnovax) 🔗
- [Instagram](https://www.instagram.com/agentnovax/) 📸
- [Facebook](https://www.facebook.com/profile.php?id=61571252049491) 📘
- [YouTube](https://www.youtube.com/@agentnovaxp) 🎥

---

## NovaLeaf Concept 🌱

**NovaLeaf** is an initiative focused on environmental sustainability, aiming to contribute to a greener planet. Through this initiative, **AgentNovaX** is committed to planting trees, fostering green projects, and encouraging eco-friendly practices among individuals and communities.

- **Plant a Tree, Empower a Community**: For every milestone achieved in our platform, a tree will be planted in a designated area.
- **Green Nova Trees**: These trees represent our growth and commitment to sustainability, and each one is named for the cause it supports.
- **Join the Movement**: Become part of the **NovaLeaf** family and help us plant the future, one tree at a time. 🌳

🌟 **Please consider starring this repository to support the NovaLeaf initiative** 🌟

For more information, visit [NovaLeaf](https://novaleaf.agentnovax.com).

---

## DataFlux 🔄

**DataFlux** provides free tools for data conversion, JSON/YAML beautification, and validation to help developers and data enthusiasts streamline their workflow.

- Tools available: JSON/YAML Beautifiers and Validators, JSON/YAML conversion, Text Compare, JavaScript Validators, and more.
- Visit [DataFlux](https://dataflux.agentnovax.com) to explore our tools and enhance your productivity.

---
