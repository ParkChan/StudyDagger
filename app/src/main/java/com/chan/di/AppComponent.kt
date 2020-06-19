package com.chan.di

import android.content.Context
import com.chan.di.modules.RetrofitModule
import com.chan.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        RetrofitModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(fragment: HomeFragment)
}