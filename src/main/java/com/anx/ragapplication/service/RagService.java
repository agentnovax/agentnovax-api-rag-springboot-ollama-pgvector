/*
 * Copyright 2024 AgentNovaX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.anx.ragapplication.service;

import com.anx.ragapplication.model.Document;
import com.anx.ragapplication.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RagService {
    private final DocumentRepository documentRepository;

    @Value("${ollama.embeddingURL}")
    private String embeddingURL;

    @Value("${ollama.model}")
    private String ollamaModel ;

    public RagService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public ArrayList<Double> getEmbedding(String text) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> request = Map.of("model", ollamaModel, "input", text);
        Map response = restTemplate.postForObject(embeddingURL, request, Map.class);
        ArrayList<ArrayList<Double>> embeddings = (ArrayList<ArrayList<Double>>) response.get("embeddings");
        //System.out.println(embeddings);
        //System.out.println(embeddings.get(0));
        return embeddings.get(0);
    }

    public void indexDocument(String content) {
        double[] embedding = getEmbedding(content).stream().mapToDouble(Double::doubleValue).toArray();
        Document doc = new Document();
        doc.setContent(content);
        doc.setEmbedding(embedding);
        documentRepository.save(doc);
    }

    public List<Document> queryDocuments(String query, int topK) {
        double[] queryEmbedding = getEmbedding(query).stream().mapToDouble(Double::doubleValue).toArray();
        return documentRepository.findSimilarDocuments(queryEmbedding, topK);
    }
}

