package com.chan.common.di

import android.content.Context
import com.chan.common.di.modules.AppModule
import com.chan.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        AppModule::class
    ]
)
interface HomeComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): HomeComponent
    }
    fun inject(fragment: HomeFragment)
}