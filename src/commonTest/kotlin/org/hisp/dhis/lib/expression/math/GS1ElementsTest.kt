package org.hisp.dhis.lib.expression.math

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class GS1ElementsTest {

    @Test
    fun shouldReturnGS1Element() {
        assertEquals(GS1Elements.GTIN, GS1Elements.fromKey("gtin"))
        assertEquals(GS1Elements.GTIN, GS1Elements.fromKey("GTIN"))
        assertEquals(GS1Elements.LOT_NUMBER, GS1Elements.fromKey("lot number"))
        assertEquals(GS1Elements.LOT_NUMBER, GS1Elements.fromKey("LOT_NUMBER"))
        assertEquals(GS1Elements.LOT_NUMBER, GS1Elements.fromKey("LOT NUMBER"))
        assertEquals(GS1Elements.AREA_I2_0, GS1Elements.fromKey("AREA I2_0"))
        assertEquals(GS1Elements.PAY_TO, GS1Elements.fromKey("PAY_TO"))
        assertEquals(GS1Elements.PAY_TO, GS1Elements.fromKey("PAY TO"))
        assertEquals(GS1Elements.PAY_TO, GS1Elements.fromKey("pay to"))
        assertEquals(GS1Elements.AREA_I2_0, GS1Elements.fromKey("AREA I2_0"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("product url"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("product_url"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("productUrl"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("ProductUrl"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("Product_Url"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("PRODUCT_URL"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("PRODUCT URL"))
        assertEquals(GS1Elements.PRODUCT_URL, GS1Elements.fromKey("PRODUCTURL"))
    }
}