package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // set the property for the webDriver.chrome.driver to be the location of your local download of chromedriver
        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        //WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        //driver.get("https://formy-project.herokuapp.com/keypress");

        //WebElement name = driver.findElement(By.id("name"));
        //name.click();
        //name.sendKeys("Tharuka Dhananjalee");

        //WebElement button = driver.findElement(By.id("button"));
        //button.click();

        //driver.quit();

        //...........................................................................

        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/autocomplete");

        //WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        //autocomplete.sendKeys("No 467, Kuda Aruggoda, Alubomulla, Panadura, Sri Lanka");
        //Thread.sleep(1000); // method 1
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //method 2

        //WebDriverWait wait = new webDriverWait(driver,10);
        //WebElement autoCompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.ByClassName("pac-item"))); // method 3


        //WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        //autoCompleteResult.click();


        //driver.quit();

        //.............................................................................

        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/scroll");

        //WebElement name = driver.findElement(By.id("name"));

        //Action class is used to move to an element
        //Actions actions = new Actions(driver);
        //actions.moveToElement(name);
        //name.sendKeys("Tharuka Dhananjalee");

        //WebElement date = driver.findElement(By.id("date"));
        //date.sendKeys("29/11/2021");

        //driver.quit();

        //.........................................................................

        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/switch-window");

        //WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        //newTabButton.click();

        //String originalHandle = driver.getWindowHandle();

        // A for loop to iterate through the two handles and switch back to the tab that was opened originally, what
        // this for loop does is that our test will focus on switching to the second tab that's opened

        //for(String handle1: driver.getWindowHandles()){
        //    driver.switchTo().window(handle1);
       // }

        // Switch back to the original window
        //driver.switchTo().window(originalHandle);
        //driver.quit();

        //...................................................................................

        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/switch-window");

        //WebElement alertButton = driver.findElement(By.id("alert-button"));
        //alertButton.click();

        // To define a new alert object and to be able to switch to that alert
        //Alert alert = driver.switchTo().alert();

        // Inorder  to press OK
        //alert.accept();
        //driver.quit();

        //.....................................................................................

        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/modal");

        //WebElement modalButton = driver.findElement(By.id("modal-button"));
        //modalButton.click();

        //WebElement closeButton = driver.findElement(By.id("close-button"));
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();", closeButton);
        //driver.quit();

        //..............................................................................

        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/dragdrop");
        //WebElement image = driver.findElement(By.id("image"));

        //WebElement box = driver.findElement(By.id("box"));
        //Actions actions = new Actions(driver);
        //actions.dragAndDrop(image,box).build().perform();


        //driver.quit();

        //....................................................................................

        // There're three different ways of you might go about automating radio buttons, it all depends on the application and
        // the locators that are available, this shows that a radio button can be found in a variety of ways using varierty of locator
        // strategies, checkboxes can be automated just as the radio buttons.

        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://formy-project.herokuapp.com/radiobutton");

        //WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        //radioButton1.click();

        //WebElement radioButton2 = driver.findElement(By.cssSelector("input[value = 'option2']"));
        //radioButton2.click();

        //Find element by x path - what x path does shows is the path all the tag names use to get to that element radioButton3
        //WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        //radioButton3.click();
        //driver.quit();

        //........................................................................................

        // Automating a date picker
        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();
        //driver.get("https://formy-project.herokuapp.com/datepicker");

        //WebElement dateField = driver.findElement(By.id("datepicker"));
        //dateField.sendKeys("12/08/2021");
        //dateField.sendKeys(Keys.RETURN);

        //driver.quit();

        //...........................................................................................

        // Automating a dropdown menu
        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://formy-project.herokuapp.com/dropdown");

        //WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        //dropDownMenu.click();

        //WebElement automCompleteItem = driver.findElement(By.id("autocomplete"));
        //automCompleteItem.click();

        //driver.quit();

        //..............................................................................................

        // File upload
        //System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://formy-project.herokuapp.com/fileupload");

        //WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        //fileUploadField.sendKeys("3793.jpg");

        //driver.quit();


    }
}
