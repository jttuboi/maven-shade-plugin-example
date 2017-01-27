package br.com.tuboi.msproject;

import br.com.tuboi.msoffice.Poi;

public class Mpxj {

	private static final String VERSION = "2016";

	public String getPoiVersion() {
		return new Poi().getVersion();
	}

	public String getVersion() {
		return VERSION;
	}

	public Poi getPoi() {
		return new Poi();
	}

}
