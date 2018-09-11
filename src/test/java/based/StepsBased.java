package based;

import com.codeborne.selenide.Configuration;

public class StepsBased {

    public String browser;

    //todo create factory for
    public String getChrome (){
        return Configuration.browser = "chrome";
    }

    public String getFirefox (){
        return Configuration.browser = "firefox";
    }

}
