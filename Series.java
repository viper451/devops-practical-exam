import java.util.*;
public class Series
{
public static void main(String[] args) {
double n = Double.parseDouble(System.getenv("n"));
double x = Double.parseDouble(System.getenv("x"));
double sum=1;
for(int i=2;i<=n;i++)
{
double check=(double)Math.pow(x,i);
double val=fact(i);
sum+=(check/val);
}
System.out.println(sum);
}
public static double fact(double n)
{
double value=1;
for(int i=1;i<=n;i++)
{
value=value*(double)i;
}
return value;
}
}