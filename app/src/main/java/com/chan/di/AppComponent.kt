package com.chan.di

import android.content.Context
import com.chan.MainActivity
import com.chan.di.modules.RetrofitModule
import com.chan.di.modules.ViewModelModule
import com.chan.ui.bookmark.BookmarkFragment
import com.chan.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        RetrofitModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: BookmarkFragment)
}