package com.example.crypubadsdemo;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Import Crypub Ads
//Required Common
import live.crypub.ads.Adrequest;

//Import for Interstitial Ads
import live.crypub.ads.Interlistener;
import live.crypub.ads.InterstitialAds;

//import for Video Ads
import live.crypub.ads.VideoInterstitialAds;
import live.crypub.ads.Videolistener;

//import for Banner Ads
import live.crypub.ads.Crybanner;
import live.crypub.ads.Adlistener;


public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BANNER ADS
        Crybanner banner = (Crybanner) findViewById(R.id.view_name);
        banner.loadAd(this,banner);

        //Optional Listener
        banner.setAdlistener(new Adlistener() {

            //Optional On Ads Loaded Listener
            @Override
            public void onadloaded() {
                Toast.makeText(MainActivity.this, "Banner Ads Loaded", Toast.LENGTH_SHORT).show();
            }

            //Optional Banner Ads Failed Listener
            @Override
            public void onadfailed(int errorcode) {
                //Optional Error Code switch statement
                switch (errorcode){
                    case Adrequest.ERROR_CODE_INTERNAL_ERROR:
                        Toast.makeText(MainActivity.this, "Banner Ads Failed INTERNAL ERROR", Toast.LENGTH_SHORT).show();
                        break;
                    case Adrequest.ERROR_CODE_INVALID_REQUEST:
                        Toast.makeText(MainActivity.this, "Banner Ads Failed INVALID_REQUEST", Toast.LENGTH_SHORT).show();
                        break;
                    case Adrequest.ERROR_CODE_NETWORK_ERROR:
                        Toast.makeText(MainActivity.this, "Banner Ads Failed NETWORK_ERROR", Toast.LENGTH_SHORT).show();
                        break;
                    case Adrequest.ERROR_CODE_NO_FILL:
                        Toast.makeText(MainActivity.this, "Banner Ads Failed NO FILL", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });



        //INTERSTITIAL ADS
        Button button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Load ADS
                InterstitialAds minterstialads = new InterstitialAds(MainActivity.this);
                minterstialads.loadAd();

                //Optional Listener
                minterstialads.setAdlistener(new Interlistener() {

                    //Optional
                    @Override
                    public void onAdloaded() {
                        Toast.makeText(MainActivity.this, "Interstial Ads Loaded", Toast.LENGTH_SHORT).show();
                    }

                    //Optional
                    @Override
                    public void onAdclosed() {
                        Toast.makeText(MainActivity.this, "Interstial Ad Closed", Toast.LENGTH_SHORT).show();
                    }

                    //Optional
                    @Override
                    public void onAdclicked(){
                        Toast.makeText(MainActivity.this, "Interstial Ad Clicked", Toast.LENGTH_SHORT).show();
                    }

                    //Optional
                    @Override
                    public void onAdfailed(int errorcode){
                        //Optional Switch Statement
                        switch (errorcode){
                            case Adrequest.ERROR_CODE_INTERNAL_ERROR:
                                Toast.makeText(MainActivity.this, "Interstial Ads Failed INTERNAL ERROR", Toast.LENGTH_SHORT).show();
                                break;
                            case Adrequest.ERROR_CODE_INVALID_REQUEST:
                                Toast.makeText(MainActivity.this, "Interstial Ads Failed INVALID_REQUEST", Toast.LENGTH_SHORT).show();
                                break;
                            case Adrequest.ERROR_CODE_NETWORK_ERROR:
                                Toast.makeText(MainActivity.this, "InterstialAds Failed NETWORK_ERROR", Toast.LENGTH_SHORT).show();
                                break;
                            case Adrequest.ERROR_CODE_NO_FILL:
                                Toast.makeText(MainActivity.this, "Interstial Ads Failed no fill", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });


            }
        });



        //VIDEO ADS
        //Video ADS 5 sec skip can be set from Publishers Profile
        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Load ADS
                VideoInterstitialAds videoads = new VideoInterstitialAds(MainActivity.this);
                videoads.loadAd();

                //Optional Listener
                videoads.setAdlistener(new Videolistener() {

                    //Optional
                    @Override
                    public void onAdloaded() {
                        Toast.makeText(MainActivity.this, "Video Ads Loaded", Toast.LENGTH_SHORT).show();
                    }

                    //Optional
                    @Override
                    public void onAdclosed() {
                        Toast.makeText(MainActivity.this, "Video Ad Closed", Toast.LENGTH_SHORT).show();
                    }

                    //Optional
                    @Override
                    public void onAdclicked(){
                        Toast.makeText(MainActivity.this, "Video Ad Clicked", Toast.LENGTH_SHORT).show();
                    }

                    //Optional
                    @Override
                    public void onAdfailed(int errorcode){
                        //Optional Switch
                        switch (errorcode){
                            case Adrequest.ERROR_CODE_INTERNAL_ERROR:
                                Toast.makeText(MainActivity.this, "Video Ads Failed INTERNAL ERROR", Toast.LENGTH_SHORT).show();
                                break;
                            case Adrequest.ERROR_CODE_INVALID_REQUEST:
                                Toast.makeText(MainActivity.this, "Video Ads Failed INVALID_REQUEST", Toast.LENGTH_SHORT).show();
                                break;
                            case Adrequest.ERROR_CODE_NETWORK_ERROR:
                                Toast.makeText(MainActivity.this, "Video Failed NETWORK_ERROR", Toast.LENGTH_SHORT).show();
                                break;
                            case Adrequest.ERROR_CODE_NO_FILL:
                                Toast.makeText(MainActivity.this, "Video Ads Failed no fill", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });

            }
        });


    }// oncreate



}
