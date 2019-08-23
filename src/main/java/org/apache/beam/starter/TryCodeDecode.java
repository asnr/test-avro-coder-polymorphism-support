package org.apache.beam.starter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.beam.sdk.coders.AvroCoder;

public class TryCodeDecode {
    public static void main(String[] argv) {
        DogAttributes dogAttrs = new DogAttributes();
        dogAttrs.HairinessIndex = "OMG soooooo hairy";
        DataContainer notification = new DataContainer();
        notification.Attributes = dogAttrs;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        AvroCoder<DataContainer> coder = AvroCoder.<DataContainer>of(DataContainer.class);

        System.out.println("Schema = \n" + coder.getSchema().toString());
        try {
            coder.encode(notification, outputStream);
        } catch(IOException exception) {
            System.out.println("ENCODE EXCEPTION");
        }

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        DataContainer decoded = null;
        try {
            decoded = coder.decode(inputStream);
        } catch(IOException exception) {
            System.out.println("DECODE EXCEPTION");
        }

        System.out.println("\nHairinessIndex = " + ((DogAttributes)decoded.Attributes).HairinessIndex);
        System.out.println("Done");
    }
}
