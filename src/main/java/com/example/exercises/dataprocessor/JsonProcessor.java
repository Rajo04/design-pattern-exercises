package com.example.exercises.dataprocessor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JsonProcessor extends DataProcessor {
    
    private List<String> jsonData;

    public JsonProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.jsonData = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading JSON...");
        jsonData.add("{ \"recipe\": \"Fresh Pasta\" }");
        jsonData.add("{ \"recipe\": \"Fresh Fish\" }");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming JSON...");
        String timestamp = LocalDateTime.now().toString();
        jsonData.replaceAll(json -> json + " | timestamp=" + timestamp);
    }

    @Override
    protected void save() {
        System.out.println("Saving JSON to " + outputFile + "...");
        jsonData.forEach(System.out::println);
    }
}
