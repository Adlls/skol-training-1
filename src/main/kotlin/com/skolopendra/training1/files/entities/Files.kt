package com.skolopendra.training1.files.entities

import com.skolopendra.training1.files.enums.UploadStatus
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "files")
data class Files(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "upload_status")
    @Enumerated(EnumType.STRING)
    var uploadStatus: UploadStatus? = null,
    @Column(name = "id_file")
    var idFile: Long? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: ZonedDateTime? = null,
    @CreationTimestamp
    @Column(name = "created_at")
    var createdAt: ZonedDateTime? = null
)
