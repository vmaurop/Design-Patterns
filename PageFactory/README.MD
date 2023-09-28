The Page Factory is a design pattern used in Selenium WebDriver 
to simplify the initialization of web elements on a web page. 
It helps in enhancing code readability, reducing code duplication, 
and making maintenance easier. The Page Factory is typically used 
in conjunction with the Page Object Model (POM).






    Annotate Elements: In your page class, you annotate the web elements using annotations from the org.openqa.selenium.support package. These annotations tell Selenium how to locate the elements on the web page. Common annotations include @FindBy, @FindBys, and @FindAll.

    Initialization: You create a constructor for the page class. Inside this constructor, you use the PageFactory.initElements method to initialize the annotated web elements. This method initializes the elements when an instance of the page class is created.

    Usage: In your test scripts, you create an instance of the page class. The annotated web elements are now ready to be used directly in your test methods.