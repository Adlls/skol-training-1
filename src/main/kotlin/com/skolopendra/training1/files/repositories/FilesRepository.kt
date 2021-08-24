package com.skolopendra.training1.files.repositories

import com.skolopendra.training1.files.entities.Files
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FilesRepository: JpaRepository<Files, Long> {

}
