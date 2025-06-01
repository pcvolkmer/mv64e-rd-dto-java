package dev.pcvolkmer.mv64e.rd;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConverterTest {

    @Test
    void shouldDeserializeJsonString() throws IOException {
        var ressource = getClass().getClassLoader().getResource("mv64e-rd-fake-patient.json");
        assertNotNull(Converter.fromJsonString(new String(ressource.openStream().readAllBytes())));
    }

}
