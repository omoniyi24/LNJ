package com.omoniyi.lnj.service.bitcoin.impl;

import com.omoniyi.lnj.model.BitcoinRequest;
import com.omoniyi.lnj.model.GetRawTransaction;
import com.omoniyi.lnj.model.SendRawTransaction;
import com.omoniyi.lnj.model.TxBlockInfo;
import com.omoniyi.lnj.service.bitcoin.BitcoinClient;

/**
 * @author OMONIYI ILESANMI
 */
public class BitcoinClientImpl implements BitcoinClient {
    @Override
    public boolean isSynced() {
        return false;
    }

    @Override
    public int blockHeight() {
        return 0;
    }

    @Override
    public int blockHeight(byte[] blockHash) {
        return 0;
    }

    @Override
    public byte[] blockHash(int height) {
        return new byte[0];
    }

    @Override
    public void publish(byte[] transaction) {

    }

    @Override
    public boolean isConfirmed(byte[] txid) {
        return false;
    }

    @Override
    public TxBlockInfo blockchainInfo(byte[] txid) {
        return null;
    }

    @Override
    public long blockIndex(byte[] blockHash, byte[] txid) {
        return 0;
    }

    @Override
    public SendRawTransaction sendRawTransaction(BitcoinRequest req) {
        return null;
    }

    @Override
    public GetRawTransaction getRawTransaction(BitcoinRequest req) {
        return null;
    }
}
