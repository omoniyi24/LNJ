//package com.omoniyi.lnj.service;
//
//import com.omoniyi.lnj.effects.Effects;
//import org.bouncycastle.util.encoders.Hex;
//import org.ldk.structs.*;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.nio.file.Path;
//
//import static org.ldk.enums.ChannelMonitorUpdateErr.LDKChannelMonitorUpdateErr_PermanentFailure;
//import static org.ldk.structs.Result_NoneChannelMonitorUpdateErrZ.err;
//import static org.ldk.structs.Result_NoneChannelMonitorUpdateErrZ.ok;
//
///**
// * @author OMONIYI ILESANMI
// */
////@Service
//public class PersistenceService implements Persist.PersistInterface {
//
//    private final Effects effects;
//
//    public PersistenceService(Effects effects) {
//        this.effects = effects;
//    }
//
//    @Override
//    public Result_NoneChannelMonitorUpdateErrZ persist_new_channel(OutPoint channel_id, ChannelMonitor data, MonitorUpdateId update_id) {
//        return persist(channel_id, data.write());
//    }
//
//    @Override
//    public Result_NoneChannelMonitorUpdateErrZ update_persisted_channel(OutPoint channel_id, ChannelMonitorUpdate update, ChannelMonitor data, MonitorUpdateId update_id) {
//        return persist(channel_id, data.write());
//    }
//
//    private Result_NoneChannelMonitorUpdateErrZ persist(OutPoint id, byte[] data)
//    {
//        try
//        {
//            final var filename = String.format(
//                    "%s_%d"
//                    , Hex.toHexString(id.get_txid())
//                    , id.get_index()
//            );
//            effects.persist(data, Path.of("monitors", filename), Path.of("data"));
//            return ok();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//            return err(LDKChannelMonitorUpdateErr_PermanentFailure);
//        }
//    }
//}
