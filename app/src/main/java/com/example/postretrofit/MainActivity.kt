package com.example.postretrofit

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.postretrofit.apitools.ApiClient
import com.example.postretrofit.apitools.ApiHypnoClient
import com.example.postretrofit.apitools.ApiHypnoInterface
import com.example.postretrofit.apitools.ApiInterface
import com.example.postretrofit.models.PostModelClass
import com.example.postretrofit.models.hypnobody.HypnosisBody
import com.example.postretrofit.models.hypnobody.Query
import com.example.postretrofit.models.hypnobody.ZoneID
import com.example.postretrofit.models.hypnosismodels.HypnosisModelClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var apiInterface: ApiInterface
    private lateinit var apiHypnoInterface: ApiHypnoInterface
    val TAG = "MAinActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callPOstApi();
        hypnosisApiCalling();
    }

    private fun hypnosisApiCalling() {

        val hypnosisBody = HypnosisBody()
        val query = Query()
        val zoneID = ZoneID()

        query.recordType = "DailyVideo"
        zoneID.zoneName = "_defaultZone"

        hypnosisBody.query = query
        hypnosisBody.zoneID = zoneID

        apiHypnoInterface = ApiHypnoClient.getretrogfit().create(ApiHypnoInterface::class.java)
        apiHypnoInterface.getHypnoData("0859a0afe6fe5e430570575be07b3e31e21c97d8e39291d9ce736ee7864055b5",hypnosisBody).enqueue(object : Callback<HypnosisModelClass> {
            override fun onResponse(
                call: Call<HypnosisModelClass>?,
                response: Response<HypnosisModelClass>?
            ) {
                Toast.makeText(this@MainActivity,"HypnoSuccess---"+ response!!.body().records!![0].fields!!.videoThumbnail!!.value.toString(),Toast.LENGTH_SHORT).show()
                Log.e(TAG, "onResponse: -------Hypno Response==="+response!!.body().records!![0].fields!!.videoThumbnail!!.value.toString() )
            }

            override fun onFailure(call: Call<HypnosisModelClass>?, t: Throwable?) {
                Toast.makeText(this@MainActivity,"HypnoFail",Toast.LENGTH_SHORT).show()

            }


        })


    }

    private fun callPOstApi() {

        apiInterface = ApiClient.getretrogfit().create(ApiInterface::class.java)
        apiInterface.getPOSTdata(/*"chintan","android"*/).enqueue(object : Callback<PostModelClass> {
            override fun onResponse(
                call: Call<PostModelClass>?,
                response: Response<PostModelClass>?
            ) {
                Toast.makeText(this@MainActivity,"Success",Toast.LENGTH_SHORT).show()
                Log.e(TAG, "onResponse: "+ response!!.body().data!![0].email.toString() )
            }

            override fun onFailure(call: Call<PostModelClass>?, t: Throwable?) {
                Toast.makeText(this@MainActivity,"fail",Toast.LENGTH_SHORT).show()
            }

        })
    }
}