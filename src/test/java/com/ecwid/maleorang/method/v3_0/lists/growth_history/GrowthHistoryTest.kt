package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpClient
import com.ecwid.maleorang.method.v3_0.lists.GetGrowthHistoryByMonthMethod
import com.ecwid.maleorang.method.v3_0.lists.GetGrowthHistoryMethod
import org.testng.Assert
import org.testng.annotations.Parameters
import org.testng.annotations.Test

class GrowthHistoryTest
@Parameters("mailchimp.test.apikey", "mailchimp.test.listid", "mailchimp.test.month")
constructor(private val apiKey: String, private val listId: String, private val month: String) {

    @Test
    fun testGetGrowthHistory() {
        MailchimpClient(apiKey).use { client ->
            client.execute(GetGrowthHistoryMethod(listId)).apply {
                Assert.assertNotNull(listId)
                Assert.assertNotNull(_links)
                Assert.assertNotNull(history)
                Assert.assertNotNull(total_items)
            }
        }
    }

    @Test
    fun testGetGrowthHistoryByMonth() {
        MailchimpClient(apiKey).use { client ->
            client.execute(GetGrowthHistoryByMonthMethod(listId, month)).apply {
                Assert.assertNotNull(listId)
                Assert.assertNotNull(_links)
                Assert.assertNotNull(month)
                Assert.assertNotNull(existing)
                Assert.assertNotNull(imports)
                Assert.assertNotNull(optins)
            }
        }
    }
}
