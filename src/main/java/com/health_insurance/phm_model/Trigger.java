package com.health_insurance.phm_model;


import java.io.Serializable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.kie.api.remote.Remotable;
import org.kie.api.definition.type.Description;
import org.kie.api.definition.type.Label;

/**
 *
 * Properties of a trigger.
 */
@Remotable
@Label("Trigger")
@Description("The Trigger event.")
public class Trigger implements Serializable {

    private static final long serialVersionUID = 4180386790618507854L;

    @Description("The ID of the Trigger event.")
    @Label("Trigger ID")
    private Integer triggerId;
    @Description("The ID of the insurance member.")
    @Label("Member ID")
    private String memberId;

    /**
     *
     * The trigger
     */
    public Trigger() {
    }

    /**
     *
     * @return the code identifying the trigger
     */
    public Integer getTriggerId() {
        return this.triggerId;
    }

    /**
     *
     * @param triggerId the code identifying the trigger
     */
    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    /**
     *
     * @return the insurance member id
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     *
     * @param memberId  the insurance member id
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
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

    /**
     *
     * Properties of a trigger.
     *
     * @param triggerId
     * @param memberId
     */
    public Trigger(Integer triggerId, String memberId) {
        this.triggerId = triggerId;
        this.memberId = memberId;
    }

}