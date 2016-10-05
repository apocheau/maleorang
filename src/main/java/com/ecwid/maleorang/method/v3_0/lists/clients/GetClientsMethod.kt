package com.ecwid.maleorang.method.v3_0.lists


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*

/**
 * [Get a list of the top email clients based on user-agent strings](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/clients/#read-get_lists_list_id_clients)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists/{list_id}/clients")
class GetClientsMethod(
        @JvmField
        @PathParam
        val list_id: String

) : MailchimpMethod<GetClientsMethod.Response>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var clients: List<ClientInfo>? = null

        @JvmField
        @Field
        var list_id: String? = null

        @JvmField
        @Field
        var total_items: Int? = null

        @JvmField
        @Field
        var _links: List<LinkInfo>? = null
    }
}
