package com.omoniyi.lnj.model;



/**
 * @author OMONIYI ILESANMI
 */

public class Block {

    public int height;
    public final byte[] hash;

    public Block(final byte[] hash, final int height) {
        this.hash = hash;
        this.height = height;
    }
}
