package com.qa.thesis.U4SMFramework.Navigation;

import com.qa.thesis.U4SMFramework.Administrative.ConfigurationMenu.ApplicationSettings.ApplicationSettingPage;

public class SystemManagementNavigator {
	
    private  NavigationMenu _navigationMenu;

    public SystemManagementNavigator()
    {
        _navigationMenu = new NavigationMenu();
    }
    
    private void NavigateTo(String side, String module, String pageName)
    {
        _navigationMenu.NavigateTo(side,module,pageName);
    }
    
    public ApplicationSettingPage ApplicationSettings()
    {
        NavigateTo("Default","System Management", "Application Settings");
        return new ApplicationSettingPage();
    }

}
