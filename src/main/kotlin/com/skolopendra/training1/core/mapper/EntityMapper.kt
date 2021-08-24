package com.skolopendra.training1.core.mapper

import org.mapstruct.Mapping
import org.mapstruct.MappingTarget
import org.mapstruct.Mappings

/**
 * Contract for a generic dto to entity mapper.
 *
 * @param D DTO type parameter.
 * @param E Entity type parameter.
 */
interface EntityMapper<D, E> {
    @Mappings(
        Mapping(target = "id", ignore = true)
    )
    fun toEntity(dto: D): E

    @Mappings(
        Mapping(target = "id")
    )
    fun toDto(entity: E): D

    fun toEntity(dtoList: MutableList<D>): MutableList<E>

    fun toDto(entityList: MutableList<E>): MutableList<D>

    @Mappings(
        Mapping(target = "id", ignore = true)
    )
    fun updateEntityFromDTO(dto: D, @MappingTarget entity: E): E
}
