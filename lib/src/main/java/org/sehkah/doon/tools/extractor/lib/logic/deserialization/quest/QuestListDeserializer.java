package org.sehkah.doon.tools.extractor.lib.logic.deserialization.quest;

import org.sehkah.doon.tools.extractor.lib.common.io.FileReader;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.ExtensionMap;
import org.sehkah.doon.tools.extractor.lib.logic.deserialization.FileDeserializer;
import org.sehkah.doon.tools.extractor.lib.logic.entity.quest.QuestGroup;
import org.sehkah.doon.tools.extractor.lib.logic.entity.quest.QuestList;
import org.sehkah.doon.tools.extractor.lib.logic.entity.quest.QuestSet;
import org.sehkah.doon.tools.extractor.lib.logic.entity.quest.QuestStage;

public class QuestListDeserializer extends FileDeserializer {
    public QuestListDeserializer(FileReader fileReader) {
        super(ExtensionMap.UNSUPPORTED, fileReader);
    }

    private static QuestSet readQuestSet(FileReader fileReader) {
        return new QuestSet(
                null, // TODO
                null, //TODO
                fileReader.readSignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readMtString(),
                fileReader.readUnsignedInteger(),
                fileReader.readUnsignedInteger(),
                fileReader.readBoolean()
        );
    }

    private static QuestGroup readQuestGroup(FileReader fileReader) {
        return new QuestGroup(
                fileReader.readArray(QuestListDeserializer::readQuestSet),
                fileReader.readMtString(),
                fileReader.readUnsignedInteger(),
                fileReader.readSignedInteger(),
                fileReader.readSignedInteger()
        );
    }


    private static QuestStage readQuestStage(FileReader fileReader) {
        return new QuestStage(
                fileReader.readSignedInteger(),
                fileReader.readArray(QuestListDeserializer::readQuestGroup)
        );
    }

    private static QuestList readEntity(FileReader fileReader) {
        return new QuestList(
                fileReader.readBoolean(),
                fileReader.readArray(QuestListDeserializer::readQuestStage)
        );
    }

    @Override
    protected Object readObject() {
        return readEntity(fileReader);
    }

    @Override
    protected Object readObjectWithMetaInformation() {
        return readObject();
    }
}
