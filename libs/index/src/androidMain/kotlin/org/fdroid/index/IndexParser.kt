package org.fdroid.index

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.decodeFromStream
import org.fdroid.index.v1.IndexV1
import org.fdroid.index.v2.EntryV2
import org.fdroid.index.v2.IndexV2
import java.io.InputStream

@OptIn(ExperimentalSerializationApi::class)
public fun IndexParser.parseV1(inputStream: InputStream): IndexV1 {
    return json.decodeFromStream(inputStream)
}

@OptIn(ExperimentalSerializationApi::class)
public fun IndexParser.parseV2(inputStream: InputStream): IndexV2 {
    return json.decodeFromStream(inputStream)
}

@OptIn(ExperimentalSerializationApi::class)
public fun IndexParser.parseEntryV2(inputStream: InputStream): EntryV2 {
    return json.decodeFromStream(inputStream)
}
