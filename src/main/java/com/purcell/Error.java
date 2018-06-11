package com.purcell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"requestId", "source", "reasonCode", "description", "recoverable", "details"})
@JsonIgnoreProperties({"key"})
public class Error implements Serializable {
    static final long serialVersionUID = 1L;
    private String source;
    private String reasonCode;
    private String key;
    private String description;
    private Boolean recoverable;
    private String requestId;
    private List<Detail> details;

    public Error() {
        this.source = null;
        this.reasonCode = null;
        this.key = null;
        this.description = null;
        this.recoverable = null;
        this.requestId = null;
        this.details = null;
    }

    public Error(String source, String reasonCode) {
        this(source, reasonCode, (String)null);
    }

    public Error(String source, String reasonCode, String description) {
        this(source, reasonCode, description, Boolean.valueOf(false));
    }

    public Error(String source, String reasonCode, String description, Boolean recoverable) {
        this.source = null;
        this.reasonCode = null;
        this.key = null;
        this.description = null;
        this.recoverable = null;
        this.requestId = null;
        this.details = null;
        this.source = source;
        this.reasonCode = reasonCode;
        this.description = description;
        this.recoverable = recoverable;
    }

    @JsonProperty("Source")
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("ReasonCode")
    public String getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @XmlTransient
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Recoverable")
    public Boolean getRecoverable() {
        return this.recoverable;
    }

    public void setRecoverable(Boolean recoverable) {
        this.recoverable = recoverable;
    }

    @JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("Details")
    public List<Detail> getDetails() {
        return this.details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

   /* public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
    */
}
