package org.sehkah.doon.tools.extractor.lib.common.io;

import org.sehkah.doon.tools.extractor.lib.common.datatype.Float2f;
import org.sehkah.doon.tools.extractor.lib.common.datatype.Vector3f;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public interface FileWriter {
    byte[] getBytes();

    void writeUnsignedByte(int value);

    void writeSignedByte(byte value);

    void writeBoolean(boolean value);

    void writeUnsignedShort(int value);

    void writeSignedShort(short value);

    void writeUnsignedInteger(long value);

    void writeUnsignedInteger(long[] value);

    void writeSignedInteger(int value);

    void writeUnsignedLong(BigInteger value);

    void writeFloat(float value);

    void writeFloat(float[] value);

    void writeVector3f(Vector3f value);

    void writeVector3f(Vector3f[] value);

    void writeFloat2f(Float2f value);

    void writeString(String value, Charset charset);

    void writeString(String value);

    void writeNullTerminatedString(String value, Charset charset);

    void writeNullTerminatedString(String value);

    void writeMtString(String value);

    void writeMtString(String value, Charset charset);

    <E> void writeArray(List<E> value, Function<FileWriter, E> entityWriterFunction);

    <E> void writeArray(List<E> value, IntFunction<Void> arraySizeWriterFunction, Function<FileWriter, E> entityWriterFunction);

}
