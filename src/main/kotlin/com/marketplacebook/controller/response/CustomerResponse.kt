package com.marketplacebook.controller.response

import com.marketplacebook.enums.CustomerStatus

data class CustomerResponse (
    var id: Int? = null,

    var name: String,

    var email: String,

    var status: CustomerStatus
)
