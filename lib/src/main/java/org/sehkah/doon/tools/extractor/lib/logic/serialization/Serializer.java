package org.sehkah.doon.tools.extractor.lib.logic.serialization;


import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;
import org.sehkah.doon.tools.extractor.lib.common.error.SerializerException;

public interface Serializer<T extends TopLevelClientResource> {
    String serialize(T deserialized) throws SerializerException;

    T deserialize(String serialized, Class<T> cls);

    byte[] serializeResource(T deserialized) throws SerializerException;
}
