package extension.emulatordetector;


import lime.system.JNI;


class EmulatorDetector {
	
	
	public static function isEmulator():Bool {
		
		#if android
		var resultJNI = emulatordetector_is_emulator_jni();
		return resultJNI;
		#end
		return false;
	}
	
	
	#if android
	private static var emulatordetector_is_emulator_jni = JNI.createStaticMethod ("org.haxe.extension.EmulatorDetector", "isEmulator", "()Z");
	#end
		
}