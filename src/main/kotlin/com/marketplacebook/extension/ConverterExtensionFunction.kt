package com.marketplacebook.extension

import com.marketplacebook.controller.request.PostCustomerRequest
import com.marketplacebook.controller.request.PutCustomerRequest
import com.marketplacebook.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}