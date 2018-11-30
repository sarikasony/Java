
Skip Navigation
TEXTBOOK SOLUTIONS
EXPERT Q&A

Search
 
home / study / engineering / computer science / computer science questions and answers / // the purpose of the application is to help a ficticious company called jims burgers to manage ...
Question:         // The purpose of the application is to help a fictici...

        // The purpose of the application is to help a ficticious company called Jims Burgers to manage
        // their process of selling hamburgers.
        // Our application will help Jim   to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.
        // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
        // Jims store.
        // The basic hamburger should have the following items.
        // bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        // the customer can select to be added to the burger. Each one of these items gets charged an additional
        // price so you need some way to track how many items got added and to calculate the price (for the base
        // burger and all the additions).
        // This burger has a base price and the additions are all seperately priced.
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat and price.
        // Also create two extra varieties of Hamburgers (classes) to cater for
        // a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
        // The healthy burger can have a total of 6 items (Additions) in total.
        // hint: you probably want to process the 2 additional items in this new class, not the base class,
        // since the 2 additions are only appropriate for this new class.
        // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
        // hint: You have to find a way to automatically add these new additions at the time the deluxe burger
        // object is created, and then prevent other additions being made.
        // All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        // plus all additionals, each showing the addition name, and addition price, and a grand total for the
        // burger
        // For the two additional classes this may require you to be looking at the base class for pricing and
        // then adding totals onto that.
__________________
I make this program but I don't know how to
Update it to include the following:
1)	Demonstrate the use of (try, catch, finally, thorw and throws) in your program.
2)	Create a user defined runtime exception using inheritance from runtime exception class.

( java programing )



Expert Answer
Anonymous
Anonymous answered this Was this answer helpful?
1
0
638 answers
package com.test;

class SyntaxException extends RuntimeException {

public SyntaxException(String m) {

super("Invalid syntax: " + m);

}

}

public class Hamburger {

String rollType;

String meat;

double price;

String []additionalITem = new String[4];

public Hamburger(String rollType, String meat, double price) {

super();

this.rollType = rollType;

this.meat = meat;

this.price = price;

}

public double getBasePrice()

{

return price;

}

}

class Healthyburger extends Hamburger{

private String []additional = new String[2];

double price1 = 9;

double price2 = 8;

public Healthyburger(String rollType, String meat, double price) {

super(rollType, meat, price);

// TODO Auto-generated constructor stub

additional[0] = "luttac";

additional[1] = "latte";

}

public void addItem(String itemName)

{

try {

if(additional.length < 2)

additional[additional.length] = itemName;

else

throw new RuntimeException();

}

catch (Exception e) {

// TODO: handle exception

System.out.println(e);

}

finally {

System.out.println("Not able to add more item");

}

}

public double getBasePrice()

{

System.out.println("Base Price" + price);

System.out.println(additional[0] + " : " + price1);

System.out.println(additional[1] + " : " + price2);

return price+price1+price2;

}

}

class Deluxehamburger extends Hamburger{

private double chipsPrice = 10;

private double drinksPrice = 20;

public Deluxehamburger(String rollType, String meat, double price) {

super(rollType, meat, price);

// TODO Auto-generated constructor stub

addition[0] = "chips";

addition[1] = "drinks";

}

private String []addition = new String[2];

public double getBasePrice()

{

System.out.println("Base Price" + price);

System.out.println(addition[0] + " : " + chipsPrice);

System.out.println(addition[1] + " : " + drinksPrice);

return price+chipsPrice+drinksPrice;

}

}

Comment 
 
Post a question
Answers from our experts for your tough homework questions

Enter question
CONTINUE TO POST
20 questions remaining
My Textbook Solutions

Elementar...
5th Edition

Absolute...
4th Edition

Problem...
8th Edition
View all solutions
Computer Science Chegg tutors who can help right now

Ambuj R.
IIMT Engineering College Meerut
186

Sivakoti S.
Andhra University
483

Drew G.
The Ohio State University
270
FIND ME A TUTOR
ABOUT CHEGG
Media Center
College Marketing
Privacy Policy
Your CA Privacy Rights
Terms of Use
General Policies
Intellectual Property Rights
Investor Relations
Corporate Development
Enrollment Services
 
RESOURCES
Site Map
Mobile
Publishers
Join Our Affiliate Program
Advertising Choices
 
TEXTBOOK LINKS
Return Your Books
Textbook Rental
eTextbooks
Used Textbooks
Cheap Textbooks
College Textbooks
Sell Textbooks
 
STUDENT SERVICES
Chegg Play
Study 101
Chegg Coupon
Scholarships
Career Search
Internships
College Search
College Majors
Scholarship Redemption
 
COMPANY
Jobs
Customer Service
Give Us Feedback
Chegg For Good
Become a Tutor
 
LEARNING SERVICES
Online Tutoring
Chegg Study Help
Solutions Manual
Tutors by City
GPA Calculator
Test Prep
 PayPal  BBB Chegg Plants Trees
© 2003-2018 Chegg Inc. All rights reserved.

 
