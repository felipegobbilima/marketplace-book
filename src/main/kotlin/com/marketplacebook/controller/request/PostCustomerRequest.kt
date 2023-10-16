package com.marketplacebook.controller.request

import com.marketplacebook.validation.EmailAvailable
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class PostCustomerRequest (
    @field:NotEmpty(message = "must not be empty")
    var name: String,

    @field:Email(message = "must be a well-formed email address")
    @EmailAvailable
    var email: String
)