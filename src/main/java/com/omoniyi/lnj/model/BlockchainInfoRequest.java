package com.omoniyi.lnj.model;

import lombok.Data;

/**
 * @author OMONIYI ILESANMI
 */
@Data
public class BlockchainInfoRequest {

    private int blocks;
    private String bestBlockHash;

    BlockchainInfoRequest(int blocks, String bestBlockHash){
        this.blocks = blocks;
        this.bestBlockHash = bestBlockHash;
    }
}
