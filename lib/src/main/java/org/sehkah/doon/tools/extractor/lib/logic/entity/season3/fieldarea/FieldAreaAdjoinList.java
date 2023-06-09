package org.sehkah.doon.tools.extractor.lib.logic.entity.season3.fieldarea;

import org.sehkah.doon.tools.extractor.lib.common.entity.TopLevelClientResource;

import java.util.List;

public record FieldAreaAdjoinList(
        short FieldAreaId,
        List<AdjoinInfo> Array
) implements TopLevelClientResource {
}
