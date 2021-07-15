package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("NextApp.Droid.MainApplication, NextApp.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc647baf2fd98727794c.MainApplication.class, crc647baf2fd98727794c.MainApplication.__md_methods);
		
	}
}
