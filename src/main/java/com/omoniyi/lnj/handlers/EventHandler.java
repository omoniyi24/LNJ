//package com.omoniyi.lnj.handlers;
//
//import com.omoniyi.lnj.effects.Effects;
//import com.omoniyi.lnj.service.bitcoin.BitcoinClient;
//import org.bitcoinj.core.*;
//import org.bitcoinj.script.Script;
//import org.bouncycastle.util.encoders.Hex;
//import org.ldk.batteries.ChannelManagerConstructor;
//import org.ldk.structs.ChannelManager;
//import org.ldk.structs.Event;
//import org.ldk.structs.FeeEstimator;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.nio.file.Path;
//
//import static org.bitcoinj.core.NetworkParameters.ID_REGTEST;
//
///**
// * @author OMONIYI ILESANMI
// */
////@Service
//public class EventHandler implements ChannelManagerConstructor.EventHandler{
//
//    final BitcoinClient bitcoinClient;
//    final ChannelManagerConstructor channelManagerConstructor;
//    final Effects effects;
//    final FeeEstimator feeEstimator;
//
//
//    public EventHandler(BitcoinClient bitcoinClient, ChannelManagerConstructor channelManagerConstructor, Effects effects, FeeEstimator feeEstimator) {
//        this.bitcoinClient = bitcoinClient;
//        this.channelManagerConstructor = channelManagerConstructor;
//        this.effects = effects;
//        this.feeEstimator = feeEstimator;
//    }
//
//    @Override
//    public void handle_event(Event e) {
//        final String refundAddress = "";
//        final ChannelManager channelManager= channelManagerConstructor.channel_manager;
//        final var params = NetworkParameters.fromID(ID_REGTEST);
//        if (e instanceof Event.FundingGenerationReady) {
//            var event = (Event.FundingGenerationReady) e;
//            final var transaction = new Transaction(params);
//            final var input = new TransactionInput(params, transaction, new byte[0]);
//            input.setWitness(new TransactionWitness(2));
//            input.getWitness().setPush(0, new byte[]{0x1});
//            transaction.addInput(input);
//            final var script = new Script(event.output_script);
//            final var value = Coin.SATOSHI.multiply(event.channel_value_satoshis);
//            transaction.addOutput(value, script);
//            channelManager.funding_transaction_generated(event.temporary_channel_id, transaction.bitcoinSerialize());
//        }
//        else if (e instanceof Event.PaymentReceived) {
//            var event = (Event.PaymentReceived) e;
//            System.out.printf("Payment of %s SAT received.%n", event.amt);
//            channelManager.claim_funds(event.payment_hash);
//        }
//        else if (e instanceof Event.PaymentSent) {
//            var event = (Event.PaymentSent) e;
//            System.out.printf("Payment with preimage '%s' sent.%n", Hex.toHexString(event.payment_preimage));
//        }
//        else if (e instanceof Event.PaymentPathFailed) {
//            var event = (Event.PaymentPathFailed) e;
//            System.out.printf("Payment path with payment hash '%s' failed.%n", Hex.toHexString(event.payment_hash));
//        }
//        else if (e instanceof Event.PendingHTLCsForwardable) {
//            var event = (Event.PendingHTLCsForwardable) e;
//            channelManager.process_pending_htlc_forwards();
//        }
//        else if (e instanceof Event.SpendableOutputs) {
//            // <insert code to handle this event>
//        }
//        else if (e instanceof Event.PaymentForwarded) {
//            // <insert code to handle this event>
//        }
//        else if (e instanceof Event.ChannelClosed) {
//            // <insert code to handle this event>
//        }
//    }
//
//    @Override
//    public void persist_manager(byte[] channel_manager_bytes) {
//        try
//        {
//            effects.persist(channel_manager_bytes, Path.of("manager"), Path.of("data"));
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void persist_network_graph(byte[] network_graph) {
//        try
//        {
//            effects.persist(network_graph, Path.of("network"), Path.of("data"));
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//    }
//}
