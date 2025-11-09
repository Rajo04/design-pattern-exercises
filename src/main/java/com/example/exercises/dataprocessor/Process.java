package com.example.exercises.dataprocessor;

public class Process {
     public static void main(String[] args) {

        DataProcessor csv = new CSVProcessor("data.csv", "data_out.csv");
        DataProcessor json = new JsonProcessor("data.json", "data_out.json");
        DataProcessor xml = new XMLProcessor("data.xml", "data_out.xml");

        xml.enableValidation();

        System.out.println("\nProcessing CSV Data...");
        csv.process();

        System.out.println("\nProcessing JSON Data...");
        json.process();

        System.out.println("\nProcessing XML Data (Validation enabled)...");
        xml.process();
    }
}
