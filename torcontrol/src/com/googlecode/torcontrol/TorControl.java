package com.googlecode.torcontrol;

/**
 * 
 * @author Denis Migol
 * 
 */
public class TorControl {

	public static final String DEFAULT_CONTROL_HOST = "127.0.0.1";
	public static final int DEFAULT_CONTROL_PORT = 9051;

	private String controlHost = DEFAULT_CONTROL_HOST;
	private int controlPort = DEFAULT_CONTROL_PORT;
	private String authCode = null;

	/**
	 * 
	 */
	public TorControl() {
	}

	/**
	 * 
	 * @param controlHost
	 * @param controlPort
	 * @param authCode
	 */
	public TorControl(String controlHost, int controlPort, String authCode) {
		super();
		this.controlHost = controlHost;
		this.controlPort = controlPort;
		this.authCode = authCode;
	}

	/**
	 * @param controlHost
	 *            the controlHost to set
	 */
	public void setControlHost(String controlHost) {
		this.controlHost = controlHost;
	}

	/**
	 * @return the controlHost
	 */
	public String getControlHost() {
		return controlHost;
	}

	/**
	 * @param controlPort
	 *            the controlPort to set
	 */
	public void setControlPort(int controlPort) {
		this.controlPort = controlPort;
	}

	/**
	 * @return the controlPort
	 */
	public int getControlPort() {
		return controlPort;
	}

	/**
	 * @param authCode
	 *            the authCode to set
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * @return the authCode
	 */
	public String getAuthCode() {
		return authCode;
	}
}
