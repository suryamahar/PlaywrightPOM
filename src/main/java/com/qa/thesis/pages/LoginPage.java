package com.qa.thesis.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.qa.thesis.factory.PlaywrightFactory;


public class LoginPage {
	
	private Page page;
	
	private String usernameTxtbx="#UserName";
	private String passwordTxtbx="#Password";
	private String loginBtn=".loginButton ";
	private String agreeBtn="//input[@value='Agree']";
	private String U4smLogo=".unit4Logo";

	
	public LoginPage(Page page) {
		this.page=page;
	}
	
	
	public LoginPage LoginToAdmin(String username, String Pass) {
		page.fill(usernameTxtbx, username);
		page.fill(passwordTxtbx, Pass);
		page.click(loginBtn);
		return this;
	}
	public LoginPage clickAgree() {
		if(page.isVisible(agreeBtn)) {
			page.click(agreeBtn);
		}
		return this;
	}
	public boolean IsAgreeButtonVisible() {
		return page.isVisible(agreeBtn);
	}
		
	public boolean getTitle() {
		
		return page.isVisible(U4smLogo);
	}

	public LoginPage NavigateToDiscount()
	{
	     page.click("(//button[@title='Billing'])[2]");
	     page.click("div .active .toggleManagementItems span");
	     page.click("//a[text()='Discount']");
	     return this;
	}
	public LoginPage NavigateToDiscountPlan()
	{
	     page.click("(//button[@title='Billing'])[2]");
	     page.click("div .active .toggleManagementItems span");
	     page.click("//a[text()='Discount Plan']");
	     return this;
	}
	public LoginPage NavigateToHoldType()
	{
	     page.click("(//button[@title='Billing'])[2]");
	     page.click("div .active .toggleManagementItems span");
	     page.click("//a[text()='Hold Type']");
	     return this;
	}
	public LoginPage AddDiscount(String discount)
	{
	     page.click("//button[text()='Add']");
	     page.fill("//div[@id='editDiscount']//input[@data-binding='Name']",discount);
	     page.click("//button[contains(text(),'OK')]");
	     page.click("//button[contains(text(),'Save')]");
	     return this;
	}
	public LoginPage AddDiscountPlan(String discountPlan)
	{
	     page.click("//button[text()='Add']");
	     page.fill(".field #Name",discountPlan);
	     page.fill(".field #Description",discountPlan);
	     page.click("//button[contains(text(),'OK')]");
	     page.click("//button[contains(text(),'Save')]");
	     return this;
	}
	public LoginPage AddHoldType(String holdType)
	{
	     page.click("//button[text()='Add']");
	     page.fill(".field #Name",holdType);
	     page.fill(".field #Description",holdType);
	     page.click("//button[contains(text(),'OK')]");
	     page.click("//button[contains(text(),'Save')]");
	     return this;
	}
	public LoginPage DeleteDiscount(String discount)
	{
	      page.locator("#KeywordSearch").fill(discount);
	      page.locator("#KeywordSearch").press("Enter");
	      page.getByText(discount).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      return this;
	}
	public LoginPage DeleteHoldType(String holdType)
	{
	      page.locator("#KeywordSearch").fill(holdType);
	      page.locator("#KeywordSearch").press("Enter");
	      page.locator("(//td//span[text()='"+holdType+"'])[1]").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      return this;
	}
	public LoginPage DeleteDiscountPlan(String discountPlan)
	{
	      page.locator("#KeywordSearch").fill(discountPlan);
	      page.locator("#KeywordSearch").press("Enter");
	      page.locator("(//td//span[text()='"+discountPlan+"'])[1]").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      return this;
	}
	public LoginPage Logout()
	{
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Profile Menu")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      return this;
	}
	public LoginPage NavigateToCollege()
	{
	     page.click("(//button[@title='Academics'])[2]");
	     page.click("//a[text()='College']");
	      return this;
	}
	public LoginPage NavigateToHighSchool()
	{
	     page.click("(//button[@title='Admissions'])[2]");
	     page.click("//a[text()='High School']");
	      return this;
	}
	public LoginPage AddHighSchool(String highSchool)
	{
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
	      page.fill(".field #DisplayName",highSchool);
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
	      return this;
	}
	public LoginPage AddCollege(String college)
	{
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
	      page.getByLabel("College Name").click();
	      page.getByLabel("College Name").fill(college);
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
	      return this;
	}
	public LoginPage DeleteCollege(String college)
	{
	      page.getByPlaceholder("Find...").click();
	      page.getByPlaceholder("Find...").fill(college);
	      page.getByPlaceholder("Find...").press("Enter");
	      page.locator("#searchResults div").filter(new Locator.FilterOptions().setHasText(college)).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      return this;
	}
	public LoginPage DeleteHighSchool(String highSchool)
	{
	      page.getByPlaceholder("Find...").click();
	      page.getByPlaceholder("Find...").fill(highSchool);
	      page.getByPlaceholder("Find...").press("Enter");
	      page.locator("#searchResults div").filter(new Locator.FilterOptions().setHasText(highSchool)).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
	      return this;
	}
}
