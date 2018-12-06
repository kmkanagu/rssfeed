package com.kanagaraj.rssfeed.di

import android.app.Application
import android.content.Context
import com.kanagaraj.rssfeed.RssFeedApplication
import com.kanagaraj.rssfeed.network.NetworkModule
import dagger.Binds
import dagger.Module
import dagger.Provides
import java.util.logging.Logger
import javax.inject.Singleton

/**
 * Created by kanagaraj on 23/11/18.
 */

@Module(includes = arrayOf(NetworkModule::class))
class AppModule(private val rssFeedApp: RssFeedApplication) {

    @Provides
    @Singleton
    fun providesApplication() : Application  = rssFeedApp;

    @Provides
    @Singleton
    fun providesContext(application: Application) : Context = application;

}