package com.project.cucumber;

import com.project.pages.FacebookPage;

public class ScenarioContext {

    private FacebookPage facebookPage;

    public FacebookPage getFacebookPage(){ return facebookPage; }


    public void setFacebookPage(FacebookPage facebookPage){ this.facebookPage = facebookPage; }
}
