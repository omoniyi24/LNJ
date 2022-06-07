package com.omoniyi.lnj.model;


/**
 * @author OMONIYI ILESANMI
 */
public class SendRawTransaction {

    private String id;
    private SendRawTransactionResult result;


    public SendRawTransaction(String id, SendRawTransactionResult result){
        this.id = id;
        this.result = result;
    }
}
