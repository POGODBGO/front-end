package com.team.dbgo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import kotlinx.android.synthetic.main.activity_mypage.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserActivity : AppCompatActivity(), View.OnClickListener {


    private var networkService: NetworkService? = null
    private var requestManager: RequestManager? = null

    override fun onClick(v: View?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        networkService = ApplicationController.instance!!.networkService
        requestManager = Glide.with(this)

        val getUserInfoResponse = networkService!!.getUserInfo()
        getUserInfoResponse.enqueue(object : Callback<UserInfoResponse>{
            override fun onResponse(call: Call<UserInfoResponse>?, response: Response<UserInfoResponse>?) {
                if(response!!.isSuccessful){


                }
            }

            override fun onFailure(call: Call<UserInfoResponse>?, t: Throwable?) {
                ApplicationController.instance!!.makeToast("통신 확인")
            }

        })


    }



}
