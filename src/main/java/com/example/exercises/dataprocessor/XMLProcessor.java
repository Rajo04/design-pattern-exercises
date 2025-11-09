package com.example.exercises.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class XMLProcessor extends DataProcessor {
    
    private List<String> xmlData;

    public XMLProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.xmlData = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading XML ...");
        xmlData.add("<recipe>Fresh Pasta</recipe>");
        xmlData.add("<recipe>Fresh Fish</recipe>");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming XML...");
        xmlData.replaceAll(x -> "<food>" + x + "</food>");
    }

    @Override
    protected void validate() {
        System.out.println("Validating XML...");
        if (!xmlData.stream().allMatch(x -> x.startsWith("<record>"))) {
            System.out.println("Validation Failed: Some XML entries are incorrect.");
        }
    }

    @Override
    protected void save() {
        System.out.println("Saving XML to " + outputFile + "...");
        xmlData.forEach(System.out::println);
    }   
}
