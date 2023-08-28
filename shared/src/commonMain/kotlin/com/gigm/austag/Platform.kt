package com.gigm.austag

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform