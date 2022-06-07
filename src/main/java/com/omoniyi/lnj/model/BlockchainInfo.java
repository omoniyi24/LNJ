package com.omoniyi.lnj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockchainInfo {
    private String id;
    private BlockchainInfoRequest result;

    BlockchainInfo(String id, @JsonProperty("bestblockhash") BlockchainInfoRequest result){
        this.id = id;
        this.result = result;
    }
}
