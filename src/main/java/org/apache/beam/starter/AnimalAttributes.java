package org.apache.beam.starter;

import java.io.Serializable;

import org.apache.avro.reflect.Nullable;
import org.apache.avro.reflect.Union;

// This @Union is the secret sauce. Without this, you'll get
// java.lang.InstantiationException when decoding concrete subclasses of
// AnimalAttributes.
@Union(value = { DogAttributes.class, FishAttributes.class })
public abstract class AnimalAttributes implements Serializable {

    @Nullable
    public String Phylum;

    @Nullable
    public String Species;
}
