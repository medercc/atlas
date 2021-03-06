package org.openstreetmap.atlas.tags.names;

import org.openstreetmap.atlas.tags.annotations.Tag;
import org.openstreetmap.atlas.tags.annotations.Tag.Validation;
import org.openstreetmap.atlas.tags.annotations.TagKey;

/**
 * OSM old_ref tag
 *
 * @author cstaylor
 */
@Tag(value = Validation.NON_EMPTY_STRING, taginfo = "http://taginfo.openstreetmap.org/keys/old_ref#values", osm = "http://wiki.openstreetmap.org/wiki/Key:ref")
public interface HistoricallyReferencedAsTag
{
    @TagKey
    String KEY = "old_ref";
}
