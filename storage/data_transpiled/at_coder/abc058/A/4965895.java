public static int a , int b , int c ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
int b = Integer . parseInt ( input . readLine ( ) ) ;
int c = Integer . parseInt ( input . readLine ( ) ) ;
if ( ( b - a ) == ( c - b ) ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return a ;
}
