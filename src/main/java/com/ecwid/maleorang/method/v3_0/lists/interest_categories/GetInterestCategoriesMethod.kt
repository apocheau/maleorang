package com.ecwid.maleorang.method.v3_0.lists


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*

/**
 * [Get information about a list’s interest categories](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/interest-categories/#read-get_lists_list_id_interest_categories)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists/{list_id}/interest-categories")
class GetInterestCategoriesMethod(
        @JvmField
        @PathParam
        val list_id: String

) : MailchimpMethod<GetInterestCategoriesMethod.Response>() {

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

    @JvmField
    @QueryStringParam
    var type: String? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var categories: List<InterestCategories>? = null

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
