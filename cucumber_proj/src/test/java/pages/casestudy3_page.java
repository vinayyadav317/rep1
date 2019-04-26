package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class casestudy3_page {

	
	@FindBy(how=How.ID,using = "userName")
	public static WebElement username;
	@FindBy(how=How.ID,using = "password")
	public static WebElement password;
	@FindBy(how=How.CSS,using = "input[value='Login']")	
	public static WebElement click_login;
	
	
	//add product
		@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[1]/button/h4")
		public static WebElement click_aaaprod;
		@FindBy (how=How.ID,using = "categorydropid")
		public static WebElement prodcat_name;
		@FindBy (how=How.ID,using = "subcategorydropid")
		public static WebElement sub_cat_name;
		@FindBy (how=How.ID,using = "prodid")
		public static WebElement prod_name;
		@FindBy (how=How.ID,using = "priceid")
		public static WebElement prod_price;
		@FindBy (how=How.ID,using = "quantityid")
		public static WebElement prod_quality;
		@FindBy (how=How.ID,using = "brandid")
		public static WebElement prod_brand;
		@FindBy (how=How.ID,using = "description")
		public static WebElement prod_desc;
		@FindBy (how=How.NAME,using = "input-file-preview")
		public static WebElement prod_file;
		@FindBy(how=How.XPATH,using = "html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")
		public static WebElement click_addprod1;
}
