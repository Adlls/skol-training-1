package com.skolopendra.training1.files.entities

import com.skolopendra.training1.files.enums.UploadStatus
import javax.persistence.*

@Entity
@Table(name = "files")
data class Files(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "upload_status")
    @Enumerated(EnumType.STRING)
    var uploadStatus: UploadStatus? = null
)
