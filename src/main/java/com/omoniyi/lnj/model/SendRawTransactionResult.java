package com.omoniyi.lnj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author OMONIYI ILESANMI
 */
public class SendRawTransactionResult {

    private String txid;

    public SendRawTransactionResult(@JsonProperty("hex") String txid){
        this.txid = txid;
    }
}
