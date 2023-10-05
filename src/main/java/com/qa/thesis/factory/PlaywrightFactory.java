package com.qa.thesis.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	
	/*
	 * Playwright playwright; Browser browser; BrowserContext browserContext; Page
	 * page;
	 */ Properties prop;


	private static ThreadLocal<Browser> tlBrowser = new ThreadLocal<>();
	private static ThreadLocal<BrowserContext> tlBrowserContext = new ThreadLocal<>();
	private static ThreadLocal<Page> tlPage = new ThreadLocal<>();
	private static ThreadLocal<Playwright> tlPlaywright = new ThreadLocal<>();

	public static Playwright getPlaywright() {
		return tlPlaywright.get();
	}

	public static Browser getBrowser() {
		return tlBrowser.get();
	}

	public static Page getPage() {
		return tlPage.get();
	}

	public static BrowserContext getBrowserContext() {
		return tlBrowserContext.get();
	}

	public static Page initBrowser(String browserName, String url) {
		System.out.println("Broser name is " + browserName);

		tlPlaywright.set(Playwright.create());

		// playwright=Playwright.create();

		switch (browserName.toLowerCase()) {

		case "chromium":
			tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
			// browser=playwright.chromium().launch(new
			// BrowserType.LaunchOptions().setHeadless(false));
			break;

		case "firefox":
			tlBrowser.set(getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
			// browser=playwright.firefox().launch(new
			// BrowserType.LaunchOptions().setHeadless(false));
			break;

		case "safari":
			tlBrowser.set(getPlaywright().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false)));
			// browser=playwright.webkit().launch(new
			// BrowserType.LaunchOptions().setHeadless(false));
			break;

		case "chrome":
			tlBrowser.set(getPlaywright().chromium()
					.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false)));
			// browser=playwright.chromium().launch(new
			// BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			break;

		default:
			System.out.println("Please pass correct browser.......");
			break;
		}

		tlBrowserContext.set(getBrowser().newContext());
		// browserContext=browser.newContext();

		tlPage.set(getBrowserContext().newPage());
		// page=browserContext.newPage();

		getPage().navigate(url);
		// page.navigate(url);
		return getPage();
	}

	// This method is used to initialize property class

	public Properties initProp() {
		try {
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\config\\config.properties");

			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;

	}

}
