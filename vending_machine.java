public class vending_machine
{
  public static void main (Stringp[]args)
  {



System.out.println("lutfen sicak ve soguk arasi bir secenekte bulunun sicak icun 1 soguk icun 2 yes bas");
        Scanner hotorcold = new Scanner(System.in);         //burada scanner classindan bir obje olusturuyoz
        int sicakyadasoguk = hotorcold.nextInt();               // buradada o objecnin int oldugunu ve degiskenini atiyoz

if ( sicakyadasoguk==1)
       {
           System.out.println("cay icin 1 kahve icin 2 ye bas");
           Scanner coffeeortea = new Scanner(System.in);
           int cayyadakahve = coffeeortea.nextInt();
           if (cayyadakahve==1)
           {
               System.out.println("cay geliyo");
           }
           else if (cayyadakahve==2)
           {
               System.out.println("kahve geliyo");
           }
       }
       else if (sicakyadasoguk==2)
       {
           System.out.println("cola 1 ayran 2");
           Scanner colaayran = new Scanner(System.in);
           int colayadaayran = colaayran.nextInt();
           if (colayadaayran==1)
           {
               System.out.println("cola");
           }
           else if (colayadaayran==2)
           {
               System.out.println("ayran geliyor");
           }
       }
   } 
}      
