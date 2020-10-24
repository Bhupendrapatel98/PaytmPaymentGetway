package com.example.paytmpaymentgetwayapplication;

import java.util.zip.Checksum;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {

    @FormUrlEncoded
    @POST("generate-checksum")
    Call<GenerateChecksum> getChecksum(@Header ("Accept") String accept,@Header ("Authorization") String Authorization,@Field("email") String email, @Field("mobile") String mobile, @Field("amount") String amount, @Field("order_id") String order_id);

    @FormUrlEncoded
    @POST("verify-checksum")
    Call<VerifyChecksum> getVerifyChecksum(@Header ("Accept") String accept,@Header ("Authorization") String Authorization,
                                           @Field("MID") String MID,
                                           @Field("ORDER_ID") String ORDER_ID,
                                           @Field("CUST_ID") String CUST_ID,
                                           @Field("INDUSTRY_TYPE_ID") String INDUSTRY_TYPE_ID,
                                           @Field("CHANNEL_ID") String CHANNEL_ID,
                                           @Field("EMAIL") String EMAIL,
                                           @Field("MOBILE_NO") String MOBILE_NO,
                                           @Field("TXN_AMOUNT") String TXN_AMOUNT,
                                           @Field("PAYTM_TXN_ID") String PAYTM_TXN_ID,
                                           @Field("WEBSITE") String WEBSITE,
                                           @Field("CALLBACK_URL") String CALLBACK_URL,
                                           @Field("CHECKSUMHASH") String CHECKSUMHASH);
}
