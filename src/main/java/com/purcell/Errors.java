package com.purcell;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Errors implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Error> errors = new ArrayList();

    public Errors() {
    }

    public List<Error> getErrors() {
        if(this.errors == null) {
            this.errors = new ArrayList();
        }

        return this.errors;
    }

    @JsonProperty("Errorsxx")
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public void addError(Error error) {
        this.getErrors().add(error);
    }

   /* public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
    */
}
