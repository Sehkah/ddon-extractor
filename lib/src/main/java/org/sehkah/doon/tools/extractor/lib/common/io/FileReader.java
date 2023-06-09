package org.sehkah.doon.tools.extractor.lib.common.io;

import org.sehkah.doon.tools.extractor.lib.common.datatype.Float2f;
import org.sehkah.doon.tools.extractor.lib.common.datatype.Vector3f;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToLongFunction;

public interface FileReader {
    int getPosition();

    int getLimit();

    boolean hasRemaining();

    int getRemainingCount();

    int readUnsignedByte();

    byte readSignedByte();

    byte[] readSignedByte(int num);

    boolean readBoolean();

    int readUnsignedShort();

    short readSignedShort();

    long readUnsignedInteger();

    long[] readUnsignedInteger(int num);

    int readSignedInteger();

    BigInteger readUnsignedLong();

    long readSignedLong();

    float readFloat();

    float[] readFloat(int num);

    double readDouble();

    Vector3f readVector3f();

    Vector3f[] readVector3f(int num);

    Float2f readFloat2f();

    String readNullTerminatedString(Charset charset);

    String readNullTerminatedString();

    String readString(int length);

    String readString(long length);

    String readString(long length, Charset charset);

    String readString(int length, Charset charset);

    String readMtString();

    String readMtString(Charset charset);

    <E> List<E> readArray(Function<FileReader, E> entityReaderFunction);

    <E> List<E> readArray(ToLongFunction<FileReader> arraySizeFunction, Function<FileReader, E> entityReaderFunction);

    void rewind(int i);
}
