package com.marketplacebook.controller.response

import com.marketplacebook.enums.BookStatus
import com.marketplacebook.model.CustomerModel
import java.math.BigDecimal

data class BookResponse (

    var id: Int? = null,

    var name: String,

    var price: BigDecimal,

    var customer: CustomerModel? = null,

    var status: BookStatus? = null
)
