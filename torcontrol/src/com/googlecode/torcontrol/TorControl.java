package com.googlecode.torcontrol;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.googlecode.torcontrol.command.TorCommandBase;

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

	private Socket socket = null;

	/**
	 * 
	 */
	public TorControl() {
		this(DEFAULT_CONTROL_HOST, DEFAULT_CONTROL_PORT, null);
	}

	/**
	 * 
	 * @param controlHost
	 * @param controlPort
	 * @param authCode
	 */
	public TorControl(String controlHost, int controlPort, String authCode) {
		this.controlHost = controlHost;
		this.controlPort = controlPort;
		this.authCode = authCode;
	}
	
	private void socketConnect() throws UnknownHostException, IOException {
		if (socket == null) {
			socket = new Socket(controlHost, controlPort);
		}
	}

	public String executeCommand(final TorCommandBase command) throws UnknownHostException, IOException {
		// TODO
		socketConnect();
		return null;
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
