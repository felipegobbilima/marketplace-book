package com.marketplacebook.enums

enum class Errors(val code: String, val message: String) {
    MP001("MP-001", message ="Invalid Request"),
    MP101("MP-101", message = "Book [%s] not exists"),
    MP102("MP-102", message = "Cannot update book with status [%s]"),
    MP201("MP-201", message = "Customer [%s] not exists")


}