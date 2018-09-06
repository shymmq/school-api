package com.wabadaba.schoolapi.api.services.vulcan

import com.wabadaba.schoolapi.api.Api

class VulcanApi : Api {
    override val loginApi by lazy { VulcanLoginRepository() }
}