package com.kanagaraj.rssfeed.di

import com.kanagaraj.rssfeed.ui.main.RssFeedActiivity
import com.kanagaraj.rssfeed.ui.main.RssFeedActivityModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by kanagaraj on 23/11/18.
 */
@Module
abstract class ActivityComponent {

    @ContributesAndroidInjector(modules = arrayOf(RssFeedActivityModule::class))
    abstract fun providesRssFeedActivity(): RssFeedActiivity;

}