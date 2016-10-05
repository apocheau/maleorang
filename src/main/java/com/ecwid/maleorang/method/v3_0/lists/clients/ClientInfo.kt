package com.ecwid.maleorang.method.v3_0.lists

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

/**
 * Created by apocheau on 27/08/16.
 */
class ClientInfo : MailchimpObject() {

    @JvmField
    @Field
    var client: String? = null

    @JvmField
    @Field
    var members: Integer? = null

    @JvmField
    @Field
    var list_id: String? = null

    @JvmField
    @Field
    var _links: List<LinkInfo>? = null

}
