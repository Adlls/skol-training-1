package com.skolopendra.training1.files.mapper

import com.skolopendra.training1.files.vo.FilesVO
import com.skolopendra.training1.core.mapper.EntityMapper
import com.skolopendra.training1.files.entities.Files
import org.mapstruct.Mapper
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.NullValuePropertyMappingStrategy


@Mapper(
    componentModel = "spring",
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
abstract class FilesMapper: EntityMapper<FilesVO, Files> { }
