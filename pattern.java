/*
sign +|-|epsilon
digit 0-9|epsilon
decimal .|epsilon
str :sign digit digit* str1
str1:decimal digit digit*|epsilon
optional_exponent: (E|e)(+|-|epsilon) digits|epsilon


types of exponenet no.=1e12 1.11e10 1e1.11

*/

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class strreg1
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String pattern="[+-]?[0-9]+(\\.?[0-9]+)?([Ee]?[+-]?[0-9]+)?";
//String pattern="a*b";
Pattern p=Pattern.compile(pattern);
Matcher m=p.matcher(a);
if(m.matches())
{
System.out.println("TRUE");}
else
	System.out.println("NO");
}
}