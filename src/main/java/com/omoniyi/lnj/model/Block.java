package com.omoniyi.lnj.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author OMONIYI ILESANMI
 */

@Data
@EqualsAndHashCode
public class Block {

    public int height;
    public final byte[] hash;

    public Block(final byte[] hash, final int height) {
        this.hash = hash;
        this.height = height;
    }
}
