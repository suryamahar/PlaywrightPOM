package com.qa.thesis.U4SMFramework.Navigation;

import com.microsoft.playwright.Page;
import com.qa.thesis.factory.PlaywrightFactory;

public class NavigationMenu {
	
	 private  NavigationMenuActions _menuAction;
		private Page page;

	    protected NavigationMenu()
	    {
	        _menuAction = new NavigationMenuActions();
			this.page=PlaywrightFactory.getPage() ;
	    }

	    public void NavigateTo(String side,String module, String pageName)
	    {
	    	  page.getByText(module).click();
	      if(side=="Default") {
	    	  page.getByText(pageName).click();
	      }
	      else if(side=="Setting") {
	    	  
	      }
	      else {
	    	  
	      }
	    }
	  
	    
}



