package com.omoniyi.lnj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author OMONIYI ILESANMI
 */
public class GetRawTransactionRequest {

    private String txid;

    public GetRawTransactionRequest(@JsonProperty("hex") String txid){
        this.txid = txid;
    }
}
