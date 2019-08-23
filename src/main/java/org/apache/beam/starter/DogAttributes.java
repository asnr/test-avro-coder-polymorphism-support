package org.apache.beam.starter;

import java.io.Serializable;

import org.apache.avro.reflect.Nullable;
import org.apache.beam.sdk.coders.AvroCoder;
import org.apache.beam.sdk.coders.DefaultCoder;

@DefaultCoder(AvroCoder.class)
public class DogAttributes extends AnimalAttributes implements Serializable {

    public String HairinessIndex;

    @Nullable
    public String LandSpeed;
}
