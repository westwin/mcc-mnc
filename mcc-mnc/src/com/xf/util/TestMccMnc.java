package com.xf.util;

public class TestMccMnc {
	public static void main(String[] args) {
		echo(MccMnc.isoCountryCode(460));//China
		echo(MccMnc.carrier(460, 1));//  China Unicom
		echo(MccMnc.carrier(460, 5));//China Telecom
		echo(MccMnc.carrier(460, 0));//China Mobile GSM
	}
	
	public static void echo(Object msg){
		System.out.println(msg);
	}
}
