package oopHomeWork.core;

public class SmsLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Sms Gonderildi : " + data);
		
	}

}
