package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpClient
import com.ecwid.maleorang.method.v3_0.lists.GetClientsMethod
import org.testng.Assert
import org.testng.annotations.Parameters
import org.testng.annotations.Test

class ClientsTest
@Parameters("mailchimp.test.apikey", "mailchimp.test.listid")
constructor(private val apiKey: String, private val listId: String) {

    @Test
    fun testGetClients() {
        MailchimpClient(apiKey).use { client ->
            client.execute(GetClientsMethod(listId)).apply {
                Assert.assertNotNull(listId)
                Assert.assertNotNull(_links)
                Assert.assertNotNull(total_items)
                if(total_items != 0){
                    Assert.assertNotNull(clients)
                }
            }
        }
    }

}
