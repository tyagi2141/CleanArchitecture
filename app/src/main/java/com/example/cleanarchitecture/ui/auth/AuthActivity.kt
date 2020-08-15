package com.example.cleanarchitecture.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cleanarchitecture.R
import com.example.cleanarchitecture.ui.BaseActivity
import com.example.cleanarchitecture.viewmodel.ViewModelProviderFactory
import javax.inject.Inject

class AuthActivity : BaseActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}