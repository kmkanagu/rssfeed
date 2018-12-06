package com.kanagaraj.rssfeed.di

import android.app.Application
import com.kanagaraj.rssfeed.RssFeedApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by kanagaraj on 23/11/18.
 */
@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, AppModule::class,
        ActivityComponent::class))
interface AppComponent : AndroidInjector<RssFeedApplication> {

}