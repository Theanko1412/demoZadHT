package com.ht.demozad.Error;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

//Default error message template
@Entity
@Table(name = "Error")
public class Error {

    enum severity {
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        TRACE
    }

    //Unique error ID, used for logging purposes, UUID format
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //A string coding the error type. This is given to caller so he can translate them if required.
    private String code;

    //Exact time of error
    private String timestamp;

    //A boolean that provides info is will title be shown.
    private Boolean isTitleEnabled;

    //A short localized string that describes the error.
    private String message;

    //A localized string used for error title.
    private String title;

    //A localized string used for error presentation. Label with HTML support
    private String htmlLabel;

    //A localized string used for error presentation.
    private String label;

    //A boolean that provides info is request retryable
    private Boolean retryable;

    //Describes severity of error. Order from most to least critical is: FATAL, ERROR, WARN, INFO, DEBUG, TRACE
    @Enumerated(EnumType.STRING)
    private severity severity;

/*    //Exception detailed info
    @OneToMany(mappedBy = "Error")
    private List<T> details;*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getTitleEnabled() {
        return isTitleEnabled;
    }

    public void setTitleEnabled(Boolean titleEnabled) {
        isTitleEnabled = titleEnabled;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlLabel() {
        return htmlLabel;
    }

    public void setHtmlLabel(String htmlLabel) {
        this.htmlLabel = htmlLabel;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getRetryable() {
        return retryable;
    }

    public void setRetryable(Boolean retryable) {
        this.retryable = retryable;
    }

    public severity getSeverity() {
        return severity;
    }

    public void setSeverity(severity severity) {
        this.severity = severity;
    }
}
