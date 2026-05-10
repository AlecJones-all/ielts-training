package com.example.ieltstraining.common

data class Result<T>(
    val code: Int,
    val message: String,
    val data: T?
) {
    companion object {
        fun <T> success(data: T): Result<T> {
            return Result(200, "success", data)
        }

        fun fail(message: String): Result<Nothing> {
            return Result(500, message, null)
        }
    }
}