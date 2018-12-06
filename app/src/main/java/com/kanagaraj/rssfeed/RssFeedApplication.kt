package com.kanagaraj.rssfeed

import android.app.Activity
import android.app.Application
import com.kanagaraj.rssfeed.di.AppModule
import com.kanagaraj.rssfeed.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject

/**
 * Created by kanagaraj on 23/11/18.
 */
class RssFeedApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector:  DispatchingAndroidInjector<Activity>

    override fun activityInjector() = activityInjector

    override fun onCreate() {

        super.onCreate()

        DaggerAppComponent.builder().appModule(AppModule(this)).build().inject(this)

    }


}