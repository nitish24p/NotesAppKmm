package com.simpletech.notesapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform