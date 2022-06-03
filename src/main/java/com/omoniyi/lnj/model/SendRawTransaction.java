package com.omoniyi.lnj.model;

import lombok.Data;

/**
 * @author OMONIYI ILESANMI
 */
@Data
public class SendRawTransaction {

    private String id;
    private SendRawTransactionResult result;


    public SendRawTransaction(String id, SendRawTransactionResult result){
        this.id = id;
        this.result = result;
    }
}
