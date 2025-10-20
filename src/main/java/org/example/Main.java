package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        File f = new File("src/main/resources/musica.json");

        if (f.exists()) {
            try {
                Festival festival = om.readValue(f, Festival.class);
                System.out.println("Creat: " + festival.getTitol());

                // Crear el mapper XML
                XmlMapper xml = new XmlMapper();
                xml.registerModule(new JavaTimeModule());
                xml.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
                xml.enable(SerializationFeature.INDENT_OUTPUT);
                xml.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);

                String xmlString = xml.writeValueAsString(festival);
                System.out.println("Mostramos el XML:");
                System.out.println(xmlString);

                File out = new File("src/main/resources/festival.xml");
                xml.writeValue(out, festival);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("NO SE ENCUENTRA EL FICHERO");
        }
    }
}
