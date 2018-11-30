/*Author 
 * Name:SarikaGummapu
 * ID:99999-4000
 * Project decription:Project to find rankings of the name of girl/boy in existing .txt files
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadBoyGirlNames {

public static void main(String[] args) {

//Declaring variables
String name;
int girlrank = 0, girlpopularity = 0, boyrank = 0, boypopularity = 0;
int i = 0;
int flag1 = 0, flag2 = 0;
Scanner sc = null;

//Creating Arrays
String boynames[] = new String[1000];
String girlnames[] = new String[1000];
int boyRanks[] = new int[1000];
int girlRanks[] = new int[1000];


//Reading the data from the files and populating into arrays
try {
sc = new Scanner(new File("boynames.txt"));
while (sc.hasNext()) {
boynames[i] = sc.next();
boyRanks[i] = Integer.parseInt(sc.next());
i++;
}
sc.close();
i = 0;
sc = new Scanner(new File("girlnames.txt"));
while (sc.hasNext()) {
girlnames[i] = sc.next();
girlRanks[i] = Integer.parseInt(sc.next());
i++;
}
//closing the files
sc.close();
} catch (FileNotFoundException e) {

e.printStackTrace();
}


/*
* Creating an Scanner class object which is used to get the inputs
* entered by the user
*/
sc = new Scanner(System.in);

//Getting the input entered by the user
System.out.print("Enter the name :");
name = sc.next();

//Searching for the user entered name in girls and boy names arrays
for (i = 0; i < girlnames.length; i++) {
if (name.equalsIgnoreCase(boynames[i])) {
boyrank = i;
boypopularity = boyRanks[i];
flag1 = 1;
}
if (name.equalsIgnoreCase(girlnames[i])) {
girlrank = i;
girlpopularity = girlRanks[i];
flag2 = 1;
}

}

//Displaying the output
if (flag1 == 1) {
System.out.println(name + " is ranked " + girlrank + " in popularity among girls with " + girlpopularity + " namings.");
} else {
System.out.println(name + " is not ranked among the top 1000 girl names.");
}

if (flag2 == 1) {
System.out.println(name + " is ranked " + boyrank + " in popularity among boys with " + boypopularity + " namings.");
} else {
System.out.println(name + " is not ranked among the top 1000 boy names.");
}

}

}