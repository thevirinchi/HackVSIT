package com.z3t4z00k.hackvsit.netwrok;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.z3t4z00k.hackvsit.netwrok.geocode.Result;

import java.util.List;

public class GeocodeResponse {

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}