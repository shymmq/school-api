package com.wabadaba.schoolapi.api.services.librus

import com.wabadaba.schoolapi.api.misc.LoginProvider

interface LibrusLoginProvider : LoginProvider {
    val urlToken : String
}