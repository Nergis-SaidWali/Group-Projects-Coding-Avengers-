package GroupProject2;

public class Task4 {
        //Provide Implementation for the diagram below. Then
        //create a test class in which you need to create Objects of
        //ChromeDriver, FirefoxDrive and SafariDriver classes and
        //see which methods available to them
        public static void main(String[] args) {
            /*WebDriver[] arr={new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
            for(int i=0; i<arr.length; i++){
                arr[i].Open();
                arr[i].Close();
                arr[i].getTitle();
        }
           /* TakesScreenshot[] array={new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
            for(int i=0; i<array.length; i++){
                array[i].getScreenshot();
            }*/
            ChromeDriver obj=new ChromeDriver();
            obj.Open();
            obj.Close();
            System.out.println(obj.getTitle());
            obj.getScreenshot();
            obj.navigate();
            System.out.println("------------------------------------------------");
            FireFoxDriver obj2=new FireFoxDriver();
            obj2.Open();
            obj2.Close();
            System.out.println(obj2.getTitle());
            obj2.getScreenshot();
            obj2.navigate();
            System.out.println("------------------------------------------------");
            SafariDriver obj3=new SafariDriver();
            obj3.Open();
            obj3.Close();
            System.out.println(obj3.getTitle());
            obj3.getScreenshot();
            obj3.navigate();
    }
    }
    class Test{

    }
    interface WebDriver{
        void Open();
        void Close();
        String getTitle();
    }
    interface TakesScreenshot{
        void getScreenshot();

    }
    interface RemoteWebDriver extends WebDriver, TakesScreenshot{
        void navigate();
    }
    class ChromeDriver implements RemoteWebDriver{

        @Override
        public void Open() {
            System.out.println("Open Google Chrome");
        }

        @Override
        public void Close() {
            System.out.println("Close Google Chrome");
        }

        @Override
        public String getTitle() {
            return "Google Chrome";
        }

        @Override
        public void getScreenshot() {
            System.out.println("Get a screenshot of your Google Chrome");
        }

        @Override
        public void navigate() {
            System.out.println("Navigate to your Google Chrome");
        }
    }
    class FireFoxDriver implements RemoteWebDriver{

        @Override
        public void Open() {
            System.out.println("Open FireFox");
        }

        @Override
        public void Close() {
            System.out.println("Close FireFox");
        }

        @Override
        public String getTitle() {
            return "Firefox";
        }

        @Override
        public void getScreenshot() {
            System.out.println("Get a screenshot of your Firefox");
        }

        @Override
        public void navigate() {
            System.out.println("Navigate to your Firefox");
        }
    }
    class SafariDriver implements RemoteWebDriver{

        @Override
        public void Open() {
            System.out.println("Open Safari");
        }

        @Override
        public void Close() {
            System.out.println("Close Safari");
        }

        @Override
        public String getTitle() {
            return "Safari";
        }

        @Override
        public void getScreenshot() {
            System.out.println("Get a screenshot of your Safari Driver");
        }

        @Override
        public void navigate() {
            System.out.println("Navigate to your Safari");
        }
    }


