package com.ht.demozad.Error;

import java.util.List;

//Default error message template
public class Error {

    //Unique error ID, used for logging purposes, UUID format
    private String id;

    //A string coding the error type. This is given to caller so he can translate them if required.
    private String code;

    //Exact time of error
    private String timestamp;

    //A boolean that provides info is will title be shown.
    private Boolean isTitleEnabeled;

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
    private String severity;

    //Exception detailed info
    private List details;
}
