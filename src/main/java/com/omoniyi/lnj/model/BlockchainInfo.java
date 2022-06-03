package com.omoniyi.lnj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BlockchainInfo {
    private String id;
    private BlockchainInfoRequest result;

    BlockchainInfo(String id, @JsonProperty("bestblockhash") BlockchainInfoRequest result){
        this.id = id;
        this.result = result;
    }
}
