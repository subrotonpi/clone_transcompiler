public static int x1 , y1 , int x2 , y2 ;
x1 = Integer . parseInt ( input . readLine ( ) ) ;
y1 = Integer . parseInt ( input . readLine ( ) ) ;
x2 = Integer . parseInt ( input . readLine ( ) ) ;
y2 = Integer . parseInt ( input . readLine ( ) ) ;
int xnum = x2 - x1 ;
int ynum = y2 - y1 ;
int x3 = x1 - ynum ;
int y3 = y1 + xnum ;
int x4 = x2 - ynum ;
int y4 = y2 + xnum ;
System . out . println ( x4 + " " + y4 + " " + x3 + " " + y3 ) ;
return x3 ;
}
