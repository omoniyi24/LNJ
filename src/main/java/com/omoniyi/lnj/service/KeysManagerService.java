//package com.omoniyi.lnj.service;
//
//import com.omoniyi.lnj.effects.Effects;
//import org.ldk.structs.KeysManager;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @author OMONIYI ILESANMI
// */
//public class KeysManagerService {
//
//    private final Effects effects;
//
//    public KeysManagerService(Effects effects) {
//        this.effects = effects;
//    }
//
//    KeysManager onStart() {
//        final long startupTime = effects.time();
//        return KeysManager.of(
//                effects.seed()
//                , TimeUnit.MILLISECONDS.toSeconds(startupTime)
//                , (int) TimeUnit.MILLISECONDS.toNanos(startupTime)
//        );
//    }
//}
