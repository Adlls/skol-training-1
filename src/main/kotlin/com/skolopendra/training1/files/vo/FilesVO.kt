package com.skolopendra.training1.files.vo

import com.skolopendra.training1.files.enums.UploadStatus

class FilesVO(
    var id: Long? = null,
    var uploadStatus: UploadStatus? = null,
    var idFile: Long? = null
)
