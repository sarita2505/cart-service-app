# cart-service-app
git remote add origin git@github.com:sarita2505/cart-service-app.git

git push -u origin master



## heading
```java

class Test
{

}
```

##cart-service-app
In this app. we have some microservices.
1.items-it contains fields like id,name,price,quantity,images.
2.cart-it consists accountid,itemid,status.
3.order-it consists id,total price,address
4.address-it consists address,list<address>
5.orderitemservice-it consists  all data available in cart service and also status.
 
 account microservice
 ====================
```java
class UserAccount{
String name;
int id;
String email;
String password;
}
```

itemservice
===============
```java
class items{
int id;
String name;
Double price;
int quantity;
String imageUrl;
}
```
cart service
===============
```java
class cart{
int id;
int acco;
int itemid;
String status;
}
```
address service
================
```java
class address{
int account id;
String city;
String state;
String landMark;
String houseNo;
int phoneNo;
int pin;
}
```
order service
==============
```java
class{
int id;
Double total price;
Address address;
}
```
orderitem service
==================
```java
class {
int id;
int orderid;
int cartid;
String status;
}
```




