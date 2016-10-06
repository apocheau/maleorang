package com.ecwid.maleorang.method.v3_0.lists

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

/**
 * Created by apocheau on 27/08/16.
 */
class GrowthHistory : MailchimpObject() {

    @JvmField
    @Field
    var list_id: String? = null

    @JvmField
    @Field
    var month: String? = null

    @JvmField
    @Field
    var existing: Integer? = null

    @JvmField
    @Field
    var imports: Integer? = null

    @JvmField
    @Field
    var optins: Integer? = null

    @JvmField
    @Field
    var _links: List<LinkInfo>? = null

}
