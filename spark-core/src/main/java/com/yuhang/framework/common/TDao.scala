package com.yuhang.framework.common

import com.yuhang.framework.util.EnvUtil


trait TDao {

    def readFile(path:String) = {
        EnvUtil.take().textFile(path)
    }
}
