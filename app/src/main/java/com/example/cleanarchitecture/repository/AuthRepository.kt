package com.example.cleanarchitecture.repository

import androidx.lifecycle.LiveData
import com.example.cleanarchitecture.api.OpenApiAuthService
import com.example.cleanarchitecture.api.network_response.LoginResponse
import com.example.cleanarchitecture.api.network_response.RegistrationResponse
import com.example.cleanarchitecture.persistence.AccountPropertiesDao
import com.example.cleanarchitecture.persistence.AuthTokenDao
import com.example.cleanarchitecture.session.SessionManager
import com.example.cleanarchitecture.util.GenericApiResponse
import javax.inject.Inject


class AuthRepository
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
)
{
    fun testLoginRequest(email: String, password: String): LiveData<GenericApiResponse<LoginResponse>> {
        return openApiAuthService.login(email, password)
    }

    fun testRegistrationRequest(
        email: String,
        username: String,
        password: String,
        confirmPassword: String
    ): LiveData<GenericApiResponse<RegistrationResponse>> {
        return openApiAuthService.register(email, username, password, confirmPassword)
    }
}