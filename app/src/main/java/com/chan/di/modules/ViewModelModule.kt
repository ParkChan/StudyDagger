package com.chan.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.chan.common.viewmodel.BookmarkEventViewModel
import com.chan.di.viewmodel.ViewModelFactory
import com.chan.di.viewmodel.ViewModelKey
import com.chan.ui.bookmark.viewmodel.BookmarkViewModel
import com.chan.ui.home.viewmodel.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(
        factory: ViewModelFactory
    ): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun bindHomeViewModel(
        homeViewModel: HomeViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BookmarkViewModel::class)
    internal abstract fun bindBookmarkViewModel(
        bookmarkViewModel: BookmarkViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BookmarkEventViewModel::class)
    internal abstract fun bindBookmarkEventViewModel(
        bookmarkEventViewModel: BookmarkEventViewModel
    ): ViewModel


}