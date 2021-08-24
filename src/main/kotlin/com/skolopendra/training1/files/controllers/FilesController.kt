package com.skolopendra.training1.files.controllers

import com.skolopendra.training1.files.services.FilesService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile


@RestController
@Validated
@RequestMapping("v1/files")
@Tag(name = "Взаимодействие с файлами", description = "API для взаимодействия с файлами")
class FilesController (
    private val filesService: FilesService
) {
    @Operation(summary = "Выгрузить файл")
    @PostMapping(consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun uploadFile(
        file: MultipartFile
    ) {
        filesService.uploadFile(file)
    }
}
