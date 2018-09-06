package com.wabadaba.schoolapi.api.services.vulcan

import com.wabadaba.schoolapi.api.misc.LoginProvider
import com.wabadaba.schoolapi.api.repository.LoginApi

class VulcanLoginRepository : LoginApi {
    override fun doLogin(provider: LoginProvider) {
        if (provider !is VulcanLoginProvider) {
            provider.onError(Exception("Invalid login provider"))
            return
        }
        // @TODO login
        provider.onSuccess()
    }
}