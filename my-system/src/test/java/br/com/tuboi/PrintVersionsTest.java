package br.com.tuboi;
import org.junit.Assert;
import org.junit.Test;

import br.com.tuboi.msoffice.Poi;
import br.com.tuboi.msproject.Mpxj;

public class PrintVersionsTest {

	@Test
	public void shouldCallPoiVersion_1_0() {
		String version = new Poi().getVersion();
		Assert.assertEquals("1.0", version);

		String lib = new Poi().getClass().getProtectionDomain().getCodeSource().toString();
		Assert.assertTrue(lib.contains("poi-1.0.jar"));
	}

	@Test
	public void shouldCallPoiVersion_2_0_OfNewLibrary() {
		String version = new br.com.tuboi.my.msoffice.Poi().getVersion();
		Assert.assertEquals("2.0", version);

		String lib = new br.com.tuboi.my.msoffice.Poi().getClass().getProtectionDomain().getCodeSource().toString();
		Assert.assertTrue(lib.contains("my-mpxj-16.jar"));
	}

	@Test
	public void shouldCallPoiVersion_2_0_WhichMpxjUsed() {
		String poiVersion = new Mpxj().getPoiVersion();
		Assert.assertEquals("2.0", poiVersion);

		String version = new Mpxj().getVersion();
		Assert.assertEquals("2016", version);

		String lib = new Mpxj().getPoi().getClass().getProtectionDomain().getCodeSource().toString();
		Assert.assertTrue(lib.contains("my-mpxj-16.jar"));
	}

}
