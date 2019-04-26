package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class casestudy1_addproduct {

	@FindBy(how=How.LINK_TEXT,using = "Home")
	public static WebElement home;
	
	//login
	@FindBy(how=How.ID,using = "userName")
	public static WebElement username;
	@FindBy(how=How.ID,using = "password")
	public static WebElement password;
	@FindBy(how=How.CSS,using = "input[value='Login']")	
	public static WebElement click_login;
	
	//adding catogary
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[2]/button/h4")
	public static WebElement click_cat;
	@FindBy (how=How.ID,using = "catgName")
	public static WebElement cat_name;
	@FindBy (how=How.ID,using = "catgDesc")
	public static WebElement cat_desc;
	@FindBy(how=How.CSS,using = "input[type='submit']")
	public static WebElement click_add;
	
	//adding subcatagory
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[3]/button/h4")
	public static WebElement click_subcat;
	@FindBy (how=How.ID,using = "subCatgId")
	public static WebElement subcat;
	@FindBy (how=How.ID,using = "subCatgName")
	public static WebElement subcat_name;
	@FindBy (how=How.ID,using = "subCatgDesc")
	//@FindBy(how=How.CSS,using = "input[placeholder=\'Sub Category description\']")	
	public static WebElement subcat_desc;
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")
	public static WebElement click_add1;
	
	
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
	
	//verification
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[4]/button/h4")
	public static WebElement click_view;
	@FindBy (how=How.ID,using = "categorydropid")
	public static WebElement cat_verify;
	@FindBy (how=How.ID,using = "subcategorydropid")
	public static WebElement subcat_verify;
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/form/table/tbody/tr/td[5]/input")
	public static WebElement click_verify;
	
	
	

}
