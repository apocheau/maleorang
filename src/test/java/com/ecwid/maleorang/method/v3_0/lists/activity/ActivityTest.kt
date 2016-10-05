package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpClient
import com.ecwid.maleorang.method.v3_0.lists.GetActivityMethod
import org.testng.Assert
import org.testng.annotations.Parameters
import org.testng.annotations.Test

class ActivityTest
@Parameters("mailchimp.test.apikey", "mailchimp.test.listid")
constructor(private val apiKey: String, private val listId: String) {

    @Test
    fun testGetActivity() {
        MailchimpClient(apiKey).use { client ->
            client.execute(GetActivityMethod(listId)).apply {
                Assert.assertNotNull(listId)
                Assert.assertNotNull(_links)
                Assert.assertNotNull(activity)
                Assert.assertNotNull(total_items)
            }
        }
    }

}
