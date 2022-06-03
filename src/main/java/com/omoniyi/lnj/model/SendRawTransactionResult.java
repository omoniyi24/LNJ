package com.omoniyi.lnj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author OMONIYI ILESANMI
 */
@Data
public class SendRawTransactionResult {

    private String txid;

    public SendRawTransactionResult(@JsonProperty("hex") String txid){
        this.txid = txid;
    }
}
