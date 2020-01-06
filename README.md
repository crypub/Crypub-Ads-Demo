# Crypub-Ads-Demo
Demo App for Crypub ADS\
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
```

## License
[MIT](https://choosealicense.com/licenses/mit/)
