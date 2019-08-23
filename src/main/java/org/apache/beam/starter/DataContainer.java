package org.apache.beam.starter;

import java.io.Serializable;

import org.apache.avro.reflect.Nullable;
import org.apache.beam.sdk.coders.AvroCoder;
import org.apache.beam.sdk.coders.DefaultCoder;

@DefaultCoder(AvroCoder.class)
public class DataContainer implements Serializable {

    @Nullable
    public String MessageID;

    @Nullable
    public Integer MessageVersion;

    @Nullable
    public AnimalAttributes Attributes;
}
