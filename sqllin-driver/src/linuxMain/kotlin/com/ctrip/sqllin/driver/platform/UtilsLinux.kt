package com.ctrip.sqllin.driver.platform

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString

/**
 * The tools about bytes, implementation of Linux
 * @author yqiao
 */

internal actual fun bytesToString(bv: CPointer<ByteVar>): String = bv.toKString()

internal actual inline val separatorChar: Char
    get() = '/'