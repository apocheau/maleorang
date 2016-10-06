package com.ecwid.maleorang.method.v3_0.lists

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

/**
 * Created by apocheau on 27/08/16.
 */
class InterestCategories : MailchimpObject() {

    @JvmField
    @Field
    var list_id: String? = null

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var title: String? = null

    @JvmField
    @Field
    var display_order: Integer? = null

    @JvmField
    @Field
    var type: String? = null

    @JvmField
    @Field
    var _links: List<LinkInfo>? = null

}
