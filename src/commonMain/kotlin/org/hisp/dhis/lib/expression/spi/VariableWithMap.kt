package org.hisp.dhis.lib.expression.spi

import kotlin.js.JsExport

@JsExport
data class VariableWithMap(
    val customMap: Map<String, ProgramVariable>,
)
