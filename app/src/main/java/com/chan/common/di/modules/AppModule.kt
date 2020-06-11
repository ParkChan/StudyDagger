package com.chan.common.di.modules

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideHelloWorld() = "Hello World!!"
}