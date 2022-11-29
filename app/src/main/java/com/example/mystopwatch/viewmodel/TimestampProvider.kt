package com.example.mystopwatch.viewmodel

interface TimestampProvider {
    fun getMilliseconds(): Long
}