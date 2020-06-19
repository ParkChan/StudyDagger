package com.chan.di.modules

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideHelloWorld() = "Hello World!!"
}