package com.marketplacebook.extension

import com.marketplacebook.controller.request.PostBookRequest
import com.marketplacebook.controller.request.PostCustomerRequest
import com.marketplacebook.controller.request.PutBookRequest
import com.marketplacebook.controller.request.PutCustomerRequest
import com.marketplacebook.enums.BookStatus
import com.marketplacebook.enums.CustomerStatus
import com.marketplacebook.model.BookModel
import com.marketplacebook.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email, status = CustomerStatus.ATIVO)
}

fun PutCustomerRequest.toCustomerModel(previousValue: CustomerModel): CustomerModel {
    return CustomerModel(id = previousValue.id, name = this.name, email = this.email, status = previousValue.status)
}

fun PostBookRequest.toBookModel(customer: CustomerModel): BookModel {
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
        customer = customer
    )
}
fun PutBookRequest.toBookModel(previousValue: BookModel): BookModel {
    return BookModel(
        id = previousValue.id,
        name = this.name ?: previousValue.name,
        price = this.price ?: previousValue.price,
        status = previousValue.status,
        customer = previousValue.customer

    )
}