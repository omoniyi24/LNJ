//package com.omoniyi.lnj.service;
//
//import com.omoniyi.lnj.effects.Effects;
//import com.omoniyi.lnj.model.BitcoinRequests;
//import com.omoniyi.lnj.model.BlockchainInfo;
//import com.omoniyi.lnj.service.bitcoin.BitcoinClient;
//import org.bouncycastle.util.encoders.Hex;
//import org.ldk.batteries.ChannelManagerConstructor;
//import org.ldk.enums.Network;
//import org.ldk.structs.*;
//
//import java.nio.file.Path;
//
//public class ChannelManagerConstructorService
//{
//
//    private final BitcoinClient bitcoinService;
//
//    private final BroadcasterInterface broadcaster;
//
//    private final ChainMonitor chainMonitor;
//
//    private final Effects effects;
//
//    private final FeeEstimator feeEstimator;
//
//    private final KeysManager keysManager;
//
//    private final Logger logger;
//
//    public ChannelManagerConstructorService(BitcoinClient bitcoinService, BroadcasterInterface broadcaster,
//                                            ChainMonitor chainMonitor, Effects effects, FeeEstimator feeEstimator,
//                                            KeysManager keysManager, Logger logger) {
//        this.bitcoinService = bitcoinService;
//        this.broadcaster = broadcaster;
//        this.chainMonitor = chainMonitor;
//        this.effects = effects;
//        this.feeEstimator = feeEstimator;
//        this.keysManager = keysManager;
//        this.logger = logger;
//    }
//
//    ChannelManagerConstructor channelManagerConstructor()
//    {
//        System.out.println("ChannelManagerConstructorFactory.channelManagerConstructor()");
//        final BlockchainInfo blockchainInfo = bitcoinService.blockchainInfo(BitcoinRequests.getBlockchainInfo());
//        final byte[] channelManagerBytes = effects.readAllBytes("manager", Path.of("data"));
//        final byte[][] channelMonitors = effects.readDirectory("monitors", Path.of("data"));
//        if (channelManagerBytes.length == 0)
//        {
//            return new ChannelManagerConstructor(
//                Network.LDKNetwork_Regtest
//                , UserConfig.with_default()
//                , Hex.decode(blockchainInfo.getResult().getBestBlockHash())
//                , blockchainInfo.getResult().getBlocks()
//                , keysManager.as_KeysInterface()
//                , feeEstimator
//                , chainMonitor
//                , null // net graph
//                , broadcaster
//                , logger
//            );
//        }
//        else
//        {
//            try
//            {
//                return new ChannelManagerConstructor(
//                    channelManagerBytes
//                    , channelMonitors
//                    , UserConfig.with_default()
//                    , keysManager.as_KeysInterface()
//                    , feeEstimator
//                    , chainMonitor
//                    , null // filter
//                    , null // net graph
//                    , broadcaster
//                    , logger
//                );
//            }
//            catch (ChannelManagerConstructor.InvalidSerializedDataException e)
//            {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
