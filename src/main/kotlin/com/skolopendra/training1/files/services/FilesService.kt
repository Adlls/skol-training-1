package com.skolopendra.training1.files.services

import com.skolopendra.training1.files.vo.FilesVO
import com.skolopendra.training1.files.entities.Files
import com.skolopendra.training1.files.enums.UploadStatus
import com.skolopendra.training1.files.mapper.FilesMapper
import com.skolopendra.training1.files.repositories.FilesRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class FilesService(
    private val filesRepository: FilesRepository,
    private val fileMapper: FilesMapper
) {

    fun uploadFile(file: MultipartFile, idFile: Long): FilesVO =
        filesRepository.save(
            Files(
                uploadStatus = UploadStatus.IS_DONE,
                idFile = idFile
            )
        ).let(fileMapper::toDto)
}
