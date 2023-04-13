package otarbakh.beerpaging3cache.data.mappers

import otarbakh.beerpaging3cache.data.local.BeerEntity
import otarbakh.beerpaging3cache.data.remote.BeerDto
import otarbakh.beerpaging3cache.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}