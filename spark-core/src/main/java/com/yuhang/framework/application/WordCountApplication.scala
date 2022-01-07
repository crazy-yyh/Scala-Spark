package com.yuhang.framework.application

import com.yuhang.framework.common.TApplication
import com.yuhang.framework.controller.WordCountController


object WordCountApplication extends App with TApplication{

    // 启动应用程序
    start(){
        val controller = new WordCountController()
        controller.dispatch()
    }

}
