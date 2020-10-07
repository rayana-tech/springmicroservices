#### 1. Create a method depositAmount in Account Class. 
- Deposit should be successful only if account is active. 
- Balance should be increased in the method on successful deposit

#### 2. Create a class AccountTest1 with a main method. 
- Create a object of Account using parameterized Constructor.
- Deposit some amount 
- Withdraw some amount
- Display the Account Details


#### 3. Create a class named Product with the following private instance variables
    productCode of type String
    productName of type String
    productPrice of type double
    categoryCode of type char (E-electronics, A-apparels, T-toys)

  - Include a private static variable prodCounter of type int initialized to 100.
  - Create getters and setters for all variables
  - Create a private method generateProductCode which will return the product code as String. 
    - Product code is derived by concatenating categoryCode and incremented product counter.
  - Include a parameterized constructor with 3 parameters  ( productName, productPrice, categoryCode). 
    - prodCode should be assigned in constructor by using generateProductCode method. Initialize all the member variables.
  - Include an overloaded parameterized constructor with  2 parameter( productName, productPrice). 
    - prodCode should be assigned in constructor by using generateProductCode method. Category code should be assigned to ‘E’. Initialize all the member variables.
  - Include a method getProductDetails to format the product details. 
  - This method should return a String containing the product details  in the below format

        Product Code :  101, 
        Name : Laptop, 
        price : 45000.00, 
        Category : E

**Create class TestProduct with a main method to test above class**
- Create an object using the parameterized constructor with 3 parameters
- Get the product details by invoking getProductDetails and display the details
- Create another object using the parameterized constructor with 2 parameters
- Get the product details by invoking getProductDetails and display the details

#### 4. Create a class GiftCard with following private instance variables
     cardNo : long
     balance: double
     active: boolean

- Create a parameterized constructor to initialize the variables.
- Create a no-arg constructor and generate GETTERS and SETTERS for all variables
- Change the class to achieve the following
  - balance should be a read only field
  - balance should always be initialized to 0, when a new object is created
- Create a method rechargeCard which should take an amount as input and add the amount 
  to the balance. Only Active Cards can be recharged.
- Create a method swipeCard which takes amount as input and reduces the balance. Only 
  Active cards with sufficient balance can be swiped successfully

**Create a class GiftCardTest with a main method**
- Create a object of GiftCard using the parameterized Constructor.
    - Re-charge the card with 2000 
    - swipe the card with 400 and 500
    - Display object properties using Getters
- Create a object of GiftCard using no parameters. Use Setters to set the value of this 
  card.
    - Re-charge the card with 3000
    - swipe the card with 500 and 2600 
    - Display object properties using Getters
