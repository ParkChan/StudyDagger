package com.chan.ui.home.di

import android.content.Context
import com.chan.common.di.modules.AppModule
import com.chan.common.di.modules.RetrofitModule
import com.chan.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        AppModule::class,
        RetrofitModule::class
    ]
)
interface HomeComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): HomeComponent
    }

    fun inject(fragment: HomeFragment)
}