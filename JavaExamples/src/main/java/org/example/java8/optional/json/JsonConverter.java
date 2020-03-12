package org.example.java8.optional.json;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonConverter {

    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("Test.xml"), StandardCharsets.UTF_8);
        String xmlFromFile = lines.collect(Collectors.joining());
        JSONObject xmlToJsonObject = XML.toJSONObject(xmlFromFile);
        System.out.println(xmlToJsonObject.toString());
        String json = xmlToJsonObject.toString();
        JSONObject jsonObject = new JSONObject(json);
        String xml = String.format("<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>%s", XML.toString(jsonObject));
        System.out.println(xml);
    }

}
