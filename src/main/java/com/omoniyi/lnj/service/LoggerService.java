package com.omoniyi.lnj.service;

import org.ldk.structs.Logger;
import org.ldk.structs.Record;

/**
 * @author OMONIYI ILESANMI
 */
public class LoggerService implements Logger.LoggerInterface{
    @Override
    public void log(Record record) {
        System.out.println(String.format("[%s] %s", record.get_level(), record.get_args()));
    }
}
