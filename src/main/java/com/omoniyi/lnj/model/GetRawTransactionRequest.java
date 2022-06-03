package com.omoniyi.lnj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author OMONIYI ILESANMI
 */
@Data
public class GetRawTransactionRequest {

    private String txid;

    public GetRawTransactionRequest(@JsonProperty("hex") String txid){
        this.txid = txid;
    }
}
