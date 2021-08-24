package com.skolopendra.training1.files.entities

import com.skolopendra.training1.files.enums.UploadStatus
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "files")
data class Files(
    @Id
    var id: Long? = null,
    @Column(name = "upload_status")
    var uploadStatus: UploadStatus? = null
)
