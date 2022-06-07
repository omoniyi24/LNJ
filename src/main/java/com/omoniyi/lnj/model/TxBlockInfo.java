package com.omoniyi.lnj.model;


/**
 * @author OMONIYI ILESANMI
 */

public class TxBlockInfo {

    public final Block block;
    public final byte[] data;
    public final byte[] id;

    public TxBlockInfo(final byte[] blockHash, final int blockHeight, final long index, final byte[] data, final byte[] id) {
        this.id = id;
        this.block = new Block(blockHash, blockHeight);
        this.data = data;
    }
}
