package org.apache.beam.starter;

import java.io.Serializable;

import org.apache.beam.sdk.coders.AvroCoder;
import org.apache.beam.sdk.coders.DefaultCoder;

@DefaultCoder(AvroCoder.class)
public class FishAttributes extends AnimalAttributes implements Serializable {

    public Boolean Freshwater;

    public int MaxDepthInMetres;
}
