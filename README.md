# Crypub-Ads-Demo
Demo App for Crypub ADS\
More on our website\
[Visit Website](https://crypub.com)

## Installation
Add in gradle
```java
repositories {
    maven{
        url 'https://sdk.crypub.com/'
    }
}
```

```java
dependencies {
    implementation 'live.crypub.ads:ads:1.0'
}
```

## Usage
Add App ID and App Key in Manifest
```xml
<meta-data android:name="crypub_adsid" android:value="5e0a18a24724d7151df9afe3" />
<meta-data android:name="crypub_key" android:value="UiJeDWwPjFgjzKh2+/SWFQ==" />
```

### Banner ADS
```java
import live.crypub.ads.Adrequest;
import live.crypub.ads.Crybanner;
import live.crypub.ads.Adlistener;
```
Add in onCreate
```java
Crybanner banner = (Crybanner) findViewById(R.id.view_name);
banner.loadAd(MainActivity.this,banner);

//Optional Listener
banner.setAdlistener(new Adlistener() {
    
    //Optional
    @Override
    public void onadloaded() {
        Toast.makeText(MainActivity.this, "Banner Ads Loaded", Toast.LENGTH_SHORT).show();
    }

    //Optional
    @Override
    public void onadfailed(int errorcode) {
        //Optional
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
```
Add in layout
```xml
<live.crypub.ads.Crybanner
        xmlns:ads="http://schemas.android.com/apk/res-auto"
        android:id="@+id/view_name"
        ads:layout_constraintBottom_toBottomOf="parent"
        ads:layout_constraintEnd_toEndOf="parent"
        ads:layout_constraintStart_toStartOf="parent"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        />
```

### Interstitial Ads
```java
import live.crypub.ads.Adrequest;
import live.crypub.ads.Interlistener;
import live.crypub.ads.InterstitialAds;
```
Add in onCreate
```java
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
```

### Video Ads
```java
import live.crypub.ads.Adrequest;
import live.crypub.ads.VideoInterstitialAds;
import live.crypub.ads.Videolistener;
```
Add in onCreate
```java
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
```

## License
[MIT](https://choosealicense.com/licenses/mit/)
