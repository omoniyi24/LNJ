package com.omoniyi.lnj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRawTransaction{


    private String id;
    private GetRawTransactionRequest result;

    GetRawTransaction(String id, GetRawTransactionRequest result){
        this.id = id;
        this.result = result;
    }
}
