package com.architect.kmpmvvm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform