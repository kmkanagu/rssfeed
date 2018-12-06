package com.kanagaraj.rssfeed.logger

import android.util.Log

/**
 * Created by kanagaraj on 23/11/18.
 */
object Logger {

    enum class LogType {
        DEBUG,
        ERROR,
        INFO
    }

    fun debug(tag: Any, vararg params: String) {
        printLog(tag, LogType.DEBUG, params)
    }

    fun error(tag: Any, vararg params: String) {
        printLog(tag, LogType.ERROR, params)
    }

    fun info(tag: Any, vararg params: String) {
        printLog(tag, LogType.INFO, params)
        println()
    }

    fun printLog(tag: Any, logType: LogType, params: Array<out String>) {

        val logTag: String = when {
            tag is Class<*> -> tag.simpleName
            tag is String -> tag
            else -> ""
        }

        val args = params.joinToString(" ")

        when (logType) {
            LogType.DEBUG -> Log.d(logTag, args)
            LogType.ERROR -> Log.e(logTag, args)
            LogType.INFO -> Log.i(logTag, args)
        }
    }

}