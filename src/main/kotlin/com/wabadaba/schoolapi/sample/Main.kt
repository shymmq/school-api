package com.wabadaba.schoolapi.sample

import com.wabadaba.schoolapi.api.Api
import com.wabadaba.schoolapi.api.services.librus.LibrusLoginProvider
import com.wabadaba.schoolapi.api.services.vulcan.VulcanApi
import com.wabadaba.schoolapi.api.services.vulcan.VulcanLoginProvider

class VulcanProviderImpl : VulcanLoginProvider {
    override val pin: String = ""
    override val token: String = ""
    override fun onError(error: Throwable) {
        println("Errored " + error.message)
    }

    override fun onSuccess() {
        println("Logged in")
    }

}

class LibrusProviderImpl : LibrusLoginProvider {
    override val urlToken: String = ""
    override fun onError(error: Throwable) {
        println("Errored " + error.message)
    }

    override fun onSuccess() {
        println("Logged in")
    }

}

fun main(args: Array<String>) {
    val api : Api = VulcanApi()

    api.loginApi.doLogin(VulcanProviderImpl())
    api.loginApi.doLogin(LibrusProviderImpl())
}

