package com.bring.api.tracking.request;

import com.bring.api.exceptions.MissingParameterException;

public class TrackingQuery {

    private String queryNumber;

    private String optionalUrl;

    public TrackingQuery() {
    }
    
    public TrackingQuery(String queryNumber) {
        super();
        this.queryNumber = queryNumber;
    }


    /**
     * Required for making requests to the tracking system.
     * @param queryNumber Reference-, transmit-, or package number
     */
    public TrackingQuery withQueryNumber(String queryNumber) {
        this.queryNumber = queryNumber;
        return this;
    }

    public TrackingQuery withOptionalUrl(String optionalUrl){
        this.optionalUrl = optionalUrl;
        return this;
    }

    public String getQueryNumber() {
        return queryNumber;
    }

    public String getOptionalUrl() {
        return optionalUrl;
    }

    public boolean hasOptionalUrl(){
        return optionalUrl != null && optionalUrl.length() > 0;
    }

    public String toQueryString() {
        if(queryNumber == null){
            throw new MissingParameterException("Missing query number.");
        }
        return "?q="+queryNumber;
    }
}