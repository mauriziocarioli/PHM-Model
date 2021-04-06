package com.health_insurance.phm_model;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.kie.api.definition.type.Description;
import org.kie.api.definition.type.Label;

/**
 *
 * Properties of an action
 */
@Label("Action")
@Description("Properties of an action.")
public class Action implements Serializable {

    private static final long serialVersionUID = 4298215260042212032L;

    /**
     *
     * An action
     */
    public Action() {
    }

    // Task attributes

    @Label("Task Id")
    @Description("Numerical value identifying the task.")
    private Integer id;
    @Label("Orig Task Id")
    @Description("Alphanumeric code of the task.")
    private String origId;
    @Label("Description")
    @Description("Description of the task.")
    private String description;
    @Label("Actor")
    @Description("The actor of the task.")
    private String actor;
    @Label("Channel")
    @Description("The name of the channel where the task is performed.")
    private String channel;

    // Form attributes

    @Label("Message")
    @Description("Message of the task.")
    private String message;
    @Label("Answer Required")
    @Description("The task must return an answer.")
    private Boolean answerRequired;
    @Label("Answer Label")
    @Description("Label of the form's answer field.")
    private String answerLabel;
    @Description(value = "Label of the form's supplemental documentation field.")
    @Label(value = "Supplemental Documentation Label")
    private String supplementalDocumentationLabel;
    @Description(value = "Label of the form's NA flag.")
    @Label(value = "NA Label")
    private String naLabel;
    @Label("NA Text Label")
    @Description("Label of the form's NA text field.")
    private String naTextLabel;

    // Workflow

    @Label("Task Predecessor")
    @Description("Task must (must not) be executed after this task.")
    private Integer predecessor;
    @Label("Task Suppression")
    @Description("Task inactive/suppression flag.")
    private Boolean suppressed;
    @Label("Task Suppression Period")
    @Description("Task inactive/suppression period.")
    private String suppressionPeriod;
    @Label("Send Message")
    @Description("Send a message flag.")
    private Boolean sendMessage;
    @Label("Task Expiration Date")
    @Description("Task expiration date.")
    private Date expirationDate;

    // Reminder

    @Label("Remind")
    @Description("Remind the actor of the task.")
    private Boolean remind;
    @Label("Reminder Frequency")
    @Description("The frequency of the reminder as an ISO 8601 value.")
    private String reminderFrequency;
    @Label("eMail Address")
    @Description("Address where to send the reminder message.")
    private String reminderSendAddress;
    @Label("Subject")
    @Description("Subject of the reminder message.")
    private String reminderSubject;
    @Label("Text")
    @Description("Text of the reminder.")
    private String reminderText;
    @Label("Sender eMail address")
    @Description("Sender address of the reminder message.")
    private String reminderFromAddress;
    @Label("Phone Number")
    @Description("Phone number where to send the reminder message.")
    private String actorPhoneNumber;

    // Escalation

    @Label("Task Escalation")
    @Description("Task escalation flag.")
    private Boolean escalated;
    @Label("Escalation Timer")
    @Description("The timer setting for escalation as an ISO 8601 value.")
    private String escalationTimer;
    @Label("Escalation Actor")
    @Description("The actor of the escalation.")
    private String escalationActor;
    @Label("EscalationChannel")
    @Description("The channel where the escalation is performed.")
    private String escalationChannel;

    // SLA

    @Label("SLA Due Date")
    @Description("The due date of the Service Level Agreement.")
    private String slaDueDate;

    // Close

    @Label("Close")
    @Description("The type of task close.")
    private String close;
    @Label("Close Signal")
    @Description("The hard close signal.")
    private String closeSignal;

    /**
     *
     * @return the numerical value identifying the task
     */
    public Integer getId() {
        return this.id;
    }

    /**
     *
     * @param id	the numerical value identifying the task
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return the alphanumeric code of the task
     */
    public String getOrigId() {
        return this.origId;
    }

    /**
     *
     * @param origId	the alphanumeric code of the task
     */
    public void setOrigId(String origId) {
        this.origId = origId;
    }

    /**
     *
     * @return the description of the task
     */
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @param description the description of the task
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return the actor of the task
     */
    public String getActor() {
        return actor;
    }

    /**
     *
     * @param actor	the actor of the task
     */
    public void setActor(String actor) {
        this.actor = actor;
    }

    /**
     *
     * @return the channel of the task
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     *
     * @return	the message of the task
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message	the message of the task
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return	the form's answer required flag
     */
    public Boolean getAnswerRequired() {
        return answerRequired;
    }

    /**
     *
     * @param answerRequired	the form's answer required flag
     */
    public void setAnswerRequired(Boolean answerRequired) {
        this.answerRequired = answerRequired;
    }

    /**
     *
     * @return	the label of the form's answer field
     */
    public String getAnswerLabel() {
        return answerLabel;
    }

    /**
     *
     * @param answerLabel	the label of the form's answer field
     */
    public void setAnswerLabel(String answerLabel) {
        this.answerLabel = answerLabel;
    }

    /**
     *
     * @return	the label of the form's supplemental documentation field
     */
    public String getSupplementalDocumentationLabel() {
        return this.supplementalDocumentationLabel;
    }

    /**
     *
     * @param supplementalDocumentationLabel	the label of the form's supplemental documentation field
     */
    public void setSupplementalDocumentationLabel(
            String supplementalDocumentationLabel) {
        this.supplementalDocumentationLabel = supplementalDocumentationLabel;
    }

    /**
     *
     * @return	the label of the form's NA flag field
     */
    public String getNaLabel() {
        return this.naLabel;
    }

    /**
     *
     * @param naLabel	the label of the form's NA flag field
     */
    public void setNaLabel(String naLabel) {
        this.naLabel = naLabel;
    }

    /**
     *
     * @return	the label of the form's NA text field
     */
    public String getNaTextLabel() {
        return naTextLabel;
    }

    /**
     *
     * @param naTextLabel	the label of the form's NA text field
     */
    public void setNaTextLabel(String naTextLabel) {
        this.naTextLabel = naTextLabel;
    }

    /**
     *
     * @return	the task predecessor
     */
    public Integer getPredecessor() {
        return predecessor;
    }

    /**
     *
     * @param predecessor	the task predecessor
     */
    public void setPredecessor(Integer predecessor) {
        this.predecessor = predecessor;
    }

    /**
     *
     * @return the task inactive/suppression flag
     */
    public Boolean getSuppressed() {
        return suppressed;
    }

    /**
     *
     * @param suppressed	the task inactive/suppression flag
     */
    public void setSuppressed(Boolean suppressed) {
        this.suppressed = suppressed;
    }

    /**
     *
     * @return the task inactive/suppression period
     */
    public String getSuppressionPeriod() {
        return suppressionPeriod;
    }

    /**
     *
     * @param suppressionPeriod      the task inactive/suppression period
     */
    public void setSuppressionPeriod(String suppressionPeriod) {
        this.suppressionPeriod = suppressionPeriod;
    }

    /**
     *
     * @return	the send message flag
     */
    public Boolean getSendMessage() {
        return sendMessage;
    }

    /**
     *
     * @param sendMessage	the send message flag
     */
    public void setSendMessage(Boolean sendMessage) {
        this.sendMessage = sendMessage;
    }

    /**
     *
     * @return	the task actor's phone number
     */
    public String getActorPhoneNumber() {
        return actorPhoneNumber;
    }

    /**
     *
     * @param actorPhoneNumber	the task actor's phone number
     */
    public void setActorPhoneNumber(String actorPhoneNumber) {
        this.actorPhoneNumber = actorPhoneNumber;
    }

    /**
     *
     * @return	the task expiration date
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     *
     * @param expirationDate	the task expiration date
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     *
     * @return	the remind flag
     */
    public Boolean getRemind() {
        return remind;
    }

    /**
     *
     * @param remind	the remind flag
     */
    public void setRemind(Boolean remind) {
        this.remind = remind;
    }

    /**
     *
     * @return	the frequency of the reminder as an ISO 8601 value
     */
    public String getReminderFrequency() {
        return this.reminderFrequency;
    }

    /**
     *
     * @param reminderFrequency	the frequency of the reminder as an ISO 8601 value
     */
    public void setReminderFrequency(String reminderFrequency) {
        this.reminderFrequency = reminderFrequency;
    }

    /**
     *
     * @return	the email address where to send the reminder
     */
    public String getReminderSendAddress() {
        return reminderSendAddress;
    }

    /**
     *
     * @param reminderSendAddress	the email address where to send the reminder
     */
    public void setReminderSendAddress(String reminderSendAddress) {
        this.reminderSendAddress = reminderSendAddress;
    }

    /**
     *
     * @return	the subject of the reminder email
     */
    public String getReminderSubject() {
        return reminderSubject;
    }

    /**
     *
     * @param reminderSubject	the subject of the reminder email
     */
    public void setReminderSubject(String reminderSubject) {
        this.reminderSubject = reminderSubject;
    }

    /**
     *
     * @return	the text of the reminder
     */
    public String getReminderText() {
        return reminderText;
    }

    /**
     *
     * @param reminderText	the text of the reminder
     */
    public void setReminderText(String reminderText) {
        this.reminderText = reminderText;
    }

    /**
     *
     * @return	the email address the reminder email is sent from
     */
    public String getReminderFromAddress() {
        return reminderFromAddress;
    }

    /**
     *
     * @param reminderFromAddress	the email address the reminder email is sent from
     */
    public void setReminderFromAddress(String reminderFromAddress) {
        this.reminderFromAddress = reminderFromAddress;
    }

    /**
     *
     * @return	the task escalation flag
     */
    public Boolean getEscalated() {
        return escalated;
    }

    /**
     *
     * @param escalated	the task escalation flag
     */
    public void setEscalated(Boolean escalated) {
        this.escalated = escalated;
    }

    /**
     *
     * @return tthe timer setting for escalation as an ISO 8601 value
     */
    public String getEscalationTimer() {
        return this.escalationTimer;
    }

    /**
     *
     * @param escalationTimer	the timer setting for escalation as an ISO 8601 value
     */
    public void setEscalationTimer(String escalationTimer) {
        this.escalationTimer = escalationTimer;
    }

    /**
     *
     * @return	the actor of the escalation task
     */
    public String getEscalationActor() {
        return escalationActor;
    }

    /**
     *
     * @param escalationActor	the actor of the escalation task
     */
    public void setEscalationActor(String escalationActor) {
        this.escalationActor = escalationActor;
    }

    /**
     *
     * @return	the channel of the escalation task
     */
    public String getEscalationChannel() {
        return escalationChannel;
    }

    /**
     *
     * @param escalationChannel	the channel of the escalation task
     */
    public void setEscalationChannel(String escalationChannel) {
        this.escalationChannel = escalationChannel;
    }

    /**
     *
     * @return	the SLA due date of the task
     */
    public String getSlaDueDate() {
        return slaDueDate;
    }

    /**
     *
     * @param slaDueDate	the SLA due date of the task
     */
    public void setSlaDueDate(String slaDueDate) {
        this.slaDueDate = slaDueDate;
    }

    /**
     *
     * @return the type of task close
     */
    public String getClose() {
        return close;
    }

    /**
     *
     * @param close	the type of task close
     */
    public void setClose(String close) {
        this.close = close;
    }

    /**
     *
     * @return	the hard close signal
     */
    public String getCloseSignal() {
        return closeSignal;
    }

    /**
     *
     * @param closeSignal	the hard close signal
     */
    public void setCloseSignal(String closeSignal) {
        this.closeSignal = closeSignal;
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
     * An action
     *
     * @param id
     * @param origId
     * @param description
     * @param actor
     * @param channel
     * @param message
     * @param answerRequired
     * @param answerLabel
     * @param supplementalDocumentationLabel
     * @param naLabel
     * @param naTextLabel
     * @param predecessor
     * @param suppressed
     * @param suppressionPeriod
     * @param sendMessage
     * @param expirationDate
     * @param remind
     * @param reminderFrequency
     * @param reminderSendAddress
     * @param reminderSubject
     * @param reminderText
     * @param reminderFromAddress
     * @param actorPhoneNumber
     * @param escalated
     * @param escalationTimer
     * @param escalationActor
     * @param escalationChannel
     * @param slaDueDate
     * @param close
     * @param closeSignal
     */
    public Action(Integer id, String origId, String description, String actor, String channel, String message, Boolean answerRequired, String answerLabel, String supplementalDocumentationLabel, String naLabel, String naTextLabel, Integer predecessor, Boolean suppressed, String suppressionPeriod, Boolean sendMessage, Date expirationDate, Boolean remind, String reminderFrequency, String reminderSendAddress, String reminderSubject, String reminderText, String reminderFromAddress, String actorPhoneNumber, Boolean escalated, String escalationTimer, String escalationActor, String escalationChannel, String slaDueDate, String close, String closeSignal) {
        this.id = id;
        this.origId = origId;
        this.description = description;
        this.actor = actor;
        this.channel = channel;
        this.message = message;
        this.answerRequired = answerRequired;
        this.answerLabel = answerLabel;
        this.supplementalDocumentationLabel = supplementalDocumentationLabel;
        this.naLabel = naLabel;
        this.naTextLabel = naTextLabel;
        this.predecessor = predecessor;
        this.suppressed = suppressed;
        this.suppressionPeriod = suppressionPeriod;
        this.sendMessage = sendMessage;
        this.expirationDate = expirationDate;
        this.remind = remind;
        this.reminderFrequency = reminderFrequency;
        this.reminderSendAddress = reminderSendAddress;
        this.reminderSubject = reminderSubject;
        this.reminderText = reminderText;
        this.reminderFromAddress = reminderFromAddress;
        this.actorPhoneNumber = actorPhoneNumber;
        this.escalated = escalated;
        this.escalationTimer = escalationTimer;
        this.escalationActor = escalationActor;
        this.escalationChannel = escalationChannel;
        this.slaDueDate = slaDueDate;
        this.close = close;
        this.closeSignal = closeSignal;
    }
}