Feature: Computer Test
  As user I want to verify Computer products and also that they are added to shopping cart successfully

  @sanity
  Scenario: User should verify products are arranged in Alphabetical Order
  Given I am on Homepage
  When I hover mouse on Computer from TopMenu
  And I select Desktops
  And I select "value" from dropdown
  Then I verify that the products are arranged in order dispalyed
    #               Examples:
    #    |       value             |
    #  |    Name: A to Z         |
    #  |    Name: Z to A         |
    # |    Price: Low to High   |
    #|    Price: High to Low   |
    # |     Created on          |

@regression
Scenario: User should verify products are arranged in Alphabetical Order
  Given I am on Homepage
  When I hover mouse on Computer from TopMenu
  And I select Desktops
  And I select "Name: A to Z" from dropdown
  And I click on Add To Cart
  And I verify the Heading of the product
  And  I select processor
  And I Select Ram
  And I select Hdd Radio button
  And I select OS
  And I select Check box for following pages
  And I verify the price is matching
  And I verify the product is added to shopping cart
  And I close the message
  And I mouse hover to Shoppig cart
  And I click on Go to Cart
  And I verify shopping cart
  And I change the Quantity to 2
  And I  update Cart
  And I check if the cart is updated
  And I click on Terms and Conditions
  And I go to checkout
  And I verify Heading Text of checkout navigation
  And Click on Checkout as guest
  And I enter first name "Firstname"
  And I enter last name "LastName"
  And I enter email "Email"
  And I select country "country"
  And I enter city "City"
  And I enter address "Address"
  And I enter postcode "PostCode"
  And I enter phone number "PhoneNumber"
  And I click on continue
  And I select Shipping
  And I click on continue selecting shipping
  And I click on Credit Card
  And I click on Payment continue
  And I select payment method
  And I select card
  And I enter  card holders name "name"
  And I enter  card number "number"
  And I select Expiry month
  And I select Expiry year
  And I enter Cvv "CVV"
  And I click on Payment Continue on that page
  And I verify Payment Text
  And I verify Shipping Text
  And I verify Price
  And I click on confirm button
  And I verify Thank you text
  And I verify Success Text
  And I click on continue after verifying
  Then I verify Welcome Text














