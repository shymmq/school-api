package com.wabadaba.schoolapi.api.services.vulcan

import com.wabadaba.schoolapi.api.misc.LoginProvider

interface VulcanLoginProvider : LoginProvider {
    val token: String
    val pin: String
}