package com.pomodoro.adapter

data class Stopwatch(
    val id: Int,
    var currentMs: Long,
    var isStarted: Boolean
)