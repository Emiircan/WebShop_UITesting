package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Parent {

    public Locators() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[class='ico-login']")
    public WebElement logIn;
    @FindBy(css = "[class='email']")
    public WebElement email;
    @FindBy(css = "[class='password']")
    public WebElement password;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement login;
    @FindBy(css = "[class='ico-logout']")
    public WebElement logout;
    @FindBy(css = "[class='validation-summary-errors']")
    public WebElement unLogin;
    @FindBy(css = "div[class='result']")
    public WebElement regRes;
    @FindBy(css = "[class='ico-register']")
    public WebElement register;
    @FindBy(css = "[id='gender-male']")
    public WebElement male;
    @FindBy(css = "[id='FirstName']")
    public WebElement firstName;
    @FindBy(css = "[id='LastName']")
    public WebElement lastName;
    @FindBy(css = "[id='Email']")
    public WebElement regEmail;
    @FindBy(css = "[id='Password']")
    public WebElement regPassword;
    @FindBy(css = "[id='ConfirmPassword']")
    public WebElement regCPassword;
    @FindBy(css = "[id='register-button']")
    public WebElement Register;
    @FindBy(css = "div[class='validation-summary-errors']")
    public WebElement regResnt;
    @FindBy(css = "[class='content']")
    public WebElement gKont;
    @FindBy(css = "[href='/electronics']")
    public WebElement electronicHov;
    @FindBy(css = "[href='/cell-phones']")
    public WebElement cellPhone;
    @FindBy(css = "[class='product-title']")
    public WebElement smartPhone;
    @FindBy(css = "[value='Add to wishlist'] ")
    public WebElement addWish;
    @FindBy(css = "[class='ico-wishlist']")
    public WebElement wishlist;
    @FindBy(css = "[name='removefromcart']")
    public WebElement removeBox;
    @FindBy(css = "[value='Update wishlist']")
    public WebElement upWishlist;
    @FindBy(css = "[class='wishlist-content']")
    public WebElement wishlistKont;
    @FindBy(css = "[name='addtocart']")
    public WebElement addCartBox;
    @FindBy(css = "[value='Add to cart']")
    public WebElement addToCart;
    @FindBy(css = "[id='CountryId']")
    public WebElement county;
    @FindBy(css = "[id='termsofservice']")
    public WebElement agreeBox;
    @FindBy(css = "[id='checkout']")
    public WebElement checkOut;
    @FindBy(css = "[onclick='Billing.save()']")
    public WebElement billingSave;
    @FindBy(css = "[onclick='Shipping.save()']")
    public WebElement shippingSave;
    @FindBy(css = "[onclick='ShippingMethod.save()']")
    public WebElement shipSave;
    @FindBy(css = "[onclick='PaymentMethod.save()']")
    public WebElement paySave;
    @FindBy(css = "[onclick='PaymentInfo.save()']")
    public WebElement paymentSave;
    @FindBy(css = "[onclick='ConfirmOrder.save()']")
    public WebElement confirmSave;
    @FindBy(css = "[class='title']")
    public WebElement saveKont;
    @FindBy(css = "[href='/customer/addresses']")
    public WebElement customerAddress;
    @FindBy(css = "[value='Add new']")
    public WebElement adNewAddress;
    @FindBy(css = "[name='Address.FirstName']")
    public WebElement aFirstName;
    @FindBy(css = "[name='Address.LastName']")
    public WebElement aLastName;
    @FindBy(css = "[name='Address.Email']")
    public WebElement aEmail;
    @FindBy(css = "[name='Address.CountryId']")
    public WebElement aCountry;
    @FindBy(css = "[name='Address.City']")
    public WebElement aCity;
    @FindBy(css = "[name='Address.Address1']")
    public WebElement aAddress;
    @FindBy(css = "[name='Address.ZipPostalCode']")
    public WebElement aZipCode;
    @FindBy(css = "[name='Address.PhoneNumber']")
    public WebElement aPhoneNumber;
    @FindBy(css = "[value='Save']")
    public WebElement save;
    @FindBy(css = "[href='/cart']")
    public WebElement cart;
    @FindBy(css = "[name='updatecart']")
    public WebElement upCart;
    @FindBy(css = "[class='order-summary-content']")
    public WebElement cartKont;
    @FindBy(css = "[name='continueshopping']")
    public WebElement shoppingContinue;
    @FindBy(css = "[href='/computers']")
    public WebElement computers;
    @FindBy(css = "[href='/desktops']")
    public WebElement desktop;
    @FindBy(css = "[href='/build-your-cheap-own-computer']")
    public WebElement computer;
    @FindBy(css = "[id='product_attribute_72_5_18_65']")
    public WebElement fast;
    @FindBy(css = "[id='product_attribute_72_6_19_91']")
    public WebElement ram;
    @FindBy(css = "[id='product_attribute_72_3_20_58']")
    public WebElement hdd;
    @FindBy(css = "[id='product_attribute_72_8_30_94']")
    public WebElement software;
    @FindBy(css = "[href='/apparel-shoes']")
    public WebElement appShoes;
    @FindBy(css = "[href='/blue-and-green-sneaker']")
    public WebElement sneaker;
    @FindBy(css = "[id='product_attribute_28_7_10']")
    public WebElement sizeNo;
    @FindBy(css = "[title='Black']")
    public WebElement color;
    @FindBy(css = "[href='/jewelry']")
    public WebElement jewelry;
    @FindBy(css = "[href='/create-it-yourself-jewelry']")
    public WebElement jewel;
    @FindBy(css = "[id='product_attribute_71_9_15']")
    public WebElement material;
    @FindBy(css = "[id='product_attribute_71_10_16']")
    public WebElement length;
    @FindBy(css = "[id='product_attribute_71_11_17_50']")
    public WebElement star;
    @FindBy(css = "[value='Add to compare list']")
    public WebElement addToCompare;
    @FindBy(css = "[href='/notebooks']")
    public WebElement notebooks;
    @FindBy(css = "[href='/141-inch-laptop']")
    public WebElement laptop;
    @FindBy(css = "[class='clear-list']")
    public WebElement listClear;
    @FindBy(css = "[class='page-body']")
    public WebElement clearCont;

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "register":return register;
            case "male":return male;
            case "firstName":return firstName;
            case "lastName":return lastName;
            case "regEmail":return regEmail;
            case "regPassword":return regPassword;
            case "regCPassword":return regCPassword;
            case "Register":return Register;
            case "logIn":return logIn;
            case "email":return email;
            case "password":return password;
            case "login":return login;
            case "smartPhone":return smartPhone;
            case "wishlist":return wishlist;
            case "agreeBox":return agreeBox;
            case "checkOut":return checkOut;
            case "customerAddress":return customerAddress;
            case "adNewAddress":return adNewAddress;
            case "aFirstName":return aFirstName;
            case "aLastName":return aLastName;
            case "aEmail":return aEmail;
            case "aCity":return aCity;
            case "aAddress":return aAddress;
            case "aZipCode":return aZipCode;
            case "aPhoneNumber":return aPhoneNumber;
            case "save":return save;
            case "addToCart":return addToCart;
            case "cart":return cart;
            case "removeBox":return removeBox;
            case "upCart":return upCart;
            case "shoppingContinue":return shoppingContinue;
            case "computer":return computer;
            case "appShoes":return appShoes;
            case "sneaker":return sneaker;
            case "jewelry":return jewelry;
            case "jewel":return jewel;
            case "addToCompare":return addToCompare;
            case "laptop":return laptop;
            case "listClear":return listClear;
        }
        return null;
    }
}
