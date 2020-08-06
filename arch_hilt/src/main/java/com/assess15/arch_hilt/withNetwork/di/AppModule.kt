package com.assess15.arch_hilt.withNetwork.di

import com.assess15.arch_hilt.BuildConfig
import com.assess15.arch_hilt.withNetwork.data.api.ApiHelper
import com.assess15.arch_hilt.withNetwork.data.api.ApiHelperImpl
import com.assess15.arch_hilt.withNetwork.data.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

    @Provides
    fun provideBaseUrl() = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper

}