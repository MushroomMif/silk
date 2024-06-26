package net.silkmc.silk.core.serialization.serializers

import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import net.minecraft.resources.ResourceLocation
import net.silkmc.silk.core.serialization.SilkSerializer

@Deprecated("Has been renamed to ResourceLocationSerializer", replaceWith = ReplaceWith("ResourceLocationSerializer"))
typealias IdentifierSerializer = ResourceLocationSerializer

class ResourceLocationSerializer : SilkSerializer<ResourceLocation>() {
    override fun deserialize(decoder: Decoder): ResourceLocation {
        return ResourceLocation.bySeparator(decoder.decodeString(), ':')
    }

    override fun serialize(encoder: Encoder, value: ResourceLocation) {
        encoder.encodeString("${value.namespace}:${value.path}")
    }
}
