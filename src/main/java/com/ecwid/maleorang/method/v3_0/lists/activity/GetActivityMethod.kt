package com.ecwid.maleorang.method.v3_0.lists


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*

/**
 * [Get up to the previous 180 days of daily detailed aggregated activity stats for a list, not including Automation activity](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/abuse-reports/#read-get_lists_list_id_abuse_reports_report_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists/{list_id}/activity")
class GetActivityMethod(
        @JvmField
        @PathParam
        val list_id: String

) : MailchimpMethod<GetActivityMethod.Response>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var activity: List<ActivityInfo>? = null

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
