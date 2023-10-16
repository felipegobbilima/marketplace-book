package com.marketplacebook.exception

class NotFoundException(override val message: String, val errorCode: String): Exception() {
}