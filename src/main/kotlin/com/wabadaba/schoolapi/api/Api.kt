package com.wabadaba.schoolapi.api

import com.wabadaba.schoolapi.api.repository.LoginApi

interface Api {
    val loginApi: LoginApi
}