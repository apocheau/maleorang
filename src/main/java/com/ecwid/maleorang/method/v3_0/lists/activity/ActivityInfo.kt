package com.ecwid.maleorang.method.v3_0.lists

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

/**
 * Created by apocheau on 27/08/16.
 */
class ActivityInfo : MailchimpObject() {

    @JvmField
    @Field
    var day: String? = null

    @JvmField
    @Field
    var emails_sent: Integer? = null

    @JvmField
    @Field
    var unique_opens: Integer? = null

    @JvmField
    @Field
    var recipient_clicks: Integer? = null

    @JvmField
    @Field
    var hard_bounce: Integer? = null

    @JvmField
    @Field
    var soft_bounce: Integer? = null

    @JvmField
    @Field
    var subs: Integer? = null

    @JvmField
    @Field
    var unsubs: Integer? = null

    @JvmField
    @Field
    var other_adds: Integer? = null

    @JvmField
    @Field
    var _links: List<LinkInfo>? = null

}
