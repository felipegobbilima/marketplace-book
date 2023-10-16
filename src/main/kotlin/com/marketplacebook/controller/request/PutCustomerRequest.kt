package com.marketplacebook.controller.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class PutCustomerRequest (
    @field:NotEmpty(message = "must not be empty")
    var name: String,

    @field:Email(message = "must be a well-formed email address")
    var email: String
)