package org.apache.multimodule_with_war.db;

import org.apache.multimodule_with_war.util.Util;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * Creates Util instance
	 *
	 * @return instance created
	 */
	public Util createUtil() {
		return new Util();
	}

	public static void main(String[] args) {
		new App().createUtil();
		System.out.println("Hello World!");
	}
}
