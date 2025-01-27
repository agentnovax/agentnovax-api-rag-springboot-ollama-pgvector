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

package com.anx.ragapplication.controller;

import com.anx.ragapplication.model.Document;
import com.anx.ragapplication.service.RagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/rag")
public class RagController {
    private final RagService ragService;

    public RagController(RagService ragService) {
        this.ragService = ragService;
    }

    @PostMapping("/index")
    public ResponseEntity<String> indexDocument(@RequestBody Map<String, String> request) {
        String content = request.get("content");
        ragService.indexDocument(content);
        return ResponseEntity.ok("Document indexed successfully");
    }

    @GetMapping("/query")
    public ResponseEntity<List<Document>> queryDocuments(
            @RequestParam String query,
            @RequestParam(defaultValue = "5") int topK) {
        return ResponseEntity.ok(ragService.queryDocuments(query, topK));
    }
}

