package com.ecwid.maleorang.method.v3_0.lists


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*

/**
 * [Get a month-by-month summary of a specific list’s growth activity](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/growth-history/#read-get_lists_list_id_growth_history)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists/{list_id}/growth-history")
class GetGrowthHistoryMethod(
        @JvmField
        @PathParam
        val list_id: String

) : MailchimpMethod<GetGrowthHistoryMethod.Response>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

    @JvmField
    @QueryStringParam
    var count: Int? = null

    @JvmField
    @QueryStringParam
    var offset: Int? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var history: List<GrowthHistory>? = null

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
