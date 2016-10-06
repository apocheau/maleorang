package com.ecwid.maleorang.method.v3_0.lists


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*

/**
 * [Get a month-by-month summary of a specific list’s growth activity](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/growth-history/#read-get_lists_list_id_growth_history)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists/{list_id}/growth-history/{month}")
class GetGrowthHistoryByMonthMethod(
        @JvmField
        @PathParam
        val list_id: String,

        @JvmField
        @PathParam
        val month: String
) : MailchimpMethod<GrowthHistory>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null
}
