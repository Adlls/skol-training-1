package com.skolopendra.training_1.upload_files.entities

import com.skolopendra.training_1.upload_files.enums.UploadStatus
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "files")
data class Files(
    @Id
    var id: Long? = null,
    var upload_status: UploadStatus? = null
)
