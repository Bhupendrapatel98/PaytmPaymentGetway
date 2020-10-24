package com.example.paytmpaymentgetwayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.paytm.pgsdk.PaytmOrder;
import com.paytm.pgsdk.PaytmPGService;
import com.paytm.pgsdk.PaytmPaymentTransactionCallback;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    TextView textViewPrice;
    PaytmPGService Service;
    long number;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPrice = findViewById(R.id.textViewPrice);

        number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;

        findViewById(R.id.buttonBuy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateChecsum(String.valueOf(number));
            }
        });
    }

    void generateChecsum(String number1) {
        //for testing
        Service = PaytmPGService.getStagingService();
        
        //for production
        //Service = PaytmPGService.getProductionService();

        RetrofitClint.getRetrofit(Constant.CHECKSUM_GENERATE_URL)
                .create(Api.class)
                .getChecksum("application/json", "Bearer Wy7VaQykBhh9btMBv5Bgy0utpFOoJmuip4T06LNPhxmBsTZwDhWzUsfBTh622Ck0LIIUtkRGBckSmTH2eVxFXcZPx3gQUovjep1f",
                        "manishshakya.devp@gmail.com", "9754068106", "1.00", number1)
                .enqueue(new Callback<GenerateChecksum>() {
                    @Override
                    public void onResponse(Call<GenerateChecksum> call, Response<GenerateChecksum> response) {

                        Log.d(TAG, "onResponse: "+response.body());

                        HashMap<String, String> paramMap = new HashMap<>();
                        paramMap.put("MID", response.body().getData().getmID());
                        paramMap.put("ORDER_ID", response.body().getData().getORDERID());
                        paramMap.put("CUST_ID", response.body().getData().getCUSTID());
                        paramMap.put("CHANNEL_ID", response.body().getData().getCHANNELID());
                        paramMap.put("TXN_AMOUNT", response.body().getData().getTXNAMOUNT());
                        paramMap.put("WEBSITE", response.body().getData().getWEBSITE());
                        paramMap.put("EMAIL", response.body().getData().getEMAIL());
                        paramMap.put("MOBILE_NO", response.body().getData().getMOBILENO());
                        paramMap.put("INDUSTRY_TYPE_ID", response.body().getData().getINDUSTRYTYPEID());
                        paramMap.put("CALLBACK_URL", response.body().getData().getCALLBACKURL());
                        paramMap.put("CHECKSUMHASH", response.body().getCHECKSUMHASH());

                        PaytmOrder Order = new PaytmOrder(paramMap);

                        Service.initialize(Order, null);

                        Service.startPaymentTransaction(MainActivity.this, true, true, new PaytmPaymentTransactionCallback() {
                            @Override
                            public void onTransactionResponse(Bundle inResponse) {

                                String status = "";
                                for (String key : inResponse.keySet()) {
                                    Log.d("onStartTransaction : ", key + " = \"" + inResponse.get(key) + "\"");
                                    if (key.equals("STATUS")) {
                                        status = inResponse.get(key).toString();
                                    }
                                }
                                verify(response.body().getData().getmID(), response.body().getData().getORDERID(), response.body().getData().getCUSTID()
                                        , response.body().getData().getINDUSTRYTYPEID(), response.body().getData().getCHANNELID(), response.body().getData().getEMAIL()
                                        , response.body().getData().getMOBILENO(), response.body().getData().getTXNAMOUNT(), inResponse.get("TXNID").toString(), response.body().getData().getWEBSITE()
                                        , response.body().getData().getCALLBACKURL(), response.body().getCHECKSUMHASH());
                            }

                            @Override
                            public void networkNotAvailable() {
                                Toast.makeText(getApplicationContext(), "Network connection error: Check your internet connectivity", Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void clientAuthenticationFailed(String inErrorMessage) {
                                Toast.makeText(getApplicationContext(), "Authentication failed: Server error" + inErrorMessage, Toast.LENGTH_LONG).show();

                            }

                            @Override
                            public void someUIErrorOccurred(String inErrorMessage) {
                                Toast.makeText(getApplicationContext(), "UI Error " + inErrorMessage, Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onErrorLoadingWebPage(int iniErrorCode, String inErrorMessage, String inFailingUrl) {

                            }

                            @Override
                            public void onBackPressedCancelTransaction() {

                            }

                            @Override
                            public void onTransactionCancel(String inErrorMessage, Bundle inResponse) {

                            }
                        });
                    }

                    @Override
                    public void onFailure(Call<GenerateChecksum> call, Throwable t) {

                    }
                });

    }

    private void verify(String mid, String orderid, String custid, String industryid, String channelid, String email, String mobile,
                        String teamount, String paytmtxnid, String website, String callback, String checksum) {

        RetrofitClint.getRetrofit(Constant.VERIFY_CHECKSUM)
                .create(Api.class)
                .getVerifyChecksum("application/json",
                        "Bearer Wy7VaQykBhh9btMBv5Bgy0utpFOoJmuip4T06LNPhxmBsTZwDhWzUsfBTh622Ck0LIIUtkRGBckSmTH2eVxFXcZPx3gQUovjep1f",
                        mid, orderid, custid, industryid, channelid, email, mobile, teamount, paytmtxnid, website, callback,
                        checksum)
                .enqueue(new Callback<VerifyChecksum>() {
                    @Override
                    public void onResponse(Call<VerifyChecksum> call, Response<VerifyChecksum> response) {

                        Log.d(TAG, "onResponse_verify: " + response.body());
                    }

                    @Override
                    public void onFailure(Call<VerifyChecksum> call, Throwable t) {

                    }
                });
    }
}
