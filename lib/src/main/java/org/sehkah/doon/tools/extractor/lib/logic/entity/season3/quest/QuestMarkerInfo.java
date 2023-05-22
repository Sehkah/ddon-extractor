package org.sehkah.doon.tools.extractor.lib.logic.entity.season3.quest;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;

import java.util.List;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Getter
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public final class QuestMarkerInfo extends TopLevelClientResource {
    private final long StageNo;
    private final List<QuestMarkerInfoInfo> InfoList;

}
