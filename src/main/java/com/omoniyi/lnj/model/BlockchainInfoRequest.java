package com.omoniyi.lnj.model;


/**
 * @author OMONIYI ILESANMI
 */
public class BlockchainInfoRequest {

    private int blocks;
    private String bestBlockHash;

    BlockchainInfoRequest(int blocks, String bestBlockHash){
        this.blocks = blocks;
        this.bestBlockHash = bestBlockHash;
    }
}
