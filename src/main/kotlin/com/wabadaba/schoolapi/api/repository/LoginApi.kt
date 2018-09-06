package com.wabadaba.schoolapi.api.repository

import com.wabadaba.schoolapi.api.misc.LoginProvider

interface LoginApi {
    fun doLogin(provider: LoginProvider)
}