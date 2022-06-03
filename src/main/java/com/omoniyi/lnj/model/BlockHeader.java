package com.omoniyi.lnj.model;

import lombok.Data;

/**
 * @author OMONIYI ILESANMI
 */
@Data
public class BlockHeader {

    public final int height;
    public final byte[] data;

    public BlockHeader(final int height, final byte[] data) {
        this.height = height;
        this.data = data;
    }
}
