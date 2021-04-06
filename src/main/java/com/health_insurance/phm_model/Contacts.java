package com.health_insurance.phm_model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.kie.api.definition.type.Description;
import org.kie.api.definition.type.Label;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * Hash map of the actor's contacts.
 *
 */
@Label("Contacts")
@Description("Contacts.")
public class Contacts extends LinkedHashMap<String,Contact> implements Serializable {

    private static final long serialVersionUID = -1143772225314958630L;

    /**
     * Contacts.
     *
     */
    public Contacts() {
    }

    /**
     *
     * @return the object as a JSON string
     */
    @Override
    public String toString() {
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

}