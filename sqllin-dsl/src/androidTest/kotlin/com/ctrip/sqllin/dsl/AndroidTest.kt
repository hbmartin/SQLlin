package com.ctrip.sqllin.dsl

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.filters.SmallTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import com.ctrip.sqllin.driver.toDatabasePath
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Android instrument test
 * @author yaqiao
 */

@SmallTest
@RunWith(AndroidJUnit4ClassRunner::class)
class AndroidTest {

    private val commonTest = CommonBasicTest(
        ApplicationProvider.getApplicationContext<Context>().toDatabasePath()
    )

    @Test
    fun testInsert() = commonTest.testInsert()

    @Test
    fun testDelete() = commonTest.testDelete()

    @Test
    fun testUpdate() = commonTest.testUpdate()

    @Test
    fun testSelectWhereClause() = commonTest.testSelectWhereClause()

    @Test
    fun testSelectOrderByClause() = commonTest.testSelectOrderByClause()

    @Test
    fun testSelectLimitAndOffsetClause() = commonTest.testSelectLimitAndOffsetClause()

    @Test
    fun testGroupByAndHavingClause() = commonTest.testGroupByAndHavingClause()

    @Test
    fun testUnionSelect() = commonTest.testUnionSelect()

    @Test
    fun testFunction() = commonTest.testFunction()

    @After
    fun setDown() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        context.deleteDatabase(CommonBasicTest.DATABASE_NAME)
    }
}