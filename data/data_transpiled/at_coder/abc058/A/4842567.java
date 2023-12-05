public static int a , int b , int c ;
int a , b , c ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
if ( a - b == b - c ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return a ;
}
