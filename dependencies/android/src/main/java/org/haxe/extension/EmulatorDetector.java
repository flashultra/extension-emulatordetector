package org.haxe.extension;


import android.app.Activity;
import android.content.res.AssetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.os.Build;


public class EmulatorDetector extends Extension {
	
	private static String getProperty(Class myClass, String propertyName) throws Exception 
	{
		return (String) myClass.getMethod("get", String.class).invoke(myClass, propertyName);
	}
	
	public static boolean isEmulator() {
		boolean isProbablyRunningOnEmulator = ( 
			( (Build.FINGERPRINT.startsWith("google/sdk_gphone_")
            && Build.FINGERPRINT.endsWith(":user/release-keys")
            && Build.MANUFACTURER == "Google" && Build.PRODUCT.startsWith("sdk_gphone_") && Build.BRAND == "google"
            && Build.MODEL.startsWith("sdk_gphone_")) ) 
            || Build.FINGERPRINT.startsWith("generic")
            || Build.FINGERPRINT.startsWith("unknown")
            || Build.MODEL.contains("google_sdk")
            || Build.MODEL.contains("Emulator")
            || Build.MODEL.contains("Android SDK built for x86")
			|| (Build.BOARD.contains("QC_Reference_Phone") && !Build.MANUFACTURER.toLowerCase().contains("xiaomi"))
			|| Build.MANUFACTURER.contains("Genymotion")
            || Build.HOST.startsWith("Build") //MSI App Player
            || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"))
            || Build.PRODUCT.contains("sdk_google")
            || Build.PRODUCT.contains("google_sdk")
			|| Build.HARDWARE.contains("goldfish")
			|| Build.HARDWARE.contains("ranchu")
			|| Build.PRODUCT.contains("sdk")
			|| Build.PRODUCT.contains("sdk_x86")
			|| Build.PRODUCT.contains("vbox86p")
			|| Build.PRODUCT.contains("emulator")
			|| Build.PRODUCT.contains("simulator")
			|| Build.HARDWARE.toLowerCase().contains("intel")
			|| Build.MODEL.toLowerCase().contains("droid4x")
			|| Build.HARDWARE.equals("vbox86")
			|| Build.BOARD.toLowerCase().contains("nox")
            || Build.BOOTLOADER.toLowerCase().contains("nox")
            || Build.HARDWARE.toLowerCase().contains("nox")
            || Build.PRODUCT.toLowerCase().contains("nox")
            || Build.SERIAL.toLowerCase().contains("nox")
			|| Build.MANUFACTURER.startsWith("iToolsAVM")
            || Build.DEVICE.startsWith("iToolsAVM")
            || Build.MODEL.startsWith("iToolsAVM")
			/* possible check for future release
			|| Build.MANUFACTURER.equals("unknown")
			|| Build.FINGERPRINT.endsWith("test-keys")
			|| Build.FINGERPRINT.contains("x86") 
			|| Build.DEVICE.contains("x86") 
			|| Build.MODEL.contains("x86") 
			|| Build.PRODUCT.contains("x86")
			*/
			
			);
			
			if ( !isProbablyRunningOnEmulator ) {
				isProbablyRunningOnEmulator = ( Build.getRadioVersion().trim().length() == 0 );
			}
			
			if ( !isProbablyRunningOnEmulator ) {
				try {
				   Class SystemProperties = Class.forName("android.os.SystemProperties");
				   isProbablyRunningOnEmulator = (getProperty(SystemProperties, "ro.kernel.qemu").equalsIgnoreCase("1"));
				} catch (Exception e) {
					//e.printStackTrace();
				}
			}
		
		return isProbablyRunningOnEmulator;
	}
	
	
	/**
	 * Called when an activity you launched exits, giving you the requestCode 
	 * you started it with, the resultCode it returned, and any additional data 
	 * from it.
	 */
	public boolean onActivityResult (int requestCode, int resultCode, Intent data) {
		
		return true;
		
	}

	/**
	 * Called when the activity receives th results for permission requests.
	 */
	public boolean onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {

		return true;

	}
	
	
	/**
	 * Called when the activity is starting.
	 */
	public void onCreate (Bundle savedInstanceState) {
		
		
		
	}
	
	
	/**
	 * Perform any final cleanup before an activity is destroyed.
	 */
	public void onDestroy () {
		
		
		
	}
	
	
	/**
	 * Called as part of the activity lifecycle when an activity is going into
	 * the background, but has not (yet) been killed.
	 */
	public void onPause () {
		
		
		
	}
	
	
	/**
	 * Called after {@link #onStop} when the current activity is being 
	 * re-displayed to the user (the user has navigated back to it).
	 */
	public void onRestart () {
		
		
		
	}
	
	
	/**
	 * Called after {@link #onRestart}, or {@link #onPause}, for your activity 
	 * to start interacting with the user.
	 */
	public void onResume () {
		
		
		
	}
	
	
	/**
	 * Called after {@link #onCreate} &mdash; or after {@link #onRestart} when  
	 * the activity had been stopped, but is now again being displayed to the 
	 * user.
	 */
	public void onStart () {
		
		
		
	}
	
	
	/**
	 * Called when the activity is no longer visible to the user, because 
	 * another activity has been resumed and is covering this one. 
	 */
	public void onStop () {
		
		
		
	}
	
	
}