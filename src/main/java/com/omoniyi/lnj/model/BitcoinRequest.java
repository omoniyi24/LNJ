package com.omoniyi.lnj.model;

import lombok.Data;

import java.util.List;

@Data
public class BitcoinRequest{

    private String jsonrpc;
    private String id;
    private String method;
    private List<String> params;

    BitcoinRequest(String jsonrpc, String id, String method, List<String> params){
        this.jsonrpc = jsonrpc;
        this.id = id;
        this.method = method;
        this.params = params;
    }
}
