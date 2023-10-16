package com.marketplacebook.controller.response

data class ErrorResponse(
    var HttpcCode: Int,
    var message: String,
    var internalCode: String,
    var errors: List<FieldErrorResponse>?
)
