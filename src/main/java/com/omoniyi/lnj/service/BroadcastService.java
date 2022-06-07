//package com.omoniyi.lnj.service;
//
//import com.omoniyi.lnj.model.BitcoinRequests;
//import com.omoniyi.lnj.model.SendRawTransaction;
//import com.omoniyi.lnj.service.bitcoin.BitcoinClient;
//import org.bitcoinj.core.NetworkParameters;
//import org.bitcoinj.core.Transaction;
//import org.ldk.structs.BroadcasterInterface;
//import org.springframework.stereotype.Service;
//
///**
// * @author OMONIYI ILESANMI
// */
////@Service
//public class BroadcastService implements BroadcasterInterface.BroadcasterInterfaceInterface{
//
//    private final BitcoinClient bitcoinClient;
//
//    public BroadcastService(BitcoinClient bitcoinClient) {
//        this.bitcoinClient = bitcoinClient;
//    }
//
//    @Override
//    public void broadcast_transaction(byte[] transactionBytes) {
//        broadcastTx(new Transaction(NetworkParameters.fromID(NetworkParameters.ID_REGTEST), transactionBytes));
//    }
//
//    private void broadcastTx(Transaction tx) {
//        System.out.printf("before broadcast txid %s%n", tx.getTxId());
//        final SendRawTransaction sendRawTransaction = bitcoinClient
//                .sendRawTransaction(
//                        BitcoinRequests.sendRawTransaction(tx.bitcoinSerialize())
//                );
//        System.out.printf("broadcast %s%n", sendRawTransaction.getResult().getTxid());
//    }
//}
